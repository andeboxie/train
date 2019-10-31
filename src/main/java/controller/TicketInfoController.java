package controller;

import entity.TicketInfo;
import entity.TrainInfo;
import entity.UserInfo;
import enums.RCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.TicketInfoService;
import service.TrainService;
import service.UserService;
import util.ResponseResult;

import java.util.List;

@Controller("/ticket")
public class TicketInfoController {

    @Autowired
    private TicketInfoService ticketInfoService;
    @Autowired
    private UserService userService;

    @Autowired
    private TrainService trainService;

    /**
     * 查询车票信息列表
     * @param trainInfo 对应查询的火车信息
     * @param type 1:单程 2:往返
     * @param state 1:成人 2:学生
     * @return
     */
    @GetMapping("/get/ticketInfo/list")
    @ResponseBody
    public ResponseResult<List<TicketInfo>> getTicketInfoList(TrainInfo trainInfo,Integer type,Integer state){
        ResponseResult<List<TicketInfo>> listResponseResult = new ResponseResult<List<TicketInfo>>();
        List<TicketInfo> list = ticketInfoService.selectTicketInfoList(trainInfo,type,state);
        listResponseResult.setData(list);
        return listResponseResult;
    }

    /**
     * 新增车票信息
     * @param userInfo 用户信息
     * @param trainInfo 列车信息
     * @return
     */
    @PostMapping("/inset/ticketInfo")
    @ResponseBody
    public ResponseResult insetTicketInfo(UserInfo userInfo, TrainInfo trainInfo){
        UserInfo userInfo1 = userService.selectByUserId(userInfo);
        if (userInfo1 == null)return ResponseResult.error(RCode.ACCOUNT_NOT_EXIST);//校验用户是否存在
        TrainInfo trainInfo1 = trainService.selectTrainInfoByTrainId(trainInfo);
        if(trainInfo1 == null)return ResponseResult.error(RCode.TRAIN_NOT_EXIST);//校验车辆是否存在
        try {
            ticketInfoService.insertTicketInfo(userInfo,trainInfo);
            return ResponseResult.success();
        }catch (Exception e){
            return ResponseResult.error(RCode.UNKNOWN_ERROR);
        }
    }

    /**
     * 修改车票信息
     * @param ticketInfo 修改的车票信息
     * @param type 1:退票 2:修改
     * @return
     */
    @PostMapping("/update/ticketInfo")
    @ResponseBody
    public ResponseResult updateTicketInfo(TicketInfo ticketInfo,Integer type){
        TicketInfo ticketInfo1 = ticketInfoService.selectTicketInfoByTicketId(ticketInfo);
        if(ticketInfo1 == null)return ResponseResult.error(RCode.TICKET_NOT_EXIST);
        try {
            ticketInfoService.updateTicketInfo(ticketInfo, type);
            return ResponseResult.success();
        }catch (Exception e){
            return ResponseResult.error(RCode.UNKNOWN_ERROR);
        }
    }

    /**
     * 查询单个的车票信息
     * @param ticketInfo 对应的车票查询条件
     * @return
     */
    @GetMapping("/get/ticketInfo")
    @ResponseBody
    public ResponseResult<TicketInfo> getTicketInfoList(TicketInfo ticketInfo){
        ResponseResult<TicketInfo> listResponseResult = new ResponseResult<TicketInfo>();
        TicketInfo ticketInfo1 = ticketInfoService.selectTicketInfoByTicketId(ticketInfo);
        if(ticketInfo1 == null)return ResponseResult.error(RCode.TICKET_NOT_EXIST);
        listResponseResult.setData(ticketInfo1);
        return listResponseResult;
    }

    /**
     * 改签车票
     * @param ticketInfo 改签前的车票信息
     * @param trainInfo 要改签的列车信息
     * @return
     */
    @PostMapping("/ticket/changes")
    @ResponseBody
    public ResponseResult ticketChanges(TicketInfo ticketInfo,TrainInfo trainInfo){
        TicketInfo ticketInfo1 = ticketInfoService.selectTicketInfoByTicketId(ticketInfo);
        if(ticketInfo1 == null)return ResponseResult.error(RCode.TICKET_NOT_EXIST);
        TrainInfo trainInfo1 = trainService.selectTrainInfoByTrainId(trainInfo);
        if(trainInfo1 == null) return  ResponseResult.error(RCode.TRAIN_NOT_EXIST);
        try{
            ticketInfoService.ticketChanges(ticketInfo,trainInfo);
            return ResponseResult.success();
        }catch (Exception e){
            return ResponseResult.error(RCode.UNKNOWN_ERROR);
        }
    }

    /**
     * 查询单个用户拥有的车票信息列表
     * @param userInfo 对应的用户查询信息
     * @param ticketInfo 对应的车票查询信息
     * @param trainInfo 对应的列车查询信息
     * @return
     */
    @GetMapping("/get/user/ticket/list")
    @ResponseBody
    public ResponseResult<List<TicketInfo>> getUserTicketList(UserInfo userInfo,TicketInfo ticketInfo,TrainInfo trainInfo){
        ResponseResult<List<TicketInfo>> responseResult = new ResponseResult<List<TicketInfo>>();
        List<TicketInfo> list = ticketInfoService.selectTicketInfoByUser(userInfo,ticketInfo,trainInfo);
        responseResult.setData(list);

        return responseResult;
    }

}
