package net.a.g.webapp.auth;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogOutServlet
 */
public class LogOutServlet extends HttpServlet {

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
		final Principal userPrincipal = request.getUserPrincipal();
		response.setHeader("Cache-Control", "no-cache, no-store");
		response.setHeader("Pragma", "no-cache");
		request.getSession().invalidate();// remove session.
		request.logout();
		response.sendRedirect(request.getContextPath());
	}

}
