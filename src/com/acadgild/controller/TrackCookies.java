/*
* Student: Eduardo Aguirre
* Session 8
* Assignment 4
* Servlet that create Cookies for first and last name . 
*/

package com.acadgild.controller;

//Import necessary Classes from the Java API library
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TrackCookies
 */
@WebServlet("/TrackCookies")
public class TrackCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		@SuppressWarnings("unused")
		PrintWriter out = response.getWriter();
		
		String firstName = request.getParameter("firstName");  //Stores First Name
		String lastName = request.getParameter("lastName");   //Stores Last Name
		HttpSession session = request.getSession(true); //Stores HHTP Session 
		session.setAttribute("firstName", firstName); //Set User Name Attribute
		session.setAttribute("lastName", lastName); //Set User Name Attribute
		
		//Cookies for First Name 
		Cookie fName = new Cookie ("firstName", request.getParameter("firstName")); //Creates a Cookie instance for First Name
		response.addCookie(fName); //Add Cookie
		fName.setMaxAge(60*60*24); //Set expire date after 24 hrs
		
		
		
		Cookie lName = new Cookie ("lastName", request.getParameter("lastName")); //Creates a Cookie instance for Last Name
		response.addCookie(lName); //Add Cookie
		lName.setMaxAge(60*60*24); //Set expire date after 24 hrs
		
				
	}

}
