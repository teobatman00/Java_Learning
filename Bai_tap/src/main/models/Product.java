package main.models;

import java.time.LocalDate;

public class Product {
    private String proId;
    private String proName;
    private int proQuantity;
    private boolean proStatus;
    private double proPrice;
    private LocalDate proMfgDate;

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getProQuantity() {
        return proQuantity;
    }

    public void setProQuantity(int proQuantity) {
        this.proQuantity = proQuantity;
    }

    public boolean isProStatus() {
        return proStatus;
    }

    public void setProStatus(boolean proStatus) {
        this.proStatus = proStatus;
    }

    public double getProPrice() {
        return proPrice;
    }

    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }

    public LocalDate getProMfgDate() {
        return proMfgDate;
    }

    public void setProMfgDate(LocalDate proMfgDate) {
        this.proMfgDate = proMfgDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId='" + proId + '\'' +
                ", proName='" + proName + '\'' +
                ", proQuantity=" + proQuantity +
                ", proStatus=" + proStatus +
                ", proPrice=" + proPrice +
                ", proMfgDate=" + proMfgDate +
                '}';
    }


}
