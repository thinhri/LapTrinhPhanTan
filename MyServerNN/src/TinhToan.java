/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.sql.*;
import java.util.*;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class TinhToan extends UnicastRemoteObject implements ITinhToan {
    public TinhToan() throws Exception{
        
    }
    public ArrayList GetSv() throws RemoteException
    {
        try {
            ArrayList ds = new ArrayList();
            CoSo.MoKetNoi();
            ResultSet rs = CoSo.LayBang("Khoa_NN");
            while (rs.next())
            {
                SinhVien sv = new SinhVien(rs.getString("MaSv"), rs.getString("HoTen"),
                        Double.parseDouble(rs.getString("DTB")));
                ds.add(sv);
            }
            CoSo.cn.close();
            return ds;
        } catch (Exception tt) {
            System.out.print("so bi loi" + tt);
            return null;
        }
    }

    public ArrayList TimSv(String hoten) throws RemoteException
    {
        try {
            ArrayList ds = new ArrayList();
            CoSo.MoKetNoi();
            ResultSet rs = CoSo.LayBang("Khoa_NN");
            while (rs.next()) {
                if (rs.getString("hoten").indexOf(hoten) >= 0)
                {
                    SinhVien sv = new SinhVien(rs.getString("MaSv"), rs.getString("HoTen"),
                            Double.parseDouble(rs.getString("DTB")));
                    ds.add(sv);
                }
            }
            CoSo.cn.close();
            return ds;
        } catch (Exception tt) {
            System.out.print(tt);
            return null;
        }
    
    }
}