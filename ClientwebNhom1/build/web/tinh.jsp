<%-- 
    Document   : tinh
    Created on : Nov 28, 2023, 2:22:51 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	test.DichVu_Service service = new test.DichVu_Service();
	test.DichVu port = service.getDichVuPort();
	 // TODO initialize WS operation arguments here
	int a = 0;
	int b = 0;
	// TODO process result here
	int result = port.tich(a, b);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        <%-- start web service invocation --%><hr/>
    <%
    try {
	test.DichVu_Service service = new test.DichVu_Service();
	test.DichVu port = service.getDichVuPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "An an cuc";
	// TODO process result here
	java.lang.String result = port.hello(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	test.DichVu_Service service = new test.DichVu_Service();
	test.DichVu port = service.getDichVuPort();
	// TODO process result here
	java.util.List<test.Nhanvienbean> result = port.getnv();
//	out.println("Result = "+result);
        for (test.Nhanvienbean nhanvien : result){
            out.println("Manv: "+ nhanvien.getManv());
            out.println("Ten: "+ nhanvien.getHoten());
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	test.DichVu_Service service = new test.DichVu_Service();
	test.DichVu port = service.getDichVuPort();
	// TODO process result here
	java.util.List<test.Sachbean> result = port.getSach();
	out.println("Result = "+result);
        for (test.Sachbean sach : result){
            out.print("Ma sach: "+ sach.getMasach());
            out.print("Ten sach: "+ sach.getTensach());
            out.print("Gia: "+ sach.getGia());
            out.print("So luong: "+ sach.getSoluong());
            out.println("Ma loai: "+ sach.getMaloai());
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	test.DichVu_Service service = new test.DichVu_Service();
	test.DichVu port = service.getDichVuPort();
	 // TODO initialize WS operation arguments here
	java.lang.String key = "";
	// TODO process result here
	java.util.List<test.Sachbean> result = port.timkiem(key);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

</html>
