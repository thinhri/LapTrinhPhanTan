
package dao;

import bean.Userbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Userdao {
    public Userbean getUser(String tendn, String pass) throws Exception{
        ArrayList<Userbean> ds = new ArrayList<Userbean>();
        KetNoi kn = new KetNoi();
        Userbean us = null;
        kn.ketnoi();
        String sql = "select * from KhachHang where tendn=? and pass=?";
        PreparedStatement cmd = kn.cn.prepareStatement(sql);
        cmd.setString(1, tendn);
        cmd.setString(2, pass);
        ResultSet rs = cmd.executeQuery();
        while(rs.next()){
            String username = rs.getString("tendn");
            String password = rs.getString("pass");
            us = new Userbean(username, password);
        }
        rs.close();
        kn.cn.close();
        return us;
    }
}
