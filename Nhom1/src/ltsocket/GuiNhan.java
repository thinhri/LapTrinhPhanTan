package ltsocket;


import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class GuiNhan {
    ServerSocket Sserver;
    public void MoCong(int cong) throws Exception{
        Sserver = new ServerSocket(cong);
        System.out.println("Da mo cong: "+cong);
    }
    public String Nhan() throws Exception{
        
            Socket c=  Sserver.accept() ;//lặp vô hạn để đợi kết nối đến
            //Tạo luồng để nhận thông tin client gửi lên
            InputStreamReader is= new InputStreamReader(c.getInputStream());
            //Tạo bộ đệm để lưu dữ liệu nhận về
            BufferedReader r= new BufferedReader(is);
//          Sserver.close();
            return r.readLine();
    }
    public void Gui(String tb, String IpServer, int cong) throws Exception{
        Socket c = new Socket(IpServer,cong);
        DataOutputStream out = new DataOutputStream(c.getOutputStream());
        out.writeBytes(tb);
        out.write(13);
        out.write(10);
        out.close();
    }
}
