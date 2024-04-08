

import java.rmi.Naming;
import java.util.ArrayList;


public class MyClient {
    public static void main(String[] args) {
    try{
//    ITinhToan tt= (ITinhToan)Naming.lookup("rmi://localhost/TinhToan");
//    ITinhToan tt = (ITinhToan)Naming.lookup("rmi://localhost/TinhToan");
    ITinhToan tt = (ITinhToan)Naming.lookup("rmi://192.168.1.97:1099/TinhToan");
    ArrayList<loaibean> ds = tt.getloai();
    for(loaibean loai: ds){
        System.out.println(loai.getMaloai()+":"+loai.getTenloai());
    }
    }catch(Exception tt) {
        tt.printStackTrace();
    }
  }
}
