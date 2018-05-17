package po;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Staffs {
    private String staffId;

    private String staffPassword;

    private String staffName;

    private String staffSex;

    private Date staffBirthday;
    
    private String birthday_str;

    private String staffIdcard;

    private String staffPhone;

    private String staffAddress;

    private String staffAreaid;

    private String staffEmail;

    private String staffNativePlace;

    private String staffQq;

    private Date staffEntryTime;
    
    private String entryTime_str;

    private String staffEducationLevel;

    private String staffRemark;

    private String staffState;
    
    public String getBirthday_str() {
		return birthday_str;
	}

	public void setBirthday_str(String birthday_str) {
		this.birthday_str = birthday_str;
	}

	public String getEntryTime_str() {
		return entryTime_str;
	}

	public void setEntryTime_str(String entryTime_str) {
		this.entryTime_str = entryTime_str;
	}

	public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword == null ? null : staffPassword.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public Date getStaffBirthday() {
        return staffBirthday;
    }

    public void setStaffBirthday(Date staffBirthday) {
        this.staffBirthday = staffBirthday;
    }

    public String getStaffIdcard() {
        return staffIdcard;
    }

    public void setStaffIdcard(String staffIdcard) {
        this.staffIdcard = staffIdcard == null ? null : staffIdcard.trim();
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone == null ? null : staffPhone.trim();
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress == null ? null : staffAddress.trim();
    }

    public String getStaffAreaid() {
        return staffAreaid;
    }

    public void setStaffAreaid(String staffAreaid) {
        this.staffAreaid = staffAreaid == null ? null : staffAreaid.trim();
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail == null ? null : staffEmail.trim();
    }

    public String getStaffNativePlace() {
        return staffNativePlace;
    }

    public void setStaffNativePlace(String staffNativePlace) {
        this.staffNativePlace = staffNativePlace == null ? null : staffNativePlace.trim();
    }

    public String getStaffQq() {
        return staffQq;
    }

    public void setStaffQq(String staffQq) {
        this.staffQq = staffQq == null ? null : staffQq.trim();
    }

    public Date getStaffEntryTime() {
        return staffEntryTime;
    }

    public void setStaffEntryTime(Date staffEntryTime) {
        this.staffEntryTime = staffEntryTime;
    }

    public String getStaffEducationLevel() {
        return staffEducationLevel;
    }

    public void setStaffEducationLevel(String staffEducationLevel) {
        this.staffEducationLevel = staffEducationLevel == null ? null : staffEducationLevel.trim();
    }

    public String getStaffRemark() {
        return staffRemark;
    }

    public void setStaffRemark(String staffRemark) {
        this.staffRemark = staffRemark == null ? null : staffRemark.trim();
    }

    public String getStaffState() {
        return staffState;
    }

    public void setStaffState(String staffState) {
        this.staffState = staffState == null ? null : staffState.trim();
    }
}