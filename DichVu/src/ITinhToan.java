
import java.rmi.Remote;
import java.util.ArrayList;


public interface ITinhToan extends Remote{
//    public int Cong(int a, int b) throws Exception;
//    public int Tru(int a, int b) throws Exception;
//    public int Nhan(int a, int b) throws Exception;
//    public double Chia(int a, int b) throws Exception;
    public ArrayList<loaibean> getloai() throws Exception;
}
