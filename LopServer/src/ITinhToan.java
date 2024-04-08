
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public interface ITinhToan extends Remote{
    public ArrayList<SinhVienBean> getSV() throws RemoteException;
    public ArrayList<LopBean> getL() throws RemoteException;
    public ArrayList<SinhVienBean> HtTimKiem(String Tim) throws RemoteException;
    public double TbDiemLT(String madonvi) throws RemoteException;
    public boolean Ktdn(String masv, String pass) throws RemoteException;
    public long TongSoLuongSV(String malop) throws RemoteException;
    public ArrayList<SinhVienBean> SapXepDiemLTTang() throws RemoteException;
    
}
