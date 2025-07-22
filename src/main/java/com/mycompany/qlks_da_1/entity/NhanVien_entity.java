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

public class NhanVien_entity {

    private String maNV;
    private String tenNV;
    private String CCCD;
    private String SDT;
    private String email;
    private String diaChi;
    private Date ngaySinh;
    private String gioiTinh;
    private String chucVu;
    private double luong;
    private String trangThai;

    public NhanVien_entity() {
    }

    public NhanVien_entity(String maNV, String tenNV, String CCCD, String SDT, String email, String diaChi, Date ngaySinh, String gioiTinh, String chucVu, double luong, String trangThai) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.CCCD = CCCD;
        this.SDT = SDT;
        this.email = email;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.luong = luong;
        this.trangThai = trangThai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVien_entity{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", CCCD=" + CCCD + ", SDT=" + SDT + ", email=" + email + ", diaChi=" + diaChi + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", chucVu=" + chucVu + ", luong=" + luong + ", trangThai=" + trangThai + '}';
    }

}
