
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
    public khachhangBean Ktdn(String tk, String mk) throws RemoteException;
    public boolean ChuyenKhoan(String tkc, String tkn, int stgd) throws RemoteException;
    public boolean RutTien(String tk, int stgd) throws RemoteException;
    public boolean TruTien(String tk, int stt) throws RemoteException;
    public boolean CongTien(String tk, int stc) throws RemoteException;
    public boolean DoiMatKhau(String tk, String mkm) throws RemoteException;
    public boolean KTSoDu(String tk, int stgd) throws RemoteException;
    public boolean NapTien(String tk, int stgd) throws RemoteException;
    public khachhangBean Kttk(String tk) throws RemoteException;
    public ArrayList<ChiTietGiaoDichBean> getls(String tk) throws RemoteException;
    public ArrayList<ChiTietGiaoDichBean> getlstn(String Stk, String Ngay) throws RemoteException;
    public List<String> LayNgay(String stk) throws RemoteException;
    public boolean KhoaTK(boolean khoa, String stk) throws RemoteException;
    public int KtrRutTien(String tk) throws RemoteException;
    public boolean Kttt(String tk) throws RemoteException;
    public boolean CapNhatTT(String tk) throws RemoteException;
}
