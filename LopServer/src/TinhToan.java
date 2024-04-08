
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
public class TinhToan extends UnicastRemoteObject implements ITinhToan {

    public TinhToan() throws Exception {
    }

    public ArrayList<SinhVienBean> getSV() throws RemoteException {
        CoSo.MoKetNoi();
        ArrayList<SinhVienBean> ds = new ArrayList<>();
        try {

            String sql = "select * from SinhVien";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                ds.add(new SinhVienBean(
                        rs.getString("MaSinhVien"),
                        rs.getString("HoTen"),
                        rs.getDouble("DiemLT"),
                        rs.getDouble("DiemTH"),
                        rs.getString("MatKhau"),
                        rs.getString("MaLop")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    public ArrayList<LopBean> getL() throws RemoteException {
        CoSo.MoKetNoi();
        ArrayList<LopBean> ds = new ArrayList<>();
        try {
            String sql = "select * from Lop";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                ds.add(new LopBean(
                        rs.getString("MaLop"),
                        rs.getString("TenLop"),
                        TongSoLuongSV(rs.getString("MaLop")),
                        TbDiemLT(rs.getString("MaLop"))
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    public ArrayList<SinhVienBean> HtTimKiem(String Tim) throws RemoteException {
        try {
            CoSo.MoKetNoi();
            String sql = "select * from SinhVien where HoTen like ? or MaLop in (Select MaLop from Lop where TenLop like ?)";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, "%" + Tim + "%");
            cmd.setString(2, "%" + Tim + "%");
            ArrayList<SinhVienBean> ds = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                ds.add(new SinhVienBean(
                        rs.getString("MaSinhVien"),
                        rs.getString("HoTen"),
                        rs.getDouble("DiemLT"),
                        rs.getDouble("DiemTH"),
                        rs.getString("MatKhau"),
                        rs.getString("MaLop")));
            }
            return ds;
        } catch (SQLException ex) {
            Logger.getLogger(TinhToan.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public long TongSoLuongSV(String malop) throws RemoteException {
        CoSo.MoKetNoi();
        int count = 0;
        try {
            String sql = "select count(MaSinhVien) as dem from SinhVien join Lop on SinhVien.MaLop = Lop.MaLop where Lop.MaLop = ? ";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, malop);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                return rs.getLong("dem");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public double TbDiemLT(String madonvi) throws RemoteException {
        CoSo.MoKetNoi();
        try {
            String sql = "select AVG(DiemLT) as tbc from SinhVien join Lop on SinhVien.MaLop = Lop.MaLop where Lop.MaLop = ?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, madonvi);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                return rs.getDouble("tbc");
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public ArrayList<SinhVienBean> SapXepDiemLTTang() throws RemoteException {
        CoSo.MoKetNoi();
        ArrayList<SinhVienBean> ds = new ArrayList<>();
        try {
            String sql = "SELECT * FROM SinhVien JOIN Lop ON SinhVien.MaLop = Lop.MaLop ORDER BY DiemLT ASC";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                ds.add(new SinhVienBean(
                        rs.getString("MaSinhVien"),
                        rs.getString("HoTen"),
                        rs.getDouble("DiemLT"),
                        rs.getDouble("DiemTH"),
                        rs.getString("MatKhau"),
                        rs.getString("MaLop")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    public boolean Ktdn(String masv, String pass) throws RemoteException {
        CoSo.MoKetNoi();
        try {
            String sql = "select * from SinhVien where MaSinhVien=? and MatKhau=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, masv);
            cmd.setString(2, pass);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception tt) {
            System.out.println("Loi o kiem tra dn: " + tt);
            return false;
        }
    }

}
