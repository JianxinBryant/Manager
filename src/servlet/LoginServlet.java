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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		
		HttpSession session = request.getSession();
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("Password");
		
		EmployeeDao employeeDao = new EmployeeDao();
		Employee employee = new Employee(UserName, Password);
		int flag = employeeDao.login(employee);
		System.out.println("flag"+flag);
		if(flag == 1){
			session.setAttribute("UserName", UserName);
			request.getRequestDispatcher("index3.jsp").forward(request, response);
		}
		else if(flag == 0){
			request.setAttribute("errMsg", "用户名或密码有误！");
		}else{
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}

}
