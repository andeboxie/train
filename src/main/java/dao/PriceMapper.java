package dao;


import entity.Price;

public interface PriceMapper {
    int deleteByPrimaryKey(String priceId);

    int insert(Price record);

    int insertSelective(Price record);

    Price selectByPrimaryKey(String priceId);

    int updateByPrimaryKeySelective(Price record);

    int updateByPrimaryKey(Price record);
}