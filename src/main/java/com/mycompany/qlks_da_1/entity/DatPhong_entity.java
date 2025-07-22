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

public class DatPhong_entity{
    private String maDatPhong;
    private String maKH;
    private String maPhong;
    private String maNV;
    private Date ngayDat;
    private Date ngayNhan;
    private Date ngayTra;

    // Constructors, Getters and Setters

    public DatPhong_entity() {
    }

    public DatPhong_entity(String maDatPhong, String maKH, String maPhong, String maNV, Date ngayDat, Date ngayNhan, Date ngayTra) {
        this.maDatPhong = maDatPhong;
        this.maKH = maKH;
        this.maPhong = maPhong;
        this.maNV = maNV;
        this.ngayDat = ngayDat;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
    }

    public String getMaDatPhong() {
        return maDatPhong;
    }

    public void setMaDatPhong(String maDatPhong) {
        this.maDatPhong = maDatPhong;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    @Override
    public String toString() {
        return "DatPhong_entity{" + "maDatPhong=" + maDatPhong + ", maKH=" + maKH + ", maPhong=" + maPhong + ", maNV=" + maNV + ", ngayDat=" + ngayDat + ", ngayNhan=" + ngayNhan + ", ngayTra=" + ngayTra + '}';
    }

    
    
}
