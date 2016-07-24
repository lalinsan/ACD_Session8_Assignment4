/*
* Student: Eduardo Aguirre
* Session 8
* Assignment 4
* Servlet that delete Cookies for first and last name . 
*/


package com.acadgild.controller;

//Import necessary Classes from the Java API library
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteCookies
 */
@WebServlet("/DeleteCookies")
public class DeleteCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Cookie fName = new Cookie ("fName", "");  //Create a instance of Cookie for first name
		fName.setMaxAge(0); //Set first name cookie to 0
		response.addCookie(fName);
		
		Cookie lName = new Cookie ("lName", ""); //Create a instance of Cookie for last name
		lName.setMaxAge(0); //Set lastst name cookie to 0
		response.addCookie(lName);
		
	}

}
