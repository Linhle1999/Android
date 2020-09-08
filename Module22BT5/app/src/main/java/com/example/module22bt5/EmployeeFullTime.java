package com.example.module22bt5;

public class EmployeeFullTime extends  Employee{

    @Override
    public String tinhLuong() {
        return "500";
    }

    @Override
    public String toString() {
        return super.toString() + " --> Full time = " + tinhLuong();
    }
}
