package dao;


import entity.TicketInfo;
import entity.TrainInfo;
import entity.UserInfo;

import java.util.List;

public interface TicketInfoMapper {
    int deleteByPrimaryKey(String ticketId);

    int insert(TicketInfo record);

    int insertSelective(TicketInfo record);

    TicketInfo selectByPrimaryKey(String ticketId);

    int updateByPrimaryKeySelective(TicketInfo record);

    int updateByPrimaryKey(TicketInfo record);

    List<TicketInfo> selectTicketInfoList(TrainInfo trainInfo, Integer type, Integer state);

    List<TicketInfo> selectTicketInfoByUser(UserInfo userInfo, TicketInfo ticketInfo, TrainInfo trainInfo);
}