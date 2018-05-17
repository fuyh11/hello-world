package po;

public class Car {
    private String carId;

    private String carPhone;

    private String carOwner;

    private Byte carState;

    private String carState_str;

    public String getCarState_str() {
        return carState_str;
    }

    public void setCarState_str(String carState_str) {
        this.carState_str = carState_str;
    }


    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getCarPhone() {
        return carPhone;
    }

    public void setCarPhone(String carPhone) {
        this.carPhone = carPhone == null ? null : carPhone.trim();
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner == null ? null : carOwner.trim();
    }

    public Byte getCarState() {
        return carState;
    }

    public void setCarState(Byte carState) {
        this.carState = carState;
    }
}