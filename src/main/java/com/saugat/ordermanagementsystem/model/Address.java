package com.saugat.ordermanagementsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "address")
public class Address extends AbstractEntity {

    @Column(name = "street", nullable = false)
    private String street;
    @Column(name = "apt", nullable = true, length = 20)
    private String apt;
    @Column(name = "building", nullable = true, length = 20)
    private String building;
    @Column(name = "city", nullable = false, length = 50)
    private String city;
    @Column(name = "state", nullable = false, length = 50)
    private String state;
    @Column(name = "zip", nullable = false, length = 10)
    private String zip;
    @Column(name = "landmark", nullable = true)
    private String landmark;
    @Column(name = "country", nullable = false, length = 100)
    private String country;

    public Address() {
    }

    public Address(String street, String apt, String building, String city, String state, String zip, String landmark, String country) {
        this.street = street;
        this.apt = apt;
        this.building = building;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.landmark = landmark;
        this.country = country;
    }

    public Address(Long id, String street, String apt, String building, String city, String state, String zip, String landmark, String country) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) && Objects.equals(apt, address.apt) && Objects.equals(building, address.building) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(zip, address.zip) && Objects.equals(landmark, address.landmark) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, apt, building, city, state, zip, landmark, country);
    }

    @Override
    public String toString() {
        return "id: "+ super.getId();
    }
}

