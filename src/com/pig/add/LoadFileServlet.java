package com.pig.add;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by zhaodonghui on 2022/3/6.
 */
public class LoadFileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String filename = req.getParameter("filename");
        String filefullnamde = "/Users/zhaodonghui/Desktop/小猪求职/项目课件/web-design/" + filename;
        FileInputStream fileInputStream = new FileInputStream(filefullnamde);
        byte[] bytes = new byte[1024];
        int i = fileInputStream.read(bytes);
        resp.setCharacterEncoding("utf-8");
//        resp.setHeader("Content-Disposition", "attachment; filename="+filename);
//        resp.setHeader("Content-Disposition", "inline; filename="+filename);
        // application/octet-stream
        // text/plain
        resp.setContentType("text/plain");
        while (i != -1) {
            resp.getOutputStream().write(bytes, 0, i);
            i = fileInputStream.read(bytes);
        }
        fileInputStream.close();
        resp.getOutputStream().flush();
    }
}
