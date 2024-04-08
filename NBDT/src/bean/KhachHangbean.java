/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author USER
 */
public class KhachHangbean {
    public String SoTaiKhoan;
    public String HoTen;
    public String SoDienThoai;
    public String SoCMND;
    public int SoTien;

    public KhachHangbean() {
        super();
    }

    public KhachHangbean(String SoTaiKhoan, String HoTen, String SoDienThoai, String SoCMND, int SoTien) {
        super();
        this.SoTaiKhoan = SoTaiKhoan;
        this.HoTen = HoTen;
        this.SoDienThoai = SoDienThoai;
        this.SoCMND = SoCMND;
        this.SoTien = SoTien;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getSoCMND() {
        return SoCMND;
    }

    public void setSoCMND(String SoCMND) {
        this.SoCMND = SoCMND;
    }

    public int getSoTien() {
        return SoTien;
    }

    public void setSoTien(int SoTien) {
        this.SoTien = SoTien;
    }
    
    
}
