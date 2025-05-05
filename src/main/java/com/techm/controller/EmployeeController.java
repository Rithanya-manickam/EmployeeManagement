package com.techm.controller;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
       	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       		//1. Set response type
       		response.setContentType("text/html");
       		//2. Create output Stream
       		PrintWriter out=response.getWriter();
       		//3. Read form data
       		String name=request.getParameter("employeeName");
       		String id=request.getParameter("employeeId");
       		String designation=request.getParameter("designation");
       		double salary= Double.parseDouble(request.getParameter("Salary"));
       		int experience=Integer.parseInt(request.getParameter("totalExperience"));
       		

       	}
}
