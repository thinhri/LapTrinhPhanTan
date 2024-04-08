
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    public ArrayList<BookBean> Show() throws RemoteException {
        CoSo.MoKetNoi();
        ArrayList<BookBean> ds = new ArrayList<>();
        try {
            String sql = "select * from sach";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                ds.add(new BookBean(rs.getString("masach"), rs.getString("tensach"), rs.getLong("gia"), rs.getLong("soluong"), rs.getString("maloai")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi o htds : " + e);
        }
        return ds;
    }

    public List<String> LayMaLoai() throws RemoteException {
        List<String> ds = new ArrayList<>();
        try {
            String sql = "select distinct maloai from sach";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                ds.add(rs.getString("maloai"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi o lay maloai: " + e);
        }
        return ds;
    }

    public ArrayList<BookBean> getds(String maloai) throws RemoteException {
        CoSo.MoKetNoi();
        ArrayList<BookBean> ds = new ArrayList<>();
        try {
            String sql = "select * from sach where maloai = ?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, maloai);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                ds.add(new BookBean(rs.getString("masach"), rs.getString("tensach"), rs.getLong("gia"), rs.getLong("soluong"), rs.getString("maloai")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi o htds theo maloai: " + e);
        }
        return ds;
    }

    public ArrayList<BookBean> HtTimKiem(String Tim) throws RemoteException {
        CoSo.MoKetNoi();
        ArrayList<BookBean> ds = new ArrayList<>();
        try {
            String sql = "SELECT * FROM sach WHERE maloai LIKE ? OR tensach LIKE ?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, "%" + Tim + "%");
            cmd.setString(2, "%" + Tim + "%");
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                ds.add(new BookBean(rs.getString("masach"), rs.getString("tensach"), rs.getLong("gia"), rs.getLong("soluong"), rs.getString("maloai")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Sai o timKiem: " + e);
        }
        return ds;
    }

    public List<String> LayMaLoaiTuType() throws RemoteException {
        CoSo.MoKetNoi();
        List<String> ds = new ArrayList<>();
        try {
            String sql = "select tenloai from loai";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                ds.add(rs.getString("tenloai"));
            }
        } catch (Exception e) {

        }
        return ds;
    }
    
    @Override
    public ArrayList<TypeBean> getloai() throws RemoteException{
        CoSo.MoKetNoi();
        ArrayList<TypeBean> ds = new ArrayList<>();
        try {
            String sql = "select * from loai";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                ds.add(new TypeBean(rs.getString("maloai"), rs.getString("tenloai")));
            }
        } catch (Exception tt) {
            tt.printStackTrace();
            System.out.println("Loi o ham lay loai: " + tt);
        }
        return ds;
    }
    
//    public int TongSoLuongSachMoiLoai(String maloai) throws RemoteException{
//        CoSo.MoKetNoi();
//        int count = 0;
//        try {
//            String sql = "select count(tensach) from sach where maloai= ? ";
//            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
//            cmd.setString(1, maloai);
//            ResultSet rs = cmd.executeQuery();
//            while(rs.next()){
//                count++;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return count;
//    }
//    
//    public int TongGiaMoiLoai(String maloai) throws RemoteException{
//        CoSo.MoKetNoi();
//        int Tong = 0;
//        try {
//            String sql = "select sum(gia) from sach where maloai= ?";
//            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
//            
//            
//        } catch (Exception e) {
//        }
//    }
}
