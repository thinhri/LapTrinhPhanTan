
import java.sql.*;
import java.util.*;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class TinhToan extends UnicastRemoteObject implements ITinhToan {
    
    public TinhToan() throws Exception {
        
    }
    
    public khachhangBean Ktdn(String tk, String mk) throws RemoteException {
        CoSo.MoKetNoi();
        try {
            String sql = "select * from NguoiDung where SoTaiKhoan=? and SoPin=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, tk);
            cmd.setString(2, mk);
            ResultSet rs = cmd.executeQuery();
            khachhangBean khb = new khachhangBean();
            while (rs.next()) {
                khb.setHoTen(rs.getString("HoTen"));
                khb.setSoTaiKhoan(rs.getString("SoTaiKhoan"));
                khb.setSoDu(rs.getInt("SoDu"));
                khb.setSoPin(rs.getString("SoPin"));
                khb.setKhoa(rs.getBoolean("Khoa"));
            }
            return khb;
        } catch (Exception tt) {
            System.out.println("Loi o kiem tra dn: " + tt);
            return null;
        }
    }
    public khachhangBean Kttk(String tk) throws RemoteException{
        CoSo.MoKetNoi();
        try {
            String sql = "select * from NguoiDung where SoTaiKhoan=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, tk);
            ResultSet rs = cmd.executeQuery();
            khachhangBean khb = null;
            while (rs.next()) {
                khb = new khachhangBean();
                khb.setHoTen(rs.getString("HoTen"));
                khb.setSoTaiKhoan(rs.getString("SoTaiKhoan"));
            }
            return khb;
        } catch (Exception tt) {
            System.out.println("Loi o kiem tra dn: " + tt);
            return null;
        }
    }
    
    public boolean Kttt(String tk) throws RemoteException{
        CoSo.MoKetNoi();
        try {
            String sql = "select TrangThai from NguoiDung where SoTaiKhoan=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, tk);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                return rs.getBoolean("TrangThai");
            }
            else{
                return true;
            }
        } catch (Exception tt) {
            System.out.println("Loi o kiem tra dn: " + tt);
            return true;
        }
    }
    
    public boolean CapNhatTT(String tk) throws RemoteException{
        CoSo.MoKetNoi();
        try {
            String sql = "select * from NguoiDung where SoTaiKhoan=?";
            String sqlUpdate = "Update NguoiDung set TrangThai =? where SoTaiKhoan =?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, tk);
            ResultSet rs = cmd.executeQuery();
            if(rs.next()){
                boolean trangthai = rs.getBoolean("TrangThai");
                PreparedStatement cmd1 = CoSo.cn.prepareStatement(sqlUpdate);
                cmd1.setBoolean(1, !trangthai);
                cmd1.setString(2, tk);
                int rs1 = cmd1.executeUpdate();
                return rs1>0;
            }
        } catch (Exception tt) {
            System.out.println("Loi o kiem tra dn: " + tt);
            return false;
        }
        return false;
    }
    
    public boolean CongTien(String tk, int stc) throws RemoteException {
        CoSo.MoKetNoi();
        try {
            String sql = "update NguoiDung set SoDu=SoDu+? where SoTaiKhoan=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setInt(1, stc);
            cmd.setString(2, tk);
            int i = cmd.executeUpdate();
            return i > 0;
        } catch (Exception tt) {
            System.out.println("Loi o CongTien: " + tt);
            return false;
        }
    }
    
    public boolean TruTien(String tk, int stt) throws RemoteException {
        CoSo.MoKetNoi();
        try {
            String sql = "update NguoiDung set SoDu=SoDu-? where SoTaiKhoan=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setInt(1, stt);
            cmd.setString(2, tk);
            int i = cmd.executeUpdate();
            return i > 0;
        } catch (Exception tt) {
            System.out.println("Loi o TruTien: " + tt);
            return false;
        }
    }
    
    public boolean DoiMatKhau(String tk, String mkm) throws RemoteException {
        CoSo.MoKetNoi();
        try {
            
            String sql = "update NguoiDung set SoPin=? where SoTaiKhoan=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(2, tk);
            cmd.setString(1, mkm);
            int i = cmd.executeUpdate();
            
            if (i > 0) {
                return true;
            } else {
                return false;
            }
            
        } catch (Exception tt) {
            System.out.println("Loi o DoiMatKhau: " + tt);
            return false;
        }
    }
    
    public boolean RutTien(String tk, int stgd) throws RemoteException {
        CoSo.MoKetNoi();
        try {
            Date ndg = new Date();
            SimpleDateFormat da = new SimpleDateFormat("yyyy-MM-dd");
            String dat = da.format(ndg);
            java.sql.Date sqlDate = java.sql.Date.valueOf(dat);
            String sql = "insert into ChiTietGiaoDich (NgayGiaoDich, SoTienGiaoDich, SoTaiKhoan, GhiChu) values (?,?,?,?)";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setDate(1, sqlDate);
            cmd.setInt(2, stgd);
            cmd.setString(3, tk);
            cmd.setString(4, "Tru tien ");
            return cmd.executeUpdate() > 0;
            
        } catch (SQLException sqlException) {
            System.out.println("Lỗi trong lệnh INSERT: " + sqlException.getMessage());
            sqlException.printStackTrace();
            return false;
        }
        
    }
    public int KtrRutTien(String tk) throws RemoteException{
        CoSo.MoKetNoi();
        try {
            int tt = 0 ;
            Date ndg = new Date();
            SimpleDateFormat da = new SimpleDateFormat("yyyy-MM-dd");
            String dat = da.format(ndg);
            java.sql.Date sqlDate = java.sql.Date.valueOf(dat);
            String GhiChu = "Tru tien";
            String sql = "select SoTienGiaoDich from ChiTietGiaoDich where SoTaiKhoan=? and NgayGiaoDich=? and GhiChu=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, tk);
            cmd.setDate(2, sqlDate);
            cmd.setString(3, GhiChu.trim());
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                tt += rs.getInt("SoTienGiaoDich");
            }
            return tt;
        } catch (SQLException sqlException) {
            System.out.println("Lỗi trong ham KtraRutTien: " + sqlException.getMessage());
            sqlException.printStackTrace();
            return 0;
        }  
    }
    
    public boolean NapTien(String tk, int stgd) throws RemoteException {
        CoSo.MoKetNoi();
        try {
            Date ndg = new Date();
            SimpleDateFormat da = new SimpleDateFormat("yyyy-MM-dd");
            String dat = da.format(ndg);
            java.sql.Date sqlDate = java.sql.Date.valueOf(dat);
            String sql = "insert into ChiTietGiaoDich (NgayGiaoDich, SoTienGiaoDich, SoTaiKhoan, GhiChu) values (?,?,?,?)";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setDate(1, sqlDate);
            cmd.setInt(2, stgd);
            cmd.setString(3, tk);
            cmd.setString(4, "Cong Tien ");
            return cmd.executeUpdate() > 0;
            
        } catch (SQLException sqlException) {
            System.out.println("Lỗi trong lệnh INSERT: " + sqlException.getMessage());
            sqlException.printStackTrace();
            return false;
        }
        
    }
    
    public boolean KTSoDu(String tk, int stgd) throws RemoteException {
        CoSo.MoKetNoi();
        try {
            String sql = "select SoDu from NguoiDung where SoTaiKhoan=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, tk);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                return rs.getInt("SoDu") > stgd;
            } else {
                System.out.println("Khong the lay thong tin so du");
                return false;
            }
        } catch (Exception tt) {
            System.out.println("Loi o KtraSoDu: " + tt);
            return false;
        }
    }
    
    public boolean ChuyenKhoan(String tkc, String tkn, int stgd) throws RemoteException {
        CoSo.MoKetNoi();
        try {
            Date ndg = new Date();
            SimpleDateFormat da = new SimpleDateFormat("yyyy-MM-dd");
            String dat = da.format(ndg);
            java.sql.Date sqlDate = java.sql.Date.valueOf(dat);
            String sql = "insert into ChiTietGiaoDich (NgayGiaoDich, SoTienGiaoDich, SoTaiKhoan, GhiChu) values (?,?,?,?)"
                    + "insert into ChiTietGiaoDich (NgayGiaoDich, SoTienGiaoDich, SoTaiKhoan, GhiChu) values (?,?,?,?)";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setDate(1, sqlDate);
            cmd.setInt(2, stgd);
            cmd.setString(3, tkc);
            cmd.setString(4, "Chuyen tien");
            
            cmd.setDate(5, sqlDate);
            cmd.setInt(6, stgd);
            cmd.setString(7, tkn);
            cmd.setString(8, "Nhan tien");
            return cmd.executeUpdate() > 0;
        } catch (Exception tt) {
            tt.printStackTrace();
            System.out.println("Loi o ChuyenKhoan: " + tt);
            return false;
        }
    }
    public ArrayList<ChiTietGiaoDichBean> getls(String tk) throws RemoteException{
        CoSo.MoKetNoi();
        ArrayList<ChiTietGiaoDichBean> ds = new ArrayList<>();
        try {
            String sql = "select * from ChiTietGiaoDich where SoTaiKhoan=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, tk);
            ResultSet rs = cmd.executeQuery();
            Date ndg = new Date();
            SimpleDateFormat da = new SimpleDateFormat("yyyy-MM-dd");
            String dat = da.format(ndg);
            while (rs.next()){
                ds.add(new ChiTietGiaoDichBean(rs.getDate("NgayGiaoDich"), rs.getInt("SoTienGiaoDich") , rs.getString("SoTaiKhoan"), rs.getString("GhiChu")));
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
    public ArrayList<ChiTietGiaoDichBean> getlstn(String Stk, String Ngay) throws RemoteException{
        CoSo.MoKetNoi();
        ArrayList<ChiTietGiaoDichBean> ds = new ArrayList<>();
        try {
            String sql = "select * from ChiTietGiaoDich where SoTaiKhoan=? and NgayGiaoDich=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1,Stk);
            cmd.setString(2, Ngay);
            ResultSet rs = cmd.executeQuery();
            Date ndg = new Date();
            SimpleDateFormat da = new SimpleDateFormat("yyyy-MM-dd");
            String dat = da.format(ndg);
            while (rs.next()){
                ds.add(new ChiTietGiaoDichBean(rs.getDate("NgayGiaoDich"), rs.getInt("SoTienGiaoDich") , rs.getString("SoTaiKhoan"), rs.getString("GhiChu")));
            }   
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi o Ngay: " + e);
        }
        return ds;
    }
    public List<String> LayNgay(String stk) throws RemoteException{
        List<String> ngay = new ArrayList<>();
        try {
            String sql = "select distinct NgayGiaoDich from ChiTietGiaoDich where SoTaiKhoan=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, stk);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                ngay.add(rs.getString("NgayGiaoDich"));
        } 
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi o lay ngay: "+ e);
            return null;
        }
        return ngay;
    }
    public boolean KhoaTK(boolean khoa, String stk) throws RemoteException{
        CoSo.MoKetNoi();
        try {
            String sql = "update NguoiDung set Khoa=? where SoTaiKhoan=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setBoolean(1, khoa);
            cmd.setString(2, stk);
            return cmd.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi o khoa " + e);
            return false;
        }
    }
}
