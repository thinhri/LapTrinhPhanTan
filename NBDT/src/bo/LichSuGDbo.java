/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.LichSuGDbean;
import dao.LichSuGDdao;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class LichSuGDbo {
    ArrayList<LichSuGDbean> ds = new ArrayList<LichSuGDbean>();
    LichSuGDdao lsdao = new LichSuGDdao();
    public ArrayList<LichSuGDbean> getLS() throws Exception{
        ds = lsdao.getLS();
        return ds;
    }
    public String TimLS(ArrayList<LichSuGDbean> ds1, String SoTK) throws Exception{
        String tim="";
        for(LichSuGDbean l:ds1)
        {
            if(l.getSoTaiKhoan().trim().equals(SoTK))
            {
                tim+=l.getNgayRutTien()+";"+l.getSoTienRutRa()+";";
            }
        }
        return tim;
    }
            
}
