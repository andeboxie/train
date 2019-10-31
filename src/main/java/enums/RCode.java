package enums;

public enum RCode {
    SUCCESS(1,"SUCCESS","成功"),
    LOGIN_ERROR(2,"LOGIN ERROR","登录失败,账号或密码错误"),
    ACCOUNT_EXIST(3,"ACCOUNT EXIST","账号已存在!"),
    INCORRECT_PASSWORD_FORMAT(4,"INCORRECT PASSWORD FORMAT","密码格式不正确"),
    ACCOUNT_NOT_EXIST(5,"ACCOUNT NOT EXIST","用户不存在"),
    TRAIN_NOT_EXIST(6,"TRAIN NOT EXIST","列车不存在"),
    TICKET_NOT_EXIST(7,"TICKET NOT EXIST","车票不存在"),
    TRAIN_EXIST(8,"TRAIN EXIST","该车次已存在"),
    UNKNOWN_ERROR(9999,"UNKNOWN ERROE","未知错误");


    private Integer code;

    private String meg;

    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "RCode{" +
                "code=" + code +
                ", meg='" + meg + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    RCode() {
    }

    RCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    RCode(Integer code, String meg, String message) {
        this.code = code;
        this.meg = meg;
        this.message = message;
    }

    public static RCode searchByCode(Integer theCode) {
        for (RCode mmCode : values()) {
            if (mmCode.getCode().equals(theCode)) {
                return mmCode;
            }
        }
        return UNKNOWN_ERROR;
    }

}
