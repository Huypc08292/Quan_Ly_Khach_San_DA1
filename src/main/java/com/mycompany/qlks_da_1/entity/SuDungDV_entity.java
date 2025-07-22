/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlks_da_1.entity;

/**
 *
 * @author ASUS
 */
import java.util.Date;

public class SuDungDV_entity {

    private String maSuDung;
    private String maDatPhong;
    private String maDV;
    private int soLuong;
    private Date ngaySuDung;

    public SuDungDV_entity() {
    }

    public SuDungDV_entity(String maSuDung, String maDatPhong, String maDV, int soLuong, Date ngaySuDung) {
        this.maSuDung = maSuDung;
        this.maDatPhong = maDatPhong;
        this.maDV = maDV;
        this.soLuong = soLuong;
        this.ngaySuDung = ngaySuDung;
    }

    public String getMaSuDung() {
        return maSuDung;
    }

    public void setMaSuDung(String maSuDung) {
        this.maSuDung = maSuDung;
    }

    public String getMaDatPhong() {
        return maDatPhong;
    }

    public void setMaDatPhong(String maDatPhong) {
        this.maDatPhong = maDatPhong;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgaySuDung() {
        return ngaySuDung;
    }

    public void setNgaySuDung(Date ngaySuDung) {
        this.ngaySuDung = ngaySuDung;
    }

    @Override
    public String toString() {
        return "SuDungDV_entity{" + "maSuDung=" + maSuDung + ", maDatPhong=" + maDatPhong + ", maDV=" + maDV + ", soLuong=" + soLuong + ", ngaySuDung=" + ngaySuDung + '}';
    }

}
