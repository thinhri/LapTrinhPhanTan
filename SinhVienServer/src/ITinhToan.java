
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;


public interface ITinhToan extends Remote{
    public ArrayList<DonViBean> getDV() throws RemoteException;
    public ArrayList<SinhVienBean> getSV() throws RemoteException;    
    public ArrayList<SinhVienBean> HtTimKiem(String Tim) throws RemoteException;
    public double TbHeSoLuong(String madonvi) throws RemoteException;
    public boolean Ktdn(String hoten, String pass) throws RemoteException;
    
}
