
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

    public ArrayList<SinhVienBean> getSV() throws RemoteException{
        CoSo.MoKetNoi();
        ArrayList<SinhVienBean> ds = new ArrayList<>();
        try{
            
            String sql = "select * from SinhVien";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                ds.add(new SinhVienBean(rs.getString("masinhvien"), rs.getString("hoten"), rs.getString("diachi"), 
                        rs.getLong("hesoluong"), rs.getString("matkhau"), rs.getString("madonvi")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ds;
    }
    
    public ArrayList<DonViBean> getDV() throws RemoteException{
        CoSo.MoKetNoi();
        ArrayList<DonViBean> ds = new ArrayList<>();
        try {
            String sql = "select * from DonVi";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                ds.add(new DonViBean(rs.getString("madonvi"), rs.getString("tendonvi"), TbHeSoLuong(rs.getString("madonvi"))));
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
    
    @Override
    public ArrayList<SinhVienBean> HtTimKiem(String Tim) throws RemoteException {
        try {
            CoSo.MoKetNoi();
            String sql = "select * from SinhVien where hoten like ? or madonvi in (Select madonvi from DonVi where tendonvi like ?)";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, "%" + Tim + "%");
            cmd.setString(2, "%" + Tim + "%");
            ArrayList<SinhVienBean> ds = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                ds.add(new SinhVienBean(rs.getString("masinhvien"),
                        rs.getString("hoten"),
                        rs.getString("diachi"),
                        rs.getLong("hesoluong"),
                        rs.getString("matkhau"),
                        rs.getString("madonvi")));
            }
            return ds;
        } catch (SQLException ex) {
            Logger.getLogger(TinhToan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public double TbHeSoLuong(String madonvi) throws RemoteException{
        CoSo.MoKetNoi();
        try {
            String sql = "select AVG(hesoluong) as tbc from SinhVien join DonVi on SinhVien.madonvi = DonVi.madonvi where DonVi.madonvi = ?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, madonvi);
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
    
    public boolean Ktdn(String hoten, String pass) throws RemoteException{
        CoSo.MoKetNoi();
        try {
            String sql = "select * from SinhVien where hoten=? and matkhau=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, hoten);
            cmd.setString(2, pass);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                return true;
            }
            else{
                return false;
            }
        } catch (Exception tt) {
            System.out.println("Loi o kiem tra dn: " + tt);
            return false;
        }
    }
    
}
