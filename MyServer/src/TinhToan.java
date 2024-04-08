
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


public class TinhToan extends UnicastRemoteObject implements ITinhToan{
    
    public TinhToan() throws Exception{
    }

    @Override
    public ArrayList<loaibean> getloai() throws Exception {
        ArrayList<loaibean> ds = new ArrayList<loaibean>();
        ds.add(new loaibean("11", "CNTT"));
        ds.add(new loaibean("12", "TOAN"));
        ds.add(new loaibean("13", "LY"));
        return ds;
    }
    
    
}
