package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/interest")
public class InterestServlet extends HttpServlet {

	public void init() {
		System.out.println("Initializing InterestServlet");
	}

	public void destory() {
		System.out.println("Destroying InterestServlet");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double amount = Double.parseDouble(request.getParameter("amount"));
		double rate = Double.parseDouble(request.getParameter("rate"));

		double interest = amount * rate / 100;
		response.setContentType("text/html");
		response.getWriter().println("<h2>Interest = " + interest + "</h2>");
	}
}
