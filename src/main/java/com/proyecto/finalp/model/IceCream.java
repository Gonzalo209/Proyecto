package com.proyecto.finalp.model;

import java.time.LocalDate;

public class IceCream {

    private int id;
    private String nameCompany;
    private String flavor;
    private String capacity;
    private String price;

    public IceCream(int id, String nameCompany, String flavor, String capacity, String price) {

        this.id = id;
        this.nameCompany = nameCompany;
        this.flavor = flavor;
        this.capacity = capacity;
        this.price = price;
    }

    public void setId(int id) {

        this.id = id;

    }

    public void setNameCompany(String nameCompany) {

        this.nameCompany = nameCompany;

    }

    public void setFlavor(String flavor) {

        this.flavor = flavor;

    }

    public void setCapacity(String capacity) {

        this.capacity = capacity;

    }

    public void setPrice(String price) {

        this.price = price;

    }

    public int getId() {

        return id;

    }

    public String getNameCompany() {

        return nameCompany;

    }

    public String getFlavor() {

        return flavor;

    }

    public String getCapacity() {

        return capacity;

    }

    public String getPrice() {

        return price;

    }

    @Override
    public String toString() {

        return "IceCream{" +
                "id=" + id +
                ", flavor='" + flavor + '\'' +
                ", capacity='" + capacity + '\'' +
                ", price='" + price + '\'' +
                '}';

    }

}