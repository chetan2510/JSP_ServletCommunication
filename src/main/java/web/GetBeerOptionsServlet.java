package web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetBeerOptionsServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");

        // NOTE: if we are not using JSP then use this code below

//        PrintWriter out = response.getWriter();
//        out.println("Beer selection advice<br>");
//        String c = request.getParameter("color");
//        out.println("<br>Got beer color" +c);

        // This shows how to transfer the request to the jsp viewer after logical implementation
        // JSP then creates a HTML page and then adds the response accordingly in that page
        request.setAttribute("style", "no result found sorry");
        RequestDispatcher view = request.getRequestDispatcher("BeerAdvice.jsp");
        view.forward(request, response);


    }
}
