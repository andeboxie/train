package service.impl;

import dao.TrainInfoMapper;
import entity.TrainInfo;
import org.springframework.beans.factory.annotation.Autowired;
import service.TrainService;

import java.util.List;

public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainInfoMapper trainInfoMapper;

    public TrainInfo selectTrainInfoByTrainId(TrainInfo trainInfo) {
        return trainInfoMapper.selectByPrimaryKey(trainInfo.getTrainId());
    }

    public List<TrainInfo> selectTrainInfoList(TrainInfo trainInfo) {
        return trainInfoMapper.selectTrainInfoList(trainInfo);
    }

    public Integer insertTrain(TrainInfo trainInfo) {
        int row = trainInfoMapper.insert(trainInfo);
        if(row==1)return row;
        throw new RuntimeException();
    }

    public Integer updateTrain(TrainInfo trainInfo) {
        int row = trainInfoMapper.updateByPrimaryKeySelective(trainInfo);
        if(row==1)return row;
        throw new RuntimeException();
    }
}
