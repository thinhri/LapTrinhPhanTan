
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
public class SinhVienBean implements Serializable {

    private String MaSinhVien;
    private String HoTen;
    private Double DiemLT;
    private Double DiemTH;
    private String MatKhau;
    private String MaLop;

    public SinhVienBean() {
        super();
    }

    public SinhVienBean(String MaSinhVien, String HoTen, Double DiemLT, Double DiemTH, String MatKhau, String MaLop) {
        super();
        this.MaSinhVien = MaSinhVien;
        this.HoTen = HoTen;
        this.DiemLT = DiemLT;
        this.DiemTH = DiemTH;
        this.MatKhau = MatKhau;
        this.MaLop = MaLop;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Double getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(Double DiemLT) {
        this.DiemLT = DiemLT;
    }

    public Double getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(Double DiemTH) {
        this.DiemTH = DiemTH;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

}
