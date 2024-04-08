/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.loaibean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class loaidao {
    public ArrayList<loaibean> getloai() throws Exception{
        KetNoi kn = new KetNoi();
        kn.ketnoi();
        ArrayList<loaibean> ds = new ArrayList<loaibean>();
        String sql="select * from loai";
        //b2: Tao cau leng preparestatement
        PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
        //b3: Thuc hien cau lenh
        ResultSet rs = cmd.executeQuery();
        //b4: Duyet tap rs va luu vao arrayList
        while(rs.next()){
            String tenloai =rs.getString("tenloai");
            String maloai = rs.getString("maloai");
            ds.add(new loaibean(maloai, tenloai));
        }
        rs.close();
        return ds;
    }
}
