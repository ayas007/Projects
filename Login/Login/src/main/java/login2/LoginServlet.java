package login2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con;

	public void init(ServletConfig config) throws ServletException {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			System.out.println("Connection Established Successfully");
		} catch (ClassNotFoundException | SQLException e)

		{
			e.printStackTrace();

		}

	}
	 

 
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	
		try {
			String s1=request.getParameter("uname"); 
			String s2=request.getParameter("pword");
			
			PreparedStatement pstmt=con.prepareStatement("select*from uinfo where uname=? and pword=?");
			pstmt.setString(1, s1);
			pstmt.setString(2, s2);
			
			ResultSet rs=pstmt.executeQuery();
			PrintWriter pw=response.getWriter();
			pw.println("<html><body bgcolor=green text=yellow><center><h1>");
			if(rs.next())
			{
				pw.println("Welcome :"+s1);
			}
			else
			{
				pw.println("Invalid Username/Password");
				
			}
			pw.println("</h1></center></body></html>");
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void destroy() {
	 try {
		con.close();
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}



	 
}
