/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclient;

import test.Nhanvienbean;

/**
 *
 * @author USER
 */
public class testdos {
    public static void main(String[] args) {
        System.out.println(tich(2,7));
        System.out.println(hello("hahaah"));
        System.out.println(getSach());
        
    }

    private static int tich(int a, int b) {
        test.DichVu_Service service = new test.DichVu_Service();
        test.DichVu port = service.getDichVuPort();
        return port.tich(a, b);
    }

    private static String hello(java.lang.String name) {
        test.DichVu_Service service = new test.DichVu_Service();
        test.DichVu port = service.getDichVuPort();
        return port.hello(name);
    }

    private static java.util.List<test.Nhanvienbean> getnv() {
        test.DichVu_Service service = new test.DichVu_Service();
        test.DichVu port = service.getDichVuPort();
        return port.getnv();
    }

    private static java.util.List<test.Sachbean> getSach() {
        test.DichVu_Service service = new test.DichVu_Service();
        test.DichVu port = service.getDichVuPort();
        return port.getSach();
    }

    private static java.util.List<test.Sachbean> timkiem(java.lang.String key) {
        test.DichVu_Service service = new test.DichVu_Service();
        test.DichVu port = service.getDichVuPort();
        return port.timkiem(key);
    }
    
}
