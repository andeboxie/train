package entity;

/**
 * 经过站信息表
 */
public class PassStopInfo {

    //站点编号
    private String stopID;

    //经过站点
    private String passStop;

    //火车车次
    private String trainId;

    //到该站的时间
    private String arriveTime;

    //在该站的停留时间
    private String stayTime;

    //该站与该车始发站之间的里程
    private Integer legend;

    public String getStopID() {
        return stopID;
    }

    public void setStopID(String stopID) {
        this.stopID = stopID;
    }

    public String getPassStop() {
        return passStop;
    }

    public void setPassStop(String passStop) {
        this.passStop = passStop;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getStayTime() {
        return stayTime;
    }

    public void setStayTime(String stayTime) {
        this.stayTime = stayTime;
    }

    public Integer getLegend() {
        return legend;
    }

    public void setLegend(Integer legend) {
        this.legend = legend;
    }

    @Override
    public String toString() {
        return "PassStopInfo{" +
                "stopID='" + stopID + '\'' +
                ", passStop='" + passStop + '\'' +
                ", trainId='" + trainId + '\'' +
                ", arriveTime='" + arriveTime + '\'' +
                ", stayTime='" + stayTime + '\'' +
                ", legend=" + legend +
                '}';
    }
}
