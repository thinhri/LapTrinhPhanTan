/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.rmi.registry.LocateRegistry;

public class MyServer {

    public static void main(String[] args) {
        try {
            TinhToan tt = new TinhToan();
//            UnicastRemoteObject.exportObject(tt);
            LocateRegistry.createRegistry(1099);
            InetAddress ip = InetAddress.getLocalHost();
            Naming.bind("rmi://" + ip.getHostName() + "/TinhToan", tt);
            System.out.print("Dang cho Client yeu cau: ");
        } catch (Exception tt) {
            System.out.print(tt);
        }
    }
}
