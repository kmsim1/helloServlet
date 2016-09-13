package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *  request, response 객체는 클라이언트로부터 리퀘스트가 올때마다 객체가 만들어지도록 되어있음.
	 *  
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read form data(form 데이터를 읽어 오는 부분)
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// perform business logic
		
		PrintWriter out = response.getWriter();
		
		//Build HTML code
		String htmlResponse="<html>";
		
		htmlResponse += "<h2> Your name is : " + username + "<br/>";
		htmlResponse += " Your password is : " + password + "<h2>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
		
	
	}

}