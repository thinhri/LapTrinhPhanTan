
import java.net.InetAddress;
import java.util.*;
import java.rmi.*;
import java.util.Random;

public class Client {

    public static Thread[] td = new Thread[2];
    public static int somay = 2;
    public static String[] ip = {"10.10.64.163", "10.10.66.52"};
    public static int len = 4;
    public static int[] a = new int[len];
    public static int[] b = new int[len];

    public static class Xuly extends Thread {

        int i;

        public Xuly(int i) {
            this.i = i;
        }

        public void run() {
            try {
                ITinhToan server = (ITinhToan) Naming.lookup("rmi://" + ip[i] + "/TinhToan");
                System.out.println("Server:" + ip[i] + " dang tinh toan: ");
                if (i == 0) {
                    System.out.println("Nua tong dau ma tran");
                    xuat(server.cong(a, b, 0, len / 2 - 1));
                    System.out.println("Nua tich dau ma tran");
                    xuat2(server.nhan(haichieu(a), haichieu(b), len), 0, len / 2 - 1);
                    System.out.println();
                    System.out.println("Server:" + ip[i] + " da tinh toan nua dau 2 ma tran");
                    td[0].stop();
                }else {
                    System.out.println("Nua tong sau ma tran");
                    xuat(server.cong(a, b, len / 2, len - 1));
                    System.out.println("Nua tich sau ma tran");
                    xuat2(server.nhan(haichieu(a), haichieu(b), len), len / 2, len - 1);
                    System.out.println();
                    System.out.println("Server:" + ip[i] + " da tinh toan nua sau 2 ma tran");
                    td[1].stop();
                }
            } catch (Exception tt) {
                System.out.print("loi");
            }
        }
    }

    public static void xuat(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void xuat2(int[] a, int bd, int kt){
        for (int i = bd; i <= kt; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    
    public static int[][] haichieu(int[] a){
        int can = (int) Math.sqrt(len);
        int[][] c = new int[can][can];
        int k=0;
        
        for (int i = 0; i < can; i++){
            for (int j = 0; j < can; j++){
                if (k < a.length){
                    c[i][j] = a[k];
                    k++;
                }
            }
        }
        return c;
    }

    public static void main(String[] st) {
        try {
            Random r = new Random();

            for (int i = 0; i < len; i++) {
                a[i] = r.nextInt(10);
                b[i] = r.nextInt(10);
            }
            xuat(a);
            xuat(b);
            for (int i = 0; i < somay; i++) {
                td[i] = new Xuly(i);
                td[i].start();
            }
        } catch (Exception tt) {
            System.out.print(tt.getMessage());
        }
    }
}
