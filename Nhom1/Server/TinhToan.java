
public class TinhToan implements ITinhToan{

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
