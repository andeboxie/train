package service.impl;

import dao.TicketInfoMapper;
import entity.TicketInfo;
import entity.TrainInfo;
import entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.TicketInfoService;

import java.util.List;

@Service("ticketInfoService")
public class TicketInfoServiceImpl implements TicketInfoService {

    @Autowired
    private TicketInfoMapper ticketInfoMapper;

    public List<TicketInfo> selectTicketInfoList(TrainInfo trainInfo, Integer type, Integer state) {
        return ticketInfoMapper.selectTicketInfoList(trainInfo,type,state);
    }

    public Integer insertTicketInfo(UserInfo userInfo, TrainInfo trainInfo) {
        TicketInfo ticketInfo = new TicketInfo();
        ticketInfo.setCarNumber(ticketInfo.getCarNumber());
        ticketInfo.setTicketId(trainInfo.getTrainId());
        int row = ticketInfoMapper.insertSelective(ticketInfo);
        if(row==1)return row;
        throw new RuntimeException();
    }

    public TicketInfo selectTicketInfoByTicketId(TicketInfo ticketInfo) {
        return ticketInfoMapper.selectByPrimaryKey(ticketInfo.getTicketId());
    }

    public Integer updateTicketInfo(TicketInfo ticketInfo, Integer type) {
        int row = 0;
        switch (type){
            case 1:
                row = ticketInfoMapper.updateByPrimaryKeySelective(ticketInfo);
                if(row==1)return row;
                throw new RuntimeException();
            case 2:
                row = ticketInfoMapper.updateByPrimaryKeySelective(ticketInfo);
                if(row==1)return row;
                throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    public Integer ticketChanges(TicketInfo ticketInfo, TrainInfo trainInfo) {
        ticketInfo.setCarNumber(ticketInfo.getCarNumber());
        int row = ticketInfoMapper.updateByPrimaryKeySelective(ticketInfo);
        if(row==1)return row;
        throw new RuntimeException();
    }

    public List<TicketInfo> selectTicketInfoByUser(UserInfo userInfo, TicketInfo ticketInfo, TrainInfo trainInfo) {
        return ticketInfoMapper.selectTicketInfoByUser(userInfo,ticketInfo,trainInfo);
    }
}
