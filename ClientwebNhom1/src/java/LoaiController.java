import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/LoaiController"})
public class LoaiController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");

            List<test.Sachbean> ds = getSach();
            String key = request.getParameter("txttim");
            if (key != null && !key.isEmpty()) {
               
                ds = timkiem(key);
            }
           
             if (!ds.isEmpty() && ds.size() >= 2) {
            System.out.println(ds.get(1).getTensach());
            }
            request.setAttribute("dsSach", ds);
            RequestDispatcher dct = request.getRequestDispatcher("Sach.jsp");
            dct.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
