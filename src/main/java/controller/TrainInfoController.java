package controller;

import entity.TrainInfo;
import enums.RCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.TrainService;
import util.ResponseResult;

import java.util.List;

@Controller("/trainInfo")
public class TrainInfoController {

    @Autowired
    private TrainService trainService;

    /**
     * 查询列车列表
     * @param trainInfo 对应查询的列车信息
     * @return
     */
    @GetMapping("/get/train/list")
    @ResponseBody
    public ResponseResult<List<TrainInfo>> getTrainList(TrainInfo trainInfo){
        ResponseResult<List<TrainInfo>> responseResult = new ResponseResult<List<TrainInfo>>();
        List<TrainInfo> list = trainService.selectTrainInfoList(trainInfo);
        responseResult.setData(list);
        return responseResult;
    }

    /**
     * 新增列车信息
     * @param trainInfo 对应要新增的列车信息
     * @return
     */
    @PostMapping("/insert/train")
    @ResponseBody
    public ResponseResult insertTrain(TrainInfo trainInfo){
        TrainInfo trainInfo1 = trainService.selectTrainInfoByTrainId(trainInfo);
        if(trainInfo1 != null)return ResponseResult.error(RCode.TRAIN_EXIST);
        try {
            trainService.insertTrain(trainInfo);
            return ResponseResult.success();
        }catch (Exception e){
            return ResponseResult.error(RCode.UNKNOWN_ERROR);
        }
    }

    /**
     * 修改列车信息
     * @param trainInfo 对应要修改的列车信息
     * @return
     */
    @PostMapping("/update/train")
    @ResponseBody
    public ResponseResult updateTrain(TrainInfo trainInfo){
        TrainInfo trainInfo1 = trainService.selectTrainInfoByTrainId(trainInfo);
        if(trainInfo1 == null)return ResponseResult.error(RCode.TICKET_NOT_EXIST);
        try {
            trainService.updateTrain(trainInfo);
            return ResponseResult.success();
        }catch (Exception e){
            return ResponseResult.error(RCode.UNKNOWN_ERROR);
        }
    }

}
