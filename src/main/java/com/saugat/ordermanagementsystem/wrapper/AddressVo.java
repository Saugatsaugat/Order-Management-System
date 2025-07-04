package com.saugat.ordermanagementsystem.wrapper;

import org.springframework.stereotype.Component;

@Component
public class AddressVo extends AbstractEntityVo{

    private String street;
    private String apt;
    private String building;
    private String city;
    private String state;
    private String zip;
    private String landmark;
    private String country;

    public AddressVo() {
    }

    public AddressVo(String street, String apt, String building, String city, String state, String zip, String landmark, String country) {
        this.street = street;
        this.apt = apt;
        this.building = building;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.landmark = landmark;
        this.country = country;
    }

    public AddressVo(Long id, String street, String apt, String building, String city, String state, String zip, String landmark, String country) {
        super.setId(id);
        this.street = street;
        this.apt = apt;
        this.building = building;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.landmark = landmark;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
