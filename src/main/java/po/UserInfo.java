package po;

public class UserInfo {
    private String userPhone;

    private String userId;

    private String userPassword;

    private String userName;

    private Byte userIsVip;

    private String userVip;

    private Long userBalance;

    private Byte userLockState;

    private String userLock;

    private Byte userAuthentication;

    private String userAuthen;

    public String getUserVip() {
        return userVip;
    }

    public void setUserVip(String userVip) {
        this.userVip = userVip;
    }

    public String getUserLock() {
        return userLock;
    }

    public void setUserLock(String userLock) {
        this.userLock = userLock;
    }

    public String getUserAuthen() {
        return userAuthen;
    }

    public void setUserAuthen(String userAuthen) {
        this.userAuthen = userAuthen;
    }



    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Byte getUserIsVip() {
        return userIsVip;
    }

    public void setUserIsVip(Byte userIsVip) {
        this.userIsVip = userIsVip;
    }

    public Long getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Long userBalance) {
        this.userBalance = userBalance;
    }

    public Byte getUserLockState() {
        return userLockState;
    }

    public void setUserLockState(Byte userLockState) {
        this.userLockState = userLockState;
    }

    public Byte getUserAuthentication() {
        return userAuthentication;
    }

    public void setUserAuthentication(Byte userAuthentication) {
        this.userAuthentication = userAuthentication;
    }
}