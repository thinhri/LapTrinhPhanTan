/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Date;



/**
 *
 * @author USER
 */
public class LichSuGDbean {
    public int Id;
    public Date NgayRutTien;
    public int SoTienRutRa;
    public String SoTaiKhoan;

    public LichSuGDbean() {
        super();
    }

    public LichSuGDbean(int Id, Date NgayRutTien, int SoTienRutRa, String SoTaiKhoan) {
        super();
        this.Id = Id;
        this.NgayRutTien = NgayRutTien;
        this.SoTienRutRa = SoTienRutRa;
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getNgayRutTien() {
        return NgayRutTien;
    }

    public void setNgayRutTien(Date NgayRutTien) {
        this.NgayRutTien = NgayRutTien;
    }

    public int getSoTienRutRa() {
        return SoTienRutRa;
    }

    public void setSoTienRutRa(int SoTienRutRa) {
        this.SoTienRutRa = SoTienRutRa;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }
  
    
    
}
