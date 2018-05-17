package po;

public class Pile {
    private String pileId;

    private String pilePassword;

    private Double pileLongitude;

    private Double pileLatitude;

    private String pileAreaid;

    private String pileAddress;

    private String pileStaffid;

    private String pileStaffname;

    private Byte pileState;

    private String statestr;

    private Byte pileUseState;

    private String usestatestr;

    public String getPileId() {
        return pileId;
    }

    public void setPileId(String pileId) {
        this.pileId = pileId == null ? null : pileId.trim();
    }

    public String getPilePassword() {
        return pilePassword;
    }

    public void setPilePassword(String pilePassword) {
        this.pilePassword = pilePassword == null ? null : pilePassword.trim();
    }
    public String getStatestr() { return statestr; }

    public void setStatestr(String statestr) { this.statestr = statestr; }

    public String getUsestatestr() { return usestatestr; }

    public void setUsestatestr(String usestatestr) { this.usestatestr = usestatestr; }
    public Double getPileLongitude() {
        return pileLongitude;
    }

    public void setPileLongitude(Double pileLongitude) {
        this.pileLongitude = pileLongitude;
    }

    public Double getPileLatitude() {
        return pileLatitude;
    }

    public void setPileLatitude(Double pileLatitude) {
        this.pileLatitude = pileLatitude;
    }

    public String getPileAreaid() {
        return pileAreaid;
    }

    public void setPileAreaid(String pileAreaid) {
        this.pileAreaid = pileAreaid == null ? null : pileAreaid.trim();
    }

    public String getPileAddress() {
        return pileAddress;
    }

    public void setPileAddress(String pileAddress) {
        this.pileAddress = pileAddress == null ? null : pileAddress.trim();
    }

    public String getPileStaffid() {
        return pileStaffid;
    }

    public void setPileStaffid(String pileStaffid) {
        this.pileStaffid = pileStaffid == null ? null : pileStaffid.trim();
    }

    public String getPileStaffname() {
        return pileStaffname;
    }

    public void setPileStaffname(String pileStaffname) {
        this.pileStaffname = pileStaffname == null ? null : pileStaffname.trim();
    }

    public Byte getPileState() {
        return pileState;
    }

    public void setPileState(Byte pileState) {
        this.pileState = pileState;
    }

    public Byte getPileUseState() {
        return pileUseState;
    }

    public void setPileUseState(Byte pileUseState) {
        this.pileUseState = pileUseState;
    }

    @Override
    public String toString() {
        return "Pile{" +
                "pileId='" + pileId + '\'' +
                ", pilePassword='" + pilePassword + '\'' +
                ", pileLongitude=" + pileLongitude +
                ", pileLatitude=" + pileLatitude +
                ", pileAreaid='" + pileAreaid + '\'' +
                ", pileAddress='" + pileAddress + '\'' +
                ", pileStaffid='" + pileStaffid + '\'' +
                ", pileStaffname='" + pileStaffname + '\'' +
                ", pileState=" + pileState +
                ", statestr='" + statestr + '\'' +
                ", pileUseState=" + pileUseState +
                ", usestatestr='" + usestatestr + '\'' +
                '}';
    }
}