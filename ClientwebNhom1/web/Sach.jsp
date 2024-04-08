<%@page import="bean.loaibean"%>
<%@page import="java.util.List"%>
<%@page import="test.Sachbean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book List</title>
    </head>
    <body>
        <h1>Book List</h1>

        <%-- Retrieve the list of books from the request --%>


        <form action="SachController" method="post">
            <input type="text" name="txttim" placeholder="Nhập">
            <input type="submit" value="Tìm">
        </form>
        <table>
            <td width="15%" valign="top">
                <table class="table table-hover" style="font-size:18px">
                    <h3> Danh mục thể loại</h3>
                    <%
                        try {
                            ArrayList<test.Loaibean> dsloai = (ArrayList<test.Loaibean>) request.getAttribute("dsLoai");

                            if (dsloai != null && !dsloai.isEmpty()) {
                                for (int j = 0; j < dsloai.size(); j++) {
                    %>
                    <tr>
                        <td><%= dsloai.get(j).getTenloai()%></td>
                        
                    </tr>
                    <%
                        }
                    } else {
                    %>
                    <tr>
                        <td colspan="5">No books found.</td>
                    </tr>
                    <%
                            }
                        } catch (Exception ex) {
                            // TODO handle custom exceptions here
                        }
                    %>
                </table>
            </td>
        </table>
        <table>
            <tr>
                <th>Mã sách</th>
                <th>Tên sách</th>
                <th>Giá Bán</th>
                <th>Số lượng</th>
                <th>Mã loại</th>
            </tr>
            <%
                try {
                    ArrayList<test.Sachbean> ds = (ArrayList<test.Sachbean>) request.getAttribute("dsSach");

                    if (ds != null && !ds.isEmpty()) {
                        for (int i = 0; i < ds.size(); i++) {
            %>
            <tr>
                <td><%= ds.get(i).getMasach()%></td>
                <td><%= ds.get(i).getTensach()%></td>
                <td><%= ds.get(i).getGia()%></td>
                <td><%= ds.get(i).getSoluong()%></td>
                <td><%= ds.get(i).getMaloai()%></td>
            </tr>
            <%
                }
            } else {
            %>
            <tr>
                <td colspan="5">No books found.</td>
            </tr>
            <%
                    }
                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                }
            %>

        </table>
    </body>
</html>
