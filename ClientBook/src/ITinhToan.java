
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public interface ITinhToan extends Remote {

    public ArrayList<BookBean> Show() throws RemoteException;
    public List<String> LayMaLoai() throws RemoteException;
    public ArrayList<BookBean> getds(String maloai) throws RemoteException;
    public ArrayList<BookBean> HtTimKiem(String Tim) throws RemoteException;
    public List<String> LayMaLoaiTuType() throws RemoteException;
    public ArrayList<TypeBean> getloai() throws RemoteException;

}
