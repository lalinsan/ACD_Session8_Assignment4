/*
* Student: Eduardo Aguirre
* Session 8
* Assignment 4
* Servlet to view Cookies for first and last name . 
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


/**
 * Servlet implementation class ViewCookies
 */
@WebServlet("/ViewCookies")
public class ViewCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie cookies []= request.getCookies(); //Stores Cookies in the Cookies array
		PrintWriter out = response.getWriter();
		for(Cookie c: cookies)   //Displays the Cookies
		{
			out.println("Cookie:"+" "+c.getName()+" | " +"Value:"+" "+c.getValue() + " | " +"Max Age:"+" "+c.getMaxAge());
		}
		
		
	}

}
