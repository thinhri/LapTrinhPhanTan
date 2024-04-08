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
public class NhanVienbean {
    public String manv;
    public String hoten;
    public String SoCMND;
    public float hsl;
    public String matkhau;
    
    public NhanVienbean() {
        super();
    }

    public NhanVienbean(String manv, String hoten, String SoCMND, float hsl, String matkhau) {
        super();
        this.manv = manv;
        this.hoten = hoten;
        this.SoCMND = SoCMND;
        this.hsl = hsl;
        this.matkhau = matkhau;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSoCMND() {
        return SoCMND;
    }

    public void setSoCMND(String SoCMND) {
        this.SoCMND = SoCMND;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    
    
    
}
