package com.edureka.service.serverside;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ProcessingServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        Cookie cookie = new Cookie("userid", "ssdsdfsdfsdfsdf");
        response.addCookie(cookie);

        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("savedUser");

        writer.write("<h1>Response send from processing servlet</h1>");
        writer.write("<h2>"+username+"</h2>");
    }
}