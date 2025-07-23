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

public class HoaDon_entity {

    private String maHoaDon;
    private String maDatPhong;
    private String maNV;
    private Date ngayTaoHD;
    private double tongTien;
    private String ghiChu;

    public HoaDon_entity() {
    }

    public HoaDon_entity(String maHoaDon, String maDatPhong, String maNV, Date ngayTaoHD, double tongTien, String ghiChu) {
        this.maHoaDon = maHoaDon;
        this.maDatPhong = maDatPhong;
        this.maNV = maNV;
        this.ngayTaoHD = ngayTaoHD;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaDatPhong() {
        return maDatPhong;
    }

    public void setMaDatPhong(String maDatPhong) {
        this.maDatPhong = maDatPhong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayTaoHD() {
        return ngayTaoHD;
    }

    public void setNgayTaoHD(Date ngayTaoHD) {
        this.ngayTaoHD = ngayTaoHD;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "HoaDon_entity{" + "maHoaDon=" + maHoaDon + ", maDatPhong=" + maDatPhong + ", maNV=" + maNV + ", ngayTaoHD=" + ngayTaoHD + ", tongTien=" + tongTien + ", ghiChu=" + ghiChu + '}';
    }

}
