package dao;


import entity.ManagerMapping;

public interface ManagerMappingMapper {
    int deleteByPrimaryKey(String ticketNum);

    int insert(ManagerMapping record);

    int insertSelective(ManagerMapping record);

    ManagerMapping selectByPrimaryKey(String ticketNum);

    int updateByPrimaryKeySelective(ManagerMapping record);

    int updateByPrimaryKey(ManagerMapping record);
}