/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.loaibean;
import dao.loaidao;
import java.util.ArrayList;

public class loaibo {
    loaidao ldao = new loaidao();
    ArrayList<loaibean> ds;
    public ArrayList<loaibean> getloai() throws Exception{
        ds =ldao.getloai();
        return ds;
    }
    public String Timloai(String tenloai) throws Exception{
        for(loaibean l:ds)
            if(l.getTenloai().equals(tenloai))
                return l.getMaloai();
        return null;
    }
}
