/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.LichSuGDbean;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class LichSuGDdao {
    ArrayList<LichSuGDbean> ds = new ArrayList<LichSuGDbean>();
    public ArrayList<LichSuGDbean> getLS() throws Exception{
        String sql= "select * from LichSuGiaoDich";
        PreparedStatement cmd = KetNoiDao.cn.prepareStatement(sql);
        ResultSet rs = cmd.executeQuery();
        while(rs.next()){
            int Id = rs.getInt("Id");
            Date NgayRutTien = rs.getDate("NgayRutTien");
            int SoTienRutRa = rs.getInt("SoTienRutRa");
            String SoTK = rs.getString("SoTaiKhoan");
            ds.add(new LichSuGDbean(Id, NgayRutTien, SoTienRutRa, SoTK));
        }
        rs.close();
        return ds;
    }
}
