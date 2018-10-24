package com.iesemilidarder.dbonnin.projecto01;

public abstract class Product {
    private String geographicalPoint;
    private String company;
    private String activityKind;
    private String resPais;
    private String resName;
    private Double resPrice;
    private Integer resEstrellas;

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

    public String getResPais() { return resPais; }
    public void setResPais(String resPais) { this.resPais = resPais; }

    public String getResName() { return resName; }
    public void setResName(String resName) { this.resName = resName; }

    public Double getResPrice() { return resPrice; }
    public void setResPrice(Double resPrice) { this.resPrice = resPrice; }

    public Integer getResEstrellas() { return resEstrellas; }
    public void setResEstrellas(Integer resEstrellas) { this.resEstrellas = resEstrellas; }
}
