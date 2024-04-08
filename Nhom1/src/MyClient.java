
import java.rmi.Naming;


public class MyClient {
    public static void main(String[] args) {
    try{
//    ITinhToan tt= (ITinhToan)Naming.lookup("rmi://localhost/TinhToan");
    ITinhToan tt = (ITinhToan)Naming.lookup("rmi://localhost:1099/TinhToan");
    System.out.println(tt.Cong(10,20));
    System.out.println(tt.Tru(30,10));
    System.out.println(tt.Nhan(2,3));
    System.out.println(tt.Chia(4,2));
    }catch(Exception tt) {
        tt.printStackTrace();
    }
  }
}
