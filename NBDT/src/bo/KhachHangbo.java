/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.KhachHangbean;
import dao.KhachHangdao;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class KhachHangbo {
    KhachHangdao khdao = new KhachHangdao();
    ArrayList<KhachHangbean> ds = new ArrayList<KhachHangbean>();
    public ArrayList<KhachHangbean> getKH() throws Exception{
        ds = khdao.getKH();
        return ds;
    }
    
    public String TimKh(ArrayList<KhachHangbean> ds1, String SoTaiKhoan, String SoCMND) throws Exception{
        String Tim="";
        for (KhachHangbean kh:ds1)
            if(kh.getSoTaiKhoan().trim().equals(SoTaiKhoan) && kh.getSoCMND().trim().equals(SoCMND))
            {
                Tim=kh.getHoTen()+"+"+kh.getSoTien();
                break;
            }
        return Tim;
    }
}
