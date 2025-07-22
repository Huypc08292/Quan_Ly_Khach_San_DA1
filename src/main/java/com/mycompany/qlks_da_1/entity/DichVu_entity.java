/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlks_da_1.entity;

/**
 *
 * @author ASUS
 */
public class DichVu_entity {
    private String maDV;
    private String tenDV;
    private double donGia;
    private String moTa;

    public DichVu_entity() {
    }

    public DichVu_entity(String maDV, String tenDV, double donGia, String moTa) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.donGia = donGia;
        this.moTa = moTa;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "DichVu_entity{" + "maDV=" + maDV + ", tenDV=" + tenDV + ", donGia=" + donGia + ", moTa=" + moTa + '}';
    }
    
    
    
    
}

