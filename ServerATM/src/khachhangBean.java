
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class khachhangBean implements Serializable {
    
    public String SoTaiKhoan;
    public String SoPin;
    public String HoTen;
    public int SoDu;
    public String SoDT;
    public boolean Khoa;
    public boolean TrangThai;
    public khachhangBean() {
        super();
    }

    public khachhangBean(String SoTaiKhoan, String SoPin, String HoTen, int SoDu, String SoDT, boolean TrangThai) {
        super();
        this.SoTaiKhoan = SoTaiKhoan;
        this.SoPin = SoPin;
        this.HoTen = HoTen;
        this.SoDu = SoDu;
        this.SoDT = SoDT;
        this.Khoa = Khoa;
        this.TrangThai = TrangThai;
    }
    
    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getSoPin() {
        return SoPin;
    }

    public void setSoPin(String SoPin) {
        this.SoPin = SoPin;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getSoDu() {
        return SoDu;
    }

    public void setSoDu(int SoDu) {
        this.SoDu = SoDu;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }
    
    public boolean isKhoa() {
        return Khoa;
    }

    public void setKhoa(boolean Khoa) {
        this.Khoa = Khoa;
    }
    
      public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
}
