
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class CoSo {
    public static Connection cn;

    public static void MoKetNoi() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://LAPTOP-02LRH71J:1433;databaseName=ATM; user=sa; password=123";
            cn=DriverManager.getConnection(url);
            System.out.print("đã kết nối");
        } catch (Exception t1) {
            System.out.print(t1.getMessage());
        }
    }
}
