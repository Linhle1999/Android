package com.example.module22bt5;

public abstract class Employee {
    private String maNV;
    private String tenNV;

    public Employee() {

    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    @Override
    public String toString() {
        return getMaNV() + " - " + getTenNV();
    }
    public abstract String tinhLuong();
}
