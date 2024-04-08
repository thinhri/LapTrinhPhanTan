
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
    public ArrayList<SachBean> getS() throws RemoteException;
    public ArrayList<NhaXuatBanBean> getNXB() throws RemoteException;
    public ArrayList<SachBean> HtTimKiem(String Tim) throws RemoteException;
    public double TbThanhTien(String manxb) throws RemoteException;
    public ArrayList<SachBean> MaxSL() throws RemoteException;
    public ArrayList<SachBean> MinSL() throws RemoteException;
    
}
