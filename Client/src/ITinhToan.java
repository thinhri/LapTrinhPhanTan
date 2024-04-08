
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ITinhToan extends Remote {
//public SinhVien GetSv(SinhVien sv) throws RemoteException;
public int[] cong(int[] a, int[] b, int vtbd, int vtkt ) throws RemoteException;
public int[] nhan(int[][] a, int[][] b, int len ) throws RemoteException;
}
