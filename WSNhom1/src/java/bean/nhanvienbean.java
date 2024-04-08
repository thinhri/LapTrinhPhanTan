/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;


public class nhanvienbean implements Serializable{
    private String manv;
    private String hoten;

    public nhanvienbean() {
    }

    public nhanvienbean(String manv, String hoten) {
        this.manv = manv;
        this.hoten = hoten;
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
    
}
