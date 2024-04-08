/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.*;
import java.rmi.*;
    public interface ITinhToan extends Remote {
        public ArrayList GetSv() throws RemoteException;
        public ArrayList TimSv(String hoten) throws RemoteException;
    }