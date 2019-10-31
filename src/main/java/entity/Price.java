package entity;

/**
 * 各类火车与各类座位对应的单价表
 */
public class Price {

    //单价编号
    private String priceId;

    //火车类型
    private String trainType;

    //座位类型
    private String seatType;

    //每公里的运费
    private Double perprice;

    public String getPriceId() {
        return priceId;
    }

    public void setPriceId(String priceId) {
        this.priceId = priceId;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public Double getPerprice() {
        return perprice;
    }

    public void setPerprice(Double perprice) {
        this.perprice = perprice;
    }

    @Override
    public String toString() {
        return "price{" +
                "priceId='" + priceId + '\'' +
                ", trainType='" + trainType + '\'' +
                ", seatType='" + seatType + '\'' +
                ", perprice=" + perprice +
                '}';
    }
}
