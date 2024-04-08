
import java.sql.Connection;
import java.sql.DriverManager;


public class CoSo {
    public static Connection cn;

    public static void MoKetNoi() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://LAPTOP-02LRH71J:1433;databaseName=NguyenBaDuyThinh-20T1020105; user=sa; password=123";
            cn=DriverManager.getConnection(url);
            System.out.print("đã kết nối");
        } catch (Exception t1) {
            System.out.print(t1.getMessage());
        }
    }
}
