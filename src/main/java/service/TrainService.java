package service;

import entity.TicketInfo;
import entity.TrainInfo;

import java.util.List;

public interface TrainService {
    TrainInfo selectTrainInfoByTrainId(TrainInfo trainInfo);

    List<TrainInfo> selectTrainInfoList(TrainInfo trainInfo);

    Integer insertTrain(TrainInfo trainInfo);

    Integer updateTrain(TrainInfo trainInfo);
}
