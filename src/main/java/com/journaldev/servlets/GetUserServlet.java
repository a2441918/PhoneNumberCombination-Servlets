package main.java.com.journaldev.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/GetUserServlet")
public class GetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String user;
	PrintWriter pw;
	HttpSession session;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetUserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		user = request.getParameter("login");
		System.out.println(user);
		response.getWriter().println("<p> The number entered is: " + user + "<p>");
		Main obj = new Main();
		ArrayList<String> abc = obj.letterCombinations(user);
		response.getWriter().print("<p> The total number of combinations is: " +abc.size() +"<p>");
		
		response.getWriter().print("<table border = \"1\">");
		
		for(int i=0;i<abc.size();i++)
		{
			response.getWriter().print("<tr>");
			response.getWriter().print("<td>"+(i+1)+"</td>");
			response.getWriter().print("<td>"+abc.get(i)+"</td>");
		}
		
		response.getWriter().print("</table>");


	}

}
