package vn.it.servlet;

import vn.it.model.*;
import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
						HttpServletResponse response) 
						throws ServletException, IOException {
		
		
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List<String> result = be.getBrands(c);
		request.setAttribute("styles", result);
		
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
	}
}
