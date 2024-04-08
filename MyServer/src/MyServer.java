
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;


public class MyServer {
  public static void main(String[] args) {
    try{
     TinhToan tt= new TinhToan();
     //Quang ba doi tuong tt de may khach co the goi phuong thuc trong tt
//     UnicastRemoteObject.exportObject(tt);
     LocateRegistry.createRegistry(1099);
     //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
//     Naming.bind("rmi://localhost/TinhToan",tt);
     Naming.bind("rmi://192.168.1.193/TinhToan",tt);
     System.out.print("Da cho may khach goi den:");
    }catch(Exception tt)   { 
       tt.printStackTrace();
    }
  }
}

