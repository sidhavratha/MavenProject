package org.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println( getContent() );
        out.flush();
        out.close();
    }

    protected String getContent()
    {
        return "SimpleServlet Executed";
    }
}