package DatagramSocket;

import java.sql.*;
import javax.swing.table.*;

public class CoSo {

    public static Connection cn;//Biến cn để kết nối đến CSDL
    public static String TenDn = ""; //Lưu lại tên người dùng đăng nhập vào hệ thống
    public static String IpGoiDen = ""; //Lưu lại Ip của máy cần gửi đến
    public static int DoDaiGoiTinNhan = 0;//Lưu lại độ dài của gói tin vừa nhận

    public static void MoKetNoi() {//Mở kết nối đến CSDL
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-02LRH71J:1433;databaseName=chatDb;user=sa;password=123");
            System.out.println("Da ket noi CSDL chatDB");
        } catch (Exception t1) {
            System.out.print(t1.getMessage());
        }
    }//Truyền vào 1 bảng có tên là tb và trả về 1 ResultSet chứa toàn bộ dữ liệu của bảng này

    public static ResultSet LayBang(String tb) {
        try {
            Statement cmd = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            return cmd.executeQuery("select * from " + tb);
        } catch (Exception t2) {
            System.out.print(t2.getMessage());
            return null;
        }
    }
}
