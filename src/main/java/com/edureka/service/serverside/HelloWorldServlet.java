package com.edureka.service.serverside;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class  HelloWorldServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest servletRequest, HttpServletResponse response) throws ServletException, IOException {
        if(servletRequest.getParameter("username").equalsIgnoreCase("naveen")){
            HttpSession session = servletRequest.getSession();
            session.setAttribute("savedUser", servletRequest.getParameter("username"));
            //RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("nameofthesecondservlet");
            //dispatcher.forward(servletRequest,response);
        } else {
            response.sendRedirect("http://www.google.com");
        }

    }

    @Override
    public void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse){}



}



