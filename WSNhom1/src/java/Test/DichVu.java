/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import bean.loaibean;
import bean.nhanvienbean;
import bean.sachbean;
import dao.KetNoi;
import dao.loaidao;
import dao.nhanviendao;
import dao.sachdao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USER
 */
@WebService(serviceName = "DichVu")
public class DichVu {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Tich")
    public int Tich(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        int s = a + b;
        return s;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getnv")
    public ArrayList<nhanvienbean> getnv() {
        try {
            nhanviendao nvdao = new nhanviendao();
            return nvdao.getds();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getSach")
    public java.util.ArrayList<sachbean> getSach() {
        try {
            sachdao sdao = new sachdao();
            return sdao.getsach();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Timkiem")
    public java.util.ArrayList<sachbean> Timkiem(@WebParam(name = "key") String key) {
        try {
            sachdao sdao = new sachdao();
            return sdao.timkiem(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getLoai")
    public java.util.ArrayList<loaibean> getLoai() {
        try {
            loaidao ldao = new loaidao();
            return ldao.getloai();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
