package com.iesemilidarder.dbonnin.projecto01.data;

public class Activity extends Product {
    private String country;
    private String area;
    private String municipality;
    private String place;
    private String typeActivity;
    private String name;
    private String duration;

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public String getMunicipality() { return municipality; }
    public void setMunicipality(String municipality) { this.municipality = municipality; }

    public String getPlace() { return place; }
    public void setPlace(String place) { this.place = place; }

    public String getTypeActivity() { return typeActivity; }
    public void setTypeActivity(String typeActivity) { this.typeActivity = typeActivity; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
}
