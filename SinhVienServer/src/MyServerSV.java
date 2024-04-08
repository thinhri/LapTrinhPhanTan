import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.rmi.registry.LocateRegistry;
 
public class MyServerSV {
     public static void main(String[] args) {
        try {
            TinhToan tt = new TinhToan();
//            UnicastRemoteObject.exportObject(tt);
            LocateRegistry.createRegistry(1099);
            InetAddress ip = InetAddress.getLocalHost();
            Naming.bind("rmi://" + ip.getHostName() + "/TinhToan", tt);
            System.out.print("Hello: ");
        } catch (Exception tt) {
            System.out.print(tt);
        }
    }
}
