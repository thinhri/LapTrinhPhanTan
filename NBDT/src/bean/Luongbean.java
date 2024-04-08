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
public class Luongbean {
    public String maluong;
    public int luongcoban;
    public int phucap;
    public String manv;
    
    public Luongbean() {
        super();
    }

    public Luongbean(String maluong, int luongcoban, int phucap, String manv) {
        super();
        this.maluong = maluong;
        this.luongcoban = luongcoban;
        this.phucap = phucap;
        this.manv = manv;
    }

    public String getMaluong() {
        return maluong;
    }

    public void setMaluong(String maluong) {
        this.maluong = maluong;
    }

    public int getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(int luongcoban) {
        this.luongcoban = luongcoban;
    }

    public int getPhucap() {
        return phucap;
    }

    public void setPhucap(int phucap) {
        this.phucap = phucap;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }
    
    
}
