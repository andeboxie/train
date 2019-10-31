package service;

import entity.TicketInfo;
import entity.TrainInfo;
import entity.UserInfo;

import java.util.List;

public interface TicketInfoService {

    List<TicketInfo> selectTicketInfoList(TrainInfo trainInfo, Integer type, Integer state);

    Integer insertTicketInfo(UserInfo userInfo, TrainInfo trainInfo);

    TicketInfo selectTicketInfoByTicketId(TicketInfo ticketInfo);

    Integer updateTicketInfo(TicketInfo ticketInfo, Integer type);

    Integer ticketChanges(TicketInfo ticketInfo, TrainInfo trainInfo);

    List<TicketInfo> selectTicketInfoByUser(UserInfo userInfo, TicketInfo ticketInfo, TrainInfo trainInfo);
}
