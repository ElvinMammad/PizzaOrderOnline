package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private  String name;
    private  String location;
    private  double totalAmount;
    private List<Order> orderList;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
        this.totalAmount =0.0;
        this.orderList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTotalAmount() {
        return totalAmount;
    }


    public List<Order> getOrderList() {
        return orderList;
    }

}
