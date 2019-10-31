package dao;


import entity.TrainInfo;

import java.util.List;

public interface TrainInfoMapper {
    int deleteByPrimaryKey(String trainId);

    int insert(TrainInfo record);

    int insertSelective(TrainInfo record);

    TrainInfo selectByPrimaryKey(String trainId);

    int updateByPrimaryKeySelective(TrainInfo record);

    int updateByPrimaryKey(TrainInfo record);

    List<TrainInfo> selectTrainInfoList(TrainInfo trainInfo);
}