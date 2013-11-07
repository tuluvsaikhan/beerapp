package com.example.web;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;


/**
 * Servlet implementation class BeerSelect
 */
@WebServlet("/BeerSelect2")
public class BeerSelect2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeerSelect2() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
						  HttpServletResponse response) 
						  throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice <br>");
		String c = request.getParameter("color");
		out.println("getting parameter from request...");
		
		BeerExpert be = new BeerExpert();                //model or business logic
		List<String> result = be.getBrands(c);
		out.println("instantiating business logic class and passing in the parameter...");
		
		
		out.println("Manually printing results...");
		Iterator<String> it = result.iterator();         //manually show
		while(it.hasNext()){
			out.print("<br> try: "+ it.next());
		}
	}

}
