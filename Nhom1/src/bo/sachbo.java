/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.sachbean;
import dao.sachdao;
import java.util.ArrayList;


public class sachbo {
    sachdao sdao = new sachdao();
    public ArrayList<sachbean> getsach() throws Exception{
        return sdao.getsach();
    }
//    public ArrayList<sachbean> hiensach(String maloai) throws Exception{
//        return sdao.hiensach(maloai);
//    }

    public String getDSSach(ArrayList<sachbean>ds,String maloai) throws Exception{
        String s="";
//        ArrayList<sachbean>dsSach = new ArrayList<>();
        for (int i = 0; i < ds.size(); i++) {
                    if (ds.get(i).getMaloai().trim().equals(maloai.trim())) {
                        String s1= ds.get(i).getMasach()+"+"+ds.get(i).getTensach()
                                +"+"+ds.get(i).getSoluong()+"+"+ds.get(i).getGia()+";";
                        s+=s1;
                    }
                }
        return s;
    }

}



