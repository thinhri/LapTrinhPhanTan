
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class TinhToan extends UnicastRemoteObject implements ITinhToan {

    public TinhToan() throws Exception{}
    public int[] cong(int[] a, int[] b, int vtbd, int vtkt) throws RemoteException {
        int[] c = new int[vtkt - vtbd + 1];
        int j = 0;
        for (int i = vtbd; i <= vtkt; i++) {
            c[j] = a[i] + b[i];
            j = j + 1;
        }
        System.out.println("Tong ma tran ket qua");
        for (int t = 0; t < c.length; t++) {
            System.out.print(c[t] + " ");
        }
        System.out.println();
        return c;
    }

    @Override
    public int[] nhan(int[][] a, int[][] b, int len ) throws RemoteException {
        int can = (int) Math.sqrt(len);
        int len1=0;
        int[] c = new int[can * can];
        for (int i= 0; i<can; i++){
            for(int j = 0; j<can; j++ ){
                int sum = 0;
                for (int k=0; k<can; k++){
                    sum += a[i][k] * b[k][j];
                }
                c[len1] = sum;
                len1++;
            }
        }
        System.out.println("Tich ma tran ket qua");
        for (int t = 0; t < c.length; t++) {
            System.out.print(c[t] + " ");
        }
        System.out.println();
        return c;
    }

}
