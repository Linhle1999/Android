package com.example.module23bt2;

public class Product {
    private String maSP;
    private Category loaiSP;
    private String tenSP;

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public Category getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(Category loaiSP) {
        this.loaiSP = loaiSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Product(String maSP, Category loaiSP, String tenSP) {
        this.maSP = maSP;
        this.loaiSP = loaiSP;
        this.tenSP = tenSP;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSP='" + maSP + '\'' +
                ", loaiSP=" + loaiSP +
                ", tenSP='" + tenSP + '\'' +
                '}';
    }
}
