package po;

public class Admins {
    private Integer aid;

    private String aname;

    private String apass;

    private String adminname;

    private Integer adminphone;

    private String adminemail;

    private String adminpicture;

    private String adminmess;

    private Integer adminroleid;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getApass() {
        return apass;
    }

    public void setApass(String apass) {
        this.apass = apass == null ? null : apass.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public Integer getAdminphone() {
        return adminphone;
    }

    public void setAdminphone(Integer adminphone) {
        this.adminphone = adminphone;
    }

    public String getAdminemail() {
        return adminemail;
    }

    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail == null ? null : adminemail.trim();
    }

    public String getAdminpicture() {
        return adminpicture;
    }

    public void setAdminpicture(String adminpicture) {
        this.adminpicture = adminpicture == null ? null : adminpicture.trim();
    }

    public String getAdminmess() {
        return adminmess;
    }

    public void setAdminmess(String adminmess) {
        this.adminmess = adminmess == null ? null : adminmess.trim();
    }

    public Integer getAdminroleid() {
        return adminroleid;
    }

    public void setAdminroleid(Integer adminroleid) {
        this.adminroleid = adminroleid;
    }
}