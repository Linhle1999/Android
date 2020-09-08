package com.example.module22bt5;

public class EmployeePartTime extends Employee{
    @Override
    public String tinhLuong() {
        return "150";
    }

    @Override
    public String toString() {
        return super.toString() + " --> Part time = " + tinhLuong();
    }
}
