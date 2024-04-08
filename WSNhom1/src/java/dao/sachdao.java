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
        KetNoi kn = new KetNoi();
        kn.ketnoi();
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
    public ArrayList<sachbean> timkiem(String key) throws Exception{
        try {
            ArrayList<sachbean> ds = new ArrayList<>();
        KetNoi kn = new KetNoi();
        kn.ketnoi();
        String sql = "select * from sach where tensach like ? or maloai like ?";
        PreparedStatement cmd = kn.cn.prepareStatement(sql);
        cmd.setString(1, "%"+key+"%");
        cmd.setString(2, "%"+key+"%");
        ResultSet rs = cmd.executeQuery();
        while (rs.next()) {
            ds.add(new sachbean(
                    rs.getString("masach"),
                    rs.getString("tensach"),
                    rs.getLong("gia"), rs.getLong("soluong"),
                    rs.getString("maloai")));
        }
        return ds;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
