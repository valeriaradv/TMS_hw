package com.tms;

import java.util.Objects;

public class CarConstr {

    private String id;
    private String brand;
    private String year;
    private String country;

    public CarConstr() {
    }

    public CarConstr(String id, String brand, String year, String country) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "\nCar:" + "id : " + id + "\n" +
                "brand : " + brand + "\n" +
                "year : " + year + "\n" +
                "country : " + country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarConstr carConstr = (CarConstr) o;
        return Objects.equals(id, carConstr.id) && Objects.equals(brand, carConstr.brand) && Objects.equals(year, carConstr.year) && Objects.equals(country, carConstr.country);
    }

}