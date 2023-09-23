package model;

public class Courier {
    private long courierId;
    private String name;
    private String phoneNumber;
    private String vehicleType;
    private String vehiclePlate;

    public Courier(long courierId, String name, String phoneNumber, String vehicleType, String vehiclePlate) {
        this.courierId = courierId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehicleType = vehicleType;
        this.vehiclePlate = vehiclePlate;
    }


    public long getCourierId() {
        return courierId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

}
