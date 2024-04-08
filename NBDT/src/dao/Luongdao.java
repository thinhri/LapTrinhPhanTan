/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Luongbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Luongdao {
    ArrayList<Luongbean> ds = new ArrayList<Luongbean>();
    public ArrayList<Luongbean> getluong() throws Exception{
        
        String sql = "select * from Luong";
        PreparedStatement cmd = KetNoiDao.cn.prepareStatement(sql); 
        ResultSet rs = cmd.executeQuery();
        while(rs.next()){
            String maluong = rs.getString("maluong");
            String manv = rs.getString("manv");
            int luongcoban = rs.getInt("luongcoban");
            int phucap = rs.getInt("phucap");
            ds.add(new Luongbean(maluong, luongcoban, phucap, manv));
        }
        rs.close();
        
        return ds;
    }
}
