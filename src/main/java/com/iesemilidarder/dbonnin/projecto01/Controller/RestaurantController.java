package com.iesemilidarder.dbonnin.projecto01.Controller;

public class RestaurantController {
    private String resPais;
    private String resName;
    private Double resPrice;
    private Integer resEstrellas;

    public String getResPais() { return resPais; }
    public void setResPais(String resPais) { this.resPais = resPais; }

    public String getResName() { return resName; }
    public void setResName(String resName) { this.resName = resName; }

    public Double getResPrice() { return resPrice; }
    public void setResPrice(Double resPrice) { this.resPrice = resPrice; }

    public Integer getResEstrellas() { return resEstrellas; }
    public void setResEstrellas(Integer resEstrellas) { this.resEstrellas = resEstrellas; }
}
