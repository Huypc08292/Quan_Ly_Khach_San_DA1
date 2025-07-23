/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlks_da_1.entity;

/**
 *
 * @author ASUS
 */
public class KhachHang_entity {
    private String maKH;
    private String tenKH;
    private String CCCD;
    private String SDT;
    private String email;
    private String diaChi;

    public KhachHang_entity() {
    }

    public KhachHang_entity(String maKH, String tenKH, String CCCD, String SDT, String email, String diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.CCCD = CCCD;
        this.SDT = SDT;
        this.email = email;
        this.diaChi = diaChi;
    }

    public String getMaKH() {   
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "KhachHang_entity{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", CCCD=" + CCCD + ", SDT=" + SDT + ", email=" + email + ", diaChi=" + diaChi + '}';
    }

    
}
