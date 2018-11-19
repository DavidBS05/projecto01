package com.iesemilidarder.dbonnin.projecto01.data;

import java.util.UUID;

public abstract class Product {
    private UUID id = UUID.randomUUID();
    private String geographicalPoint;
    private String company;
    private String activityKind;

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    private String getProduct() { return null; }

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
