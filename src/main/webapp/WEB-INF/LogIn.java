import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LogIn extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Your Id<br>");
		String c = request.getParameter("param1");
		out.println(c + "<br>");
		out.println("your password<br>");
		String d = request.getParameter("param2");
		out.println(d + "<br>");
		
	}
}