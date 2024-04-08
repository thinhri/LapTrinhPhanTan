/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.SachBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SachDao {
    public ArrayList<SachBean> getS() throws Exception{
        KetNoi ketnoi = new KetNoi();
        ArrayList<SachBean> ds = new ArrayList<>();
        try{
            
            String sql = "select * from Sach";
            PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                ds.add(new SachBean(
                        rs.getString("MaSach"), 
                        rs.getString("TenSach"), 
                        rs.getLong("SoLuong"), 
                        rs.getLong("Gia"), 
                        rs.getString("MaNhaXuatBan")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ds;
    }
}
