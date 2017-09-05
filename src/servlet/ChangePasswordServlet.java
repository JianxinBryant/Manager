package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cqjtu.dao.EmployeeDao;
import com.cqjtu.vo.Employee;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ChangePasswordServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		String MiBaoDaan = request.getParameter("MiBaoDaan");
		String NewPassword = request.getParameter("employeepassword2");
		String UserName ="";
		if(request.getParameter("UserName") == null){
			UserName = (String) session.getAttribute("UserName");
		}
		else{
			UserName = request.getParameter("UserName");
		}
			
//		String Password = 
		
		EmployeeDao employeeDao = new EmployeeDao();
		
		Employee employee2 = employeeDao.selectPasswordByUserName(UserName);
		String Password = employee2.getPassword();
		Employee employee = new Employee(UserName, Password, MiBaoDaan);
		
		if(employeeDao.checkMiBaoDaan(employee)){
			boolean flag = employeeDao.modifyPassword(UserName, Password, NewPassword, MiBaoDaan);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{}
	}

}
