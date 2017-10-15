package Servlet;
import select.selectSql;
import test.ti;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class selectServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        selectSql selectSql = new selectSql();
        ti ti = new ti();
        try{
            String name = selectSql.select();
            if(name == null) {
               ti.setName("值为空");
            }else {
                ti.setName(name);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        request.setAttribute("ti" ,ti);
        request.getRequestDispatcher("/show.jsp").forward(request,response);




    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request ,response);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
