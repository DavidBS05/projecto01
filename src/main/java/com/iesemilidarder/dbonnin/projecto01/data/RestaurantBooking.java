package com.iesemilidarder.dbonnin.projecto01.data;

public class RestaurantBooking extends Product {
    private String country;
    private String name;
    private Double price;
    private Integer stars;

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public Integer getStars() { return stars; }
    public void setStars(Integer stars) { this.stars = stars; }
}

