/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import dao.KetNoiDao;


public class KetNoibo {
    KetNoiDao kn = new KetNoiDao();
    public void ketnoi() throws Exception{
        kn.KetNoi();
    }
}
