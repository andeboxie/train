package dao;


import entity.ManagerInfo;

public interface ManagerInfoMapper {
    int deleteByPrimaryKey(String workId);

    int insert(ManagerInfo record);

    int insertSelective(ManagerInfo record);

    ManagerInfo selectByPrimaryKey(String workId);

    int updateByPrimaryKeySelective(ManagerInfo record);

    int updateByPrimaryKey(ManagerInfo record);
}