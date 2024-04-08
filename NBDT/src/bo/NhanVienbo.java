/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.NhanVienbean;
import dao.NhanViendao;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class NhanVienbo {
    NhanViendao nvd = new NhanViendao();
    ArrayList<NhanVienbean> ds = new ArrayList<NhanVienbean>();
    public ArrayList<NhanVienbean> getNV() throws Exception{
        ds = nvd.getNV();
        return ds;
    }
    public String Tim(ArrayList<NhanVienbean> ds1, String ma,String mk) throws Exception{
        String tim="";
        for(NhanVienbean nv:ds1)
        {
            if(nv.getSoCMND().trim().equals(ma) && nv.getMatkhau().trim().equals(mk))
            {
                tim=nv.getManv().trim()+";"+nv.getHoten()+";"+nv.getSoCMND();
                break;
            }
        }
        return tim;
    }
}
