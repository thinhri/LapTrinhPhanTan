/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.nhanvienbean;
import java.util.ArrayList;


public class nhanviendao {
    public ArrayList<nhanvienbean> getds() throws Exception{
        ArrayList<nhanvienbean> ds = new ArrayList<nhanvienbean>();
        ds.add(new nhanvienbean("001", "Tran An"));
        ds.add(new nhanvienbean("002", "Nhat Duy"));
        ds.add(new nhanvienbean("003", "Tien Dat"));
        return ds;
    }
}
