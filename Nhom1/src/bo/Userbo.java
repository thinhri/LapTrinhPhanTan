
package bo;

import bean.Userbean;
import dao.Userdao;
import java.util.ArrayList;


public class Userbo {
    Userdao usdao = new Userdao();
    ArrayList<Userdao> ds;
    public Userbean getUser(String tendn, String pass) throws  Exception{
        return usdao.getUser(tendn, pass);
    }
    // Trong lớp Userbo.java
    public boolean Hople(String tendn, String pass) throws Exception {
        Userbean user = usdao.getUser(tendn, pass);
        return user != null; 
    }

}
