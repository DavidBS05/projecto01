package com.iesemilidarder.dbonnin.projecto01.data;

public abstract class Product {
    private String geographicalPoint;
    private String company;
    private String activityKind;

    public String getGeographicalPoint() { return geographicalPoint; }
    public void setGeographicalPoint(String geographicalPoint) {
        this.geographicalPoint = geographicalPoint;
    }

    public String getCompany() { return company; }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getActivityKind() { return activityKind; }
    public void setActivityKind(String activityKind) {
        this.activityKind = activityKind;
    }
}
