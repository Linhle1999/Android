package com.example.module23bt1;

public class NhanVien {
    private String tenNV;
    private String maNV;
    private String gioiTinh;

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
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
}
