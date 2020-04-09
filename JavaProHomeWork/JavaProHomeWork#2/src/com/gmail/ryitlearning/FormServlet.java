package com.gmail.ryitlearning;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Survey", urlPatterns = {"/form"})
public class FormServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        int age = Integer.parseInt(req.getParameter("age"));

        String q1r1 = req.getParameter("q1r1");
        String q1r2 = req.getParameter("q1r2");

        String q2r1 = req.getParameter("q2r1");
        String q2r2 = req.getParameter("q2r2");

        String q3r1 = req.getParameter("q3r1");
        String q3r2 = req.getParameter("q3r2");


        PrintWriter pw1 = resp.getWriter();
        pw1.println("<html><head><title>Filled Form:</title></head>");
        pw1.println("<body>");
        pw1.println("First Name: "  + firstName + "</br>");
        pw1.println("Last Name: " + lastName + "</br>");
        pw1.println("Age: " + age + "</br>");

        if (q1r1 != null) {
            pw1.println("Question 1 response: " + q1r1 + "</br>");
        } else {
            pw1.println("Question 1 response: " + q1r2 + "</br>");
        }

        if (q2r1 != null) {
            pw1.println("Question 2 response: " + q2r1 + "</br>");
        } else if (q2r2 != null) {
            pw1.println("Question 2 response: " + q2r2 + "</br>");
        }

        if (q3r1 != null) {
            pw1.println("Question 3 response: " + q3r1 + "</br>");
        }  else if (q3r2 != null){
            pw1.println("Question 3 response: " + q3r2 + "</br>");
        }

        pw1.println("</body></html>");
    }
}