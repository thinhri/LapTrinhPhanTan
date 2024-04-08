
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class TinhToan extends UnicastRemoteObject implements ITinhToan{

    public TinhToan() throws RemoteException {
    }
    

    @Override
    public int Cong(int a, int b) throws Exception {
        int s = a + b;
        System.out.println("Tong: "+s);
        return s;
    }

    @Override
    public int Tru(int a, int b) throws Exception {
        int s = a - b;
        System.out.println("Hieu: "+s);
        return s;
    }

    @Override
    public int Nhan(int a, int b) throws Exception {
        int s = a * b;
        System.out.println("Nhan: "+s);
        return s;
    }

    @Override
    public double Chia(int a, int b) throws Exception {
        double s = a / b;
        System.out.println("Chia: "+s);
        return s;
    }
    
    
}
