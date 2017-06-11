package com.skeight.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mgustran on 11/06/2017.
 */

@Entity
@Table(name="orders")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "name")
    private String name;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "email")
    private String email;

    @Column(name = "ccard")
    private double ccard;

    @Column(name = "cvc")
    private int cvc;

    @Column(name = "month_card")
    private int monthCard;

    @Column(name = "year_card")
    private int yearCard;

    @Column(name = "address")
    private String address;

    @Column(name = "location")
    private String location;

    @Column(name = "country")
    private String country;

    @Column(name = "postal_code")
    private int postalCode;

    @Column(name = "quantities")
    private String quantities;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name = "total_tax")
    private double totalTax;


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCcard() {
        return ccard;
    }

    public void setCcard(double ccard) {
        this.ccard = ccard;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public int getMonthCard() {
        return monthCard;
    }

    public void setMonthCard(int monthCard) {
        this.monthCard = monthCard;
    }

    public int getYearCard() {
        return yearCard;
    }

    public void setYearCard(int yearCard) {
        this.yearCard = yearCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getQuantities() {
        return quantities;
    }

    public void setQuantities(String quantities) {
        this.quantities = quantities;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }
}
