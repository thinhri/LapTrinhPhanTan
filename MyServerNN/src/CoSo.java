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
import java.net.*;

public class CoSo {

    public static Connection cn;

    public static void MoKetNoi() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://LAPTOP-02LRH71J:1433;databaseName=QlSv; user=sa; password=123";
            cn=DriverManager.getConnection(url);
            System.out.print("đã kết nối");
        } catch (Exception t1) {
            System.out.print(t1.getMessage());
        }
    }

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
