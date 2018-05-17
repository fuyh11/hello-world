package po;

import java.math.BigDecimal;
import java.util.Date;

public class Charge {
    private Integer chargeId;

    private String userPhone;

    private BigDecimal chargeMoney;

    private BigDecimal userBalance;

    private Date chargeDate;

    private String chargedate_str;

    private String chargeMethod;

    public Integer getChargeId() {
        return chargeId;
    }

    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public BigDecimal getChargeMoney() {
        return chargeMoney;
    }

    public void setChargeMoney(BigDecimal chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    public BigDecimal getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }

    public Date getChargeDate() {
        return chargeDate;
    }

    public void setChargeDate(Date chargeDate) {
        this.chargeDate = chargeDate;
    }

    public String getChargedate_str() { return chargedate_str; }

    public void setChargedate_str(String chargedate_str) { this.chargedate_str = chargedate_str; }

    public String getChargeMethod() {
        return chargeMethod;
    }

    public void setChargeMethod(String chargeMethod) {
        this.chargeMethod = chargeMethod == null ? null : chargeMethod.trim();
    }
}