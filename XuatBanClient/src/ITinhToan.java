
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ITinhToan extends Remote{
    public ArrayList<SachBean> getS() throws RemoteException;
    public ArrayList<NhaXuatBanBean> getNXB() throws RemoteException;
    public ArrayList<SachBean> HtTimKiem(String Tim) throws RemoteException;
    public double TbThanhTien(String manxb) throws RemoteException;
    public ArrayList<SachBean> MaxSL() throws RemoteException;
    
}
