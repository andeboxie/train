package dao;


import entity.PassStopInfo;

public interface PassStopInfoMapper {
    int deleteByPrimaryKey(String stopId);

    int insert(PassStopInfo record);

    int insertSelective(PassStopInfo record);

    PassStopInfo selectByPrimaryKey(String stopId);

    int updateByPrimaryKeySelective(PassStopInfo record);

    int updateByPrimaryKey(PassStopInfo record);
}