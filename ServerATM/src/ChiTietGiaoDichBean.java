
import java.io.Serializable;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class ChiTietGiaoDichBean implements Serializable {

    public Date NgayGiaoDich;
    public int SoTienGiaoDich;
    public String SoTaiKhoan;
    public String GhiChu;
    
    public ChiTietGiaoDichBean() {
        super();
    }

    public ChiTietGiaoDichBean(Date NgayGiaoDich, int SoTienGiaoDich, String SoTaiKhoan, String GhiChu) {
        super();
        this.NgayGiaoDich = NgayGiaoDich;
        this.SoTienGiaoDich = SoTienGiaoDich;
        this.SoTaiKhoan = SoTaiKhoan;
        this.GhiChu = GhiChu;
    }

    public Date getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public void setNgayGiaoDich(Date NgayGiaoDich) {
        this.NgayGiaoDich = NgayGiaoDich;
    }

    public int getSoTienGiaoDich() {
        return SoTienGiaoDich;
    }

    public void setSoTienGiaoDich(int SoTienGiaoDich) {
        this.SoTienGiaoDich = SoTienGiaoDich;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
    
}
