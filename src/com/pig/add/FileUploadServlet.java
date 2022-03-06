package com.pig.add;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhaodonghui on 2022/2/25.
 */
// Srevlet3.0
@MultipartConfig
public class FileUploadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        throw new RuntimeException("not support");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part part = req.getPart("c");
        System.out.println(part.getSubmittedFileName());
        InputStream inputStream = part.getInputStream();
        // File.separator;
        // // // UUID.randomUUID
        File file = new File("/Users/zhaodonghui/Desktop/小猪求职/项目课件/web-design/a.txt");
        file.createNewFile();
        byte[] bytes = new byte[1024];
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        int i = inputStream.read(bytes);
        while (i != -1) {
            fileOutputStream.write(bytes, 0, i);
            i = inputStream.read(bytes);
        }
    }

}
