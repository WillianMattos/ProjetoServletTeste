package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OiMundo extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request,
	HttpServletResponse response)
		throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		/*---------------------------HTML------------------------*/
		out.println("<html>");
			out.println("<head>");
				out.println("<title>Home</title>");
			out.println("</head>");
			out.println("<body>");
				out.println("<h1>Envie-me um e-mail:</h1>");
				out.println("<form>");
					out.println("<input type='text' name='email'>");
					out.println("<input type='reset'>");
				out.println("</form>");
			out.println("</body>");
		out.println("</html>");
		/*-------------------------------------------------------*/
	}
}
