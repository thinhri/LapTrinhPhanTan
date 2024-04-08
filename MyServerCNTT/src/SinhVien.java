/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.io.*;

public class SinhVien implements Serializable {

    public String Masv;
    public String HoTen;
    public double DTB;

    public SinhVien(String Masv, String HoTen, double DTB) {
        this.Masv = Masv;
        this.HoTen = HoTen;
        this.DTB = DTB;
    }
}
