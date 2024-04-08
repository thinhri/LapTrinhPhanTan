/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.Luongbean;
import dao.Luongdao;
import java.util.ArrayList;


public class Luongbo {
    Luongdao ldao = new Luongdao();
    ArrayList<Luongbean> ds = new ArrayList<Luongbean>();
    public ArrayList<Luongbean> getluong() throws Exception{
        ds = ldao.getluong();
        return ds;
    }
    
    public String Tim(ArrayList<Luongbean> ds1, String ma) throws Exception{
        String tim="";
        for(Luongbean l:ds1)
        {
            if(l.getManv().trim().equals(ma))
            {
                tim+=l.getMaluong()+";"+l.getLuongcoban()+";"+l.getPhucap()+";"+l.getManv()+";";
            }
        }
        return tim;
    }
}
