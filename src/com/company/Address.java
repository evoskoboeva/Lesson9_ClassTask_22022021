package com.company;

import java.util.Objects;

public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;


    @Override
    public String toString() {
        return "Address{" +
                "index=" + (this.index < 0 ? "incorrect index" : this.index) +
                ", country='" + this.country + '\'' +
                ", city='" + this.city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

    private String ConstCountryCity(String name) {
        String[] constr = name.split("\s");
        String result = "";
        for (int i = 0; i < constr.length; i++) {
            result += constr[i].substring(0, 1).toUpperCase() + constr[i].substring(1).toLowerCase() + " ";
        }
        return result;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return getIndex() == address.getIndex() && Objects.equals(getCountry(), address.getCountry()) && Objects.equals(getCity(), address.getCity()) && Objects.equals(getStreet(), address.getStreet()) && Objects.equals(getHouse(), address.getHouse()) && Objects.equals(getApartment(), address.getApartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIndex(), getCountry(), getCity(), getStreet(), getHouse(), getApartment());
    }

    public void setIndex(int index) {
        if (index > 0 && index < 100000) {
            this.index = index;
        } else this.index = -1;

    }

    public void setCountry(String country) {
        this.country = ConstCountryCity(country);
    }

    public void setCity(String city) {
        this.city = ConstCountryCity(city);
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getApartment() {
        return apartment;
    }

    public Address(int index, String country, String city, String street, String house) {
        this.setIndex(index);
        this.setCountry(country);
        this.setCity(city);
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }
}
