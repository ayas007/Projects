package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends GenericServlet {

	Connection con;

	public void init(ServletConfig config) throws ServletException {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			System.out.println("Connection Established Successfully");
		} catch (ClassNotFoundException | SQLException e)

		{
			e.printStackTrace();

		}

	}

	

	 

	 public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException {
		
		try {
			String s1=request.getParameter("id");
			String s2=request.getParameter("name");
			String s3=request.getParameter("city");
			String s4=request.getParameter("department");
			String s5=request.getParameter("dates");
			String s6=request.getParameter("login_time");
			String s7=request.getParameter("log_out_time");



PreparedStatement pstmt=con.prepareStatement("insert into user1 values(?,?,?,?,?,?,?)");
			pstmt.setString(1, s1);
			pstmt.setString(2, s2);
			pstmt.setString(3, s3);
			pstmt.setString(4, s4);
			pstmt.setString(5, s5);
			pstmt.setString(6, s6);
			pstmt.setString(7, s7);
			pstmt.executeUpdate();
			
			PrintWriter pw=response.getWriter();
			pw.println("<html><style>\r\n"
					+ "	 body{\r\n"
					+ "		 background-image: url( abc.jpg);\r\n"
					+ "		 background-repeat: no-repeat;\r\n"
					+ "		 background-attachment: fixed;\r\n"
					+ "		 background-size: 100% 100%;\r\n"
					+ "	 }\r\n"
					+ " </style><body bgcolor=white text=red><center>");
			pw.println("<h1> Thank you "+s2);
			pw.println("<br><br><a href=homepage.html>HOME_PAGE</a>");
			pw.println("</h1></center></body></html>");
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	public void destroy()
	{
		try {
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
