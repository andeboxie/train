package entity;

/**
 * 火车信息表
 */
public class TrainInfo {

    //火车车次ID
    private String trainId;

    //该车始发站
    private String startStop;

    //该车发车时间
    private String startTime;

    //该车终点站
    private String endStop;

    //该车到站时间
    private String endTime;

    //该车总里程
    private Integer totalLegend;

    //火车类型
    private String trainType;

    //火车线路信息
    private String lineInfo;

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getStartStop() {
        return startStop;
    }

    public void setStartStop(String startStop) {
        this.startStop = startStop;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndStop() {
        return endStop;
    }

    public void setEndStop(String endStop) {
        this.endStop = endStop;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getTotalLegend() {
        return totalLegend;
    }

    public void setTotalLegend(Integer totalLegend) {
        this.totalLegend = totalLegend;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getLineInfo() {
        return lineInfo;
    }

    public void setLineInfo(String lineInfo) {
        this.lineInfo = lineInfo;
    }

    @Override
    public String toString() {
        return "TrainInfo{" +
                "trainId='" + trainId + '\'' +
                ", startStop='" + startStop + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endStop='" + endStop + '\'' +
                ", endTime='" + endTime + '\'' +
                ", totalLegend=" + totalLegend +
                ", trainType='" + trainType + '\'' +
                ", lineInfo='" + lineInfo + '\'' +
                '}';
    }


}
