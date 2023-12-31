package model;

import java.time.LocalDate;

public class Customer {
    private long customerId;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String password;
    private long orderId;
    private double moneyAccount;
    private LocalDate registrationDate;
    private boolean customerStatus;
    public Customer(long customerId, String name, String surname, String phoneNumber, String email, String password,
                    double moneyAccount, LocalDate registrationDate) {
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.moneyAccount = moneyAccount;
        this.registrationDate = registrationDate;
    }

    public long getCustomerId() {
        return customerId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getOrderId() {
        return orderId;
    }

    public double getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(double moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

}
