package po;

public class PileVO {

    private String pileId;

    private String pilePassword;

    private Double pileLongitude;

    private Double pileLatitude;

    private String pileAreaid;

    private String pileAddress;

    private String pileStaffid;

    private String pileStaffname;

    private String pileState;

    private String pileUseState;

    public String getPileId() {
        return pileId;
    }

    public void setPileId(String pileId) {
        this.pileId = pileId == null ? null : pileId.trim();
    }
    public String getPilePassword() { return pilePassword; }

    public void setPilePassword(String pilePassword) { this.pilePassword = pilePassword; }

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

    public String getPileState() {
        return pileState;
    }

    public void setPileState(String pileState) {
        this.pileState = pileState;
    }

    public String getPileUseState() {
        return pileUseState;
    }

    public void setPileUseState(String pileUseState) {
        this.pileUseState = pileUseState;
    }

    @Override
    public String toString() {
        return "Pile{" +
                "pileId='" + pileId + '\'' +
                ", pileLongitude=" + pileLongitude +
                ", pileLatitude=" + pileLatitude +
                ", pileAreaid='" + pileAreaid + '\'' +
                ", pileAddress='" + pileAddress + '\'' +
                ", pileStaffid='" + pileStaffid + '\'' +
                ", pileStaffname='" + pileStaffname + '\'' +
                ", pileState=" + pileState +
                ", pileUseState=" + pileUseState +
                '}';
    }
}
