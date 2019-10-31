package entity;

/**
 * 系统管理员信息表
 */
public class ManagerInfo {

    //管理员工作编号
    private String workId;

    //管理员姓名
    private String workName;

    //管理员账户
    private String workAccount;

    //账户密码
    private String workPwd;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkAccount() {
        return workAccount;
    }

    public void setWorkAccount(String workAccount) {
        this.workAccount = workAccount;
    }

    public String getWorkPwd() {
        return workPwd;
    }

    public void setWorkPwd(String workPwd) {
        this.workPwd = workPwd;
    }

    @Override
    public String toString() {
        return "ManagerInfo{" +
                "workId='" + workId + '\'' +
                ", workName='" + workName + '\'' +
                ", workAccount='" + workAccount + '\'' +
                ", workPwd='" + workPwd + '\'' +
                '}';
    }
}
