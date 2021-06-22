

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Form")
public class Form extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String name = request.getParameter("name");
			String pin = request.getParameter("pin");
			String phone = request.getParameter("phone");
			
			if(name.equals("AJ") && pin.equals("000") && phone.equals("6590618429")) {
				HttpSession session = request.getSession();
				session.setAttribute("name","name");
				response.sendRedirect("welcome.jsp");
				
			}
			else {
				response.sendRedirect("Login.jsp");
			}
					
			}

}
