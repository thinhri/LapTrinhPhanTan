/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.sachbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class sachdao {
    public ArrayList<sachbean> getsach() throws Exception{
        ArrayList<sachbean> ds = new ArrayList<sachbean>();
        String sql="select * from sach";
        //b2: Tao cau leng preparestatement
        PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
        //b3: Thuc hien cau lenh
        ResultSet rs = cmd.executeQuery();
        //b4: Duyet tap rs va luu vao arrayList
        while(rs.next()){
            String masach = rs.getString("masach");
            String tensach = rs.getString("tensach");
            long gia = rs.getLong("gia");
            long soluong = rs.getLong("soluong");
            String maloai = rs.getString("maloai");
            ds.add(new sachbean(masach, tensach, gia, soluong, maloai));
        }
        rs.close();
        return ds;
    }
    
//    public ArrayList<sachbean> hiensach(String maloai) throws Exception{
//        ArrayList<sachbean> ds = new ArrayList<>();
//        String sql="select masach, tensach, soluong, gia from sach where maloai=?";
//        PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
//        ResultSet rs = cmd.executeQuery();
//        cmd.setString(1, maloai);
//        while(rs.next()){
//            String masach = rs.getString("masach");
//            String tensach = rs.getString("tensach");
//            long soluong = rs.getLong("soluong");
//            long gia = rs.getLong("gia");
//            String mang = masach+tensach+soluong+gia;
//            
//    }
//        rs.close();
//        return ds;
//    }

}
