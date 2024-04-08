package DatagramSocket;
import java.util.Date;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.List;

public class TaiKhoan {

    public int DangKetNoi(String tt, String un) {
        try {
            //Thiết lập câu lệnh sql để cập nhật lại trạng thái của tài khoản
            String sql = "update TaiKhoan set DangKetNoi=? where TenDangNhap=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, tt); //Gán tham số cho câu lệnh sql
            cmd.setString(2, un);
            return cmd.executeUpdate();//thực hiện câu lệnh sql
        } catch (Exception loi) {
            System.out.print("Loi o ham loi DangKetNoi" + loi);
            return 0;
        }
    }

    //Cập nhật lại trường Ip=ip cho tài khoản có tên đăng nhập là: un
    public int LuuIp(String ip, String un) {
        try {
            //Thiết lập câu lệnh sql để cập nhật lại ip của tài khoản
            String sql = "update TaiKhoan set Ip=? where TenDangNhap=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, ip); //Gán tham số cho câu lệnh sql
            cmd.setString(2, un);
            return cmd.executeUpdate();
        } catch (Exception loi) {
            System.out.print("Loi o LuuIp: " + loi);
            return 0;
        }
    }

    //Hàm trả về là true nếu tìm ra người đăng nhập có tên đăng nhập là un và mật khẩu là: pwd
    public boolean ktDangNhap(String un, String pwd) {
        try {
            //Thiết lập câu lệnh sql để kiểm tra đăng nhập
            String sql = "select * from TaiKhoan where tendangnhap=? and matkhau=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, un); //Gán tham số cho câu lệnh sql
            cmd.setString(2, pwd);
            ResultSet rs = cmd.executeQuery();
            return rs.next();
        } catch (Exception loi) {
            System.out.print("Loi o ktDangNhap: " + loi);
            return false;
        }
    }

    //Hàm trả về địa chỉ Ip của người đăng nhập là un
    public String LayIp(String un) {
        try {
            //Thiết lập câu lệnh sql để kiểm tra đăng nhập
            String sql = "select * from TaiKhoan where tendangnhap=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, un); //Gán tham số cho câu lệnh sql
            ResultSet rs = cmd.executeQuery();
            if (rs.next())//Nếu tìm được tài khoản: un
            {
                return rs.getString("Ip");//Trả về Ip
            } else {
                return null;
            }
        } catch (Exception loi) {
            System.out.print("Loi o LayIp: " + loi);
            return null;
        }
    }

    //Hàm trả về thông tin của tất cả các tài khoản đang đăng nhập vào hệ thống: DangKetNoi=true
    public ResultSet LayTaiKhoanDangKetNoi() {
        try {
            Statement cmd = CoSo.cn.createStatement();
            String sql = "select * from TaiKhoan where DangKetNoi=1";
            ResultSet rs = cmd.executeQuery(sql);
            return rs;
        } catch (Exception loi) {
            System.out.print("Loi o LayTaiKhoanDangKetNoi: " + loi);
            return null;
        }
    }
    public ResultSet LayNgayCoTin(){
        try {
            Statement cmd = CoSo.cn.createStatement();
            String sql = "select distinct NgayNhan from tinnhan";
            ResultSet rs = cmd.executeQuery(sql);
            return rs;
        } catch (Exception loi) {
            System.out.println("Loi o LayNgayCoTin" + loi);
            return null;
        }
    }
    
    public String LichSuTroChuyen(String NgayNhan){
        try {
            String sql = "select * from tinnhan where NgayNhan=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, NgayNhan);
            ResultSet rs = cmd.executeQuery();
            String s="";
            while(rs.next()){
                s+= rs.getString("TenDangNhap")+ ": " + rs.getString("NoiDung")+ ";";
            }
            return s;
        } catch (Exception loi) {
            System.out.println("Loi KhongHienThiLichSuTroChuyen" + loi);
            return null;
        }
    }

    //Lấy về trạng thái đang kết nối của tài khoản có tên đăng nhập là: TenDangNhap
    public String LayTrangThaiKetNoi(String TenDangNhap) {
        try {
            String sql = "select * from TaiKhoan where tendangnhap=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, TenDangNhap); //Gán tham số cho câu lệnh sql
            ResultSet rs = cmd.executeQuery();
            rs.next();
            return rs.getString("DangKetNoi");
        } catch (Exception loi) {
            System.out.print("Loi o LayTrangThaiKetNoi: " + loi);
            return null;
        }
    }

    //Nhập vào bảng TaiKhoan 1 dòng dữ liệu
    public int TaoTaiKhoan(String tenDn, String matKhau, String hoten) {
        try {
            String sql = "insert into TaiKhoan(TenDangNhap,MatKhau,HoTen) values(?,?,?)";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, tenDn); //Gán tham số cho câu lệnh sql
            cmd.setString(2, matKhau);
            cmd.setString(3, hoten);
            int kt = cmd.executeUpdate();
            return kt;
        } catch (Exception loi) {
            loi.printStackTrace();
            System.out.print("Loi o TaoTaiKHoan: " + loi.getMessage());
            return 0;
        }
    }

    public boolean KtraTK(String tenDn) {
        try {

            String sql = "select * from TaiKhoan where tendangnhap=?";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, tenDn); //Gán tham số cho câu lệnh sql
            ResultSet rs = cmd.executeQuery();
            return rs.next();
        } catch (Exception e) {
            return false;
        }
    }
    
    public int LuuTinNhan(String tenDN, String NoiDung) throws Exception{
        try {
            Date ngayht = new Date();
            SimpleDateFormat da = new SimpleDateFormat("yyyy-MM-dd");
            String dat = da.format(ngayht);
            String sql = "insert into tinnhan(NoiDung, NgayNhan, TenDangNhap) values (?,?,?)";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, NoiDung);
            cmd.setString(2, dat);
            cmd.setString(3, tenDN);
            int kt = cmd.executeUpdate();
            return kt;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi o Tk: "+ e);
           return 0;
        }
        
    }
    public int DoiMatKhau(String TenDN, String MatKhau){
        try {
            String sql = "update taikhoan set MatKhau=? where TenDangNhap=? ";
            PreparedStatement cmd = CoSo.cn.prepareStatement(sql);
            cmd.setString(1, MatKhau);
            cmd.setString(2, TenDN);
            return cmd.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi o MatKhau: "+ e);
            return 0;
        }
    }
}//Kết thúc lớp TaiKhoan
