/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class KetNoi {
    public static Connection cn;
    public void ketnoi() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://LAPTOP-02LRH71J:1433;databaseName=NguyenBaDuyThinh-20T1020105;user=sa;password=123";
        cn = DriverManager.getConnection(url);
        System.out.println("Da ket noi");
    }
    public static void main(String[] args){
        try {
            KetNoi kn = new KetNoi();
            kn.ketnoi();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
