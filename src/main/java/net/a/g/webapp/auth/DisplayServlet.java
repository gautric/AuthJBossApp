package net.a.g.webapp.auth;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {

	/**
	 * @serialVersionUID
	 */
	private static final long serialVersionUID = -3614750675520367508L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = new PrintWriter(System.out);
		out = response.getWriter();

		final Principal userPrincipal = request.getUserPrincipal();

		out.println("Hello world ! (" + userPrincipal.getName() + ")");

		out.close();
	}
}
