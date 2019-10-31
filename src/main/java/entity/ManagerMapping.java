package entity;

import java.util.Date;

/**
 * 管理员与车票联系表
 */
public class ManagerMapping {

    //票号
    private String ticketNum;

    //管理员工作编号
    private String workId;

    //管理员记录售票时间
    private Date sellTime;

    //记录售票地点
    private String sellAdd;

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public Date getSellTime() {
        return sellTime;
    }

    public void setSellTime(Date sellTime) {
        this.sellTime = sellTime;
    }

    public String getSellAdd() {
        return sellAdd;
    }

    public void setSellAdd(String sellAdd) {
        this.sellAdd = sellAdd;
    }

    @Override
    public String toString() {
        return "Managermapping{" +
                "ticketNum='" + ticketNum + '\'' +
                ", workId='" + workId + '\'' +
                ", sellTime=" + sellTime +
                ", sellAdd='" + sellAdd + '\'' +
                '}';
    }
}
