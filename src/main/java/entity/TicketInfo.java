package entity;

import java.util.Date;

/**
 * 车票的详细信息表
 */
public class TicketInfo {

    //票号
    private String ticketId;

    //车厢号
    private String carNumber;

    //座号
    private String seatNumber;

    //火车车次
    private String trainId;

    //日期
    private Date tDate;

    //座位类型
    private String seatType;

    //状态是否出售
    private String ticketState;

    //身份证号
    private String IdNo;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public Date gettDate() {
        return tDate;
    }

    public void settDate(Date tDate) {
        this.tDate = tDate;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getTicketState() {
        return ticketState;
    }

    public void setTicketState(String ticketState) {
        this.ticketState = ticketState;
    }

    public String getIdNo() {
        return IdNo;
    }

    public void setIdNo(String idNo) {
        IdNo = idNo;
    }

    @Override
    public String toString() {
        return "TicketInfo{" +
                "ticketId='" + ticketId + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", trainId='" + trainId + '\'' +
                ", tDate=" + tDate +
                ", seatType='" + seatType + '\'' +
                ", ticketState='" + ticketState + '\'' +
                ", IdNo='" + IdNo + '\'' +
                '}';
    }
}
