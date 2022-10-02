package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "MainServlet", urlPatterns = "/test")
public class MainServlet extends HttpServlet {

    private int count = 0;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count++;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        try (PrintWriter writer = resp.getWriter()) {
            writer.write("<h2>HELLO<h2>");
            writer.write("<h2>URI <h2>" + req.getRequestURI());
            writer.write("<br>");
            writer.write("<h2>HeaderNames <h2>" + String.valueOf(req.getHeaderNames()));
            writer.write("<br>");
            writer.write("<h2>Method <h2>" + req.getMethod());
            writer.write("<br>");
            writer.write("<h2>ip address " + req.getRemoteAddr());
            writer.write("<br>");
            writer.write("<h2>nameUser <h2>" + req.getRemoteUser());
            writer.write("<br>");
            writer.println("<h2 align = \"center\">" + count + "</h2>");
        }
    }
}

