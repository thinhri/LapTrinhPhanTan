/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.KhachHangbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class KhachHangdao {
    ArrayList<KhachHangbean> ds = new ArrayList<KhachHangbean>();
    public ArrayList<KhachHangbean> getKH() throws Exception{
        String sql = "select * from KhachHang";
        PreparedStatement cmd = KetNoiDao.cn.prepareStatement(sql);
        ResultSet rs = cmd.executeQuery();
        while(rs.next()){
            String SoTK = rs.getString("SoTaiKhoan");
            String HoTen = rs.getString("HoTen");
            String SoDT = rs.getString("SoDienThoai");
            String SoCMND = rs.getString("SoCMND");
            int SoTien = rs.getInt("SoTien");
            ds.add(new KhachHangbean(SoTK, HoTen, SoDT, SoCMND, SoTien));
        }
        rs.close();
        return ds;
    }
}
