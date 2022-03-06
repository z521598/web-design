package com.pig.add;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhaodonghui on 2022/2/25.
 */
public class AddAjaxServlet extends HttpServlet {
    private static final Gson gson = new Gson();

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
            resp.getWriter().append(gson.toJson(addbean));
            resp.getWriter().flush();
        } catch (Exception e) {
            resp.sendRedirect("error.jsp?msg=a/b_is_null");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        throw new RuntimeException("not support");
    }

}
