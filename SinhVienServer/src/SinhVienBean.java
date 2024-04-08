
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
public class SinhVienBean implements Serializable{
    
    private String masinhvien;
    private String hoten;
    private String diachi;
    private long hesoluong;
    private String matkhau;
    private String madonvi;

    public SinhVienBean() {
        super();
    }

    public SinhVienBean(String masinhvien, String hoten, String diachi, long hesoluong, String matkhau, String madonvi) {
        super();
        this.masinhvien = masinhvien;
        this.hoten = hoten;
        this.diachi = diachi;
        this.hesoluong = hesoluong;
        this.matkhau = matkhau;
        this.madonvi = madonvi;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public long getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(long hesoluong) {
        this.hesoluong = hesoluong;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getMadonvi() {
        return madonvi;
    }

    public void setMadonvi(String madonvi) {
        this.madonvi = madonvi;
    }

    
    
}
