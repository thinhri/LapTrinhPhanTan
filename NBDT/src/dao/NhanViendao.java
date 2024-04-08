/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.NhanVienbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class NhanViendao {
    ArrayList<NhanVienbean> ds = new ArrayList<NhanVienbean>();
    public ArrayList<NhanVienbean> getNV() throws Exception{
        String sql = "select * from NhanVien";
        PreparedStatement cmd = KetNoiDao.cn.prepareStatement(sql);
        ResultSet rs = cmd.executeQuery();
        while(rs.next()){
//            String Socmnd = rs.getString("SoCMND");
//            String pass = rs.getString("matkhau");
            String hoten = rs.getString("hoten");
            float hsl = rs.getFloat("hsl");
            String manv = rs.getString("manv");
            String Socmnd = rs.getString("SoCMND");
            String pass = rs.getString("matkhau");
            ds.add(new NhanVienbean(manv, hoten, Socmnd, hsl, pass)); 
        }
        rs.close();
        
        return ds;
    }
}
