
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan{
    
    public TinhToan() throws Exception {
    
    }
    
    public ArrayList<SachBean> getS() throws RemoteException{
        CoSo.MoKetNoi();
        ArrayList<SachBean> ds = new ArrayList<>();
        try{
            
            String sql = "select * from Sach";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
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
    
    public ArrayList<NhaXuatBanBean> getNXB() throws RemoteException{
        CoSo.MoKetNoi();
        ArrayList<NhaXuatBanBean> ds = new ArrayList<>();
        try {
            String sql = "select * from NhaXuatBan";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                ds.add(new NhaXuatBanBean(
                        rs.getString("MaNhaXuatBan"), 
                        rs.getString("TenNhaXuatBan"), 
                        TbThanhTien(rs.getString("MaNhaXuatBan"))));
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
    
    public ArrayList<SachBean> HtTimKiem(String Tim) throws RemoteException {
        try {
            CoSo.MoKetNoi();
            String sql = "select * from Sach where TenSach like ? or MaNhaXuatBan like ?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, "%" + Tim + "%");
            cmd.setString(2, "%" + Tim + "%");
            ArrayList<SachBean> ds = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                ds.add(new SachBean(
                        rs.getString("MaSach"), 
                        rs.getString("TenSach"), 
                        rs.getLong("SoLuong"), 
                        rs.getLong("Gia"), 
                        rs.getString("MaNhaXuatBan")));
            }
            return ds;
        } catch (SQLException ex) {
            Logger.getLogger(TinhToan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
     public double TbThanhTien(String manxb) throws RemoteException{
        CoSo.MoKetNoi();
        try {
            String sql = "select AVG(Sach.SoLuong * Sach.Gia) as tbc from Sach join NhaXuatBan on Sach.MaNhaXuatBan = NhaXuatBan.MaNhaXuatBan where NhaXuatBan.MaNhaXuatBan = ?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, manxb);
            ResultSet rs = cmd.executeQuery();
            if(rs.next()){
                return rs.getDouble("tbc");
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
     
    public ArrayList<SachBean> MaxSL() throws RemoteException{
        CoSo.MoKetNoi();
        ArrayList<SachBean> ds = new ArrayList<>();
        try {
            String sql = "select * from Sach where SoLuong = (select Max(SoLuong) from Sach)";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                ds.add(new SachBean(
                        rs.getString("MaSach"), 
                        rs.getString("TenSach"), 
                        rs.getLong("SoLuong"), 
                        rs.getLong("Gia"), 
                        rs.getString("MaNhaXuatBan")));
            } 
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi o ham Max" +e);
        }
        return ds;
    }
    
    public ArrayList<SachBean> MinSL() throws RemoteException{
        CoSo.MoKetNoi();
        ArrayList<SachBean> ds = new ArrayList<>();
        try {
            String sql = "select * from Sach where SoLuong = (select Min(SoLuong) from Sach)";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()){
                ds.add(new SachBean(
                        rs.getString("MaSach"),
                        rs.getString("TenSach"),
                        rs.getLong("SoLuong"), 
                        rs.getLong("Gia"),
                        rs.getString("MaNhaXuatBan")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi o ham Min: "+e);
        }
        try {
            CoSo.cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TinhToan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds;
    }
}
