package com.pig.add;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhaodonghui on 2022/2/25.
 */
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a = req.getParameter("a");
        String b = req.getParameter("b");
        try {
            Integer a1 = Integer.parseInt(a);
            Integer b1 = Integer.parseInt(b);
            Integer res = a1 + b1;
            Addbean addbean = new Addbean();
            addbean.setA(a1);
            addbean.setB(b1);
            addbean.setRes(res);
            req.setAttribute("addRes", addbean);
            req.getRequestDispatcher("show.jsp").forward(req, resp);
        } catch (Exception e) {
            resp.sendRedirect("error.jsp?msg=a/b_is_null");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        throw new RuntimeException("not support");
    }

}
