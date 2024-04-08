/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class KetNoiDao {
    public static Connection cn;
    public void KetNoi() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://LAPTOP-02LRH71J:1433;databaseName=NguyenBaDuyThinh;user=sa;password=123";
        cn=DriverManager.getConnection(url);
        System.out.println("Da ket noi");
    }
    public static void main(String[] args){
        try {
            KetNoiDao kn = new KetNoiDao();
            kn.KetNoi();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
