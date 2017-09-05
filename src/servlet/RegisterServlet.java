package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cqjtu.dao.EmployeeDao;
import com.cqjtu.vo.Employee;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		EmployeeDao employeeDao = new EmployeeDao();
		String checkInfo = new String();
		System.out.println(request.getParameter("UserName"));
		checkInfo = request.getParameter("UserName");
		System.out.println(checkInfo);
		if(employeeDao.checkUserName(checkInfo)){
			response.getWriter().write("success");
//			System.out.println("111");
			
		}
		else{
			response.getWriter().write("fail");
//			System.out.println("zzz");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		response.setContentType("application/text; charset=utf-8");
//		PrintWriter out = response.getWriter();
		
		String EmployeeName = request.getParameter("EmployeeName");
		String UserName = request.getParameter("UserName");
		String Phone = request.getParameter("Phone");
		String Email = request.getParameter("Email");
		int Department = Integer.parseInt(request.getParameter("Department"));
		String Password = request.getParameter("Password");
		String MiBaoDaan = request.getParameter("MiBaoDaan");
		String checkInfo = request.getParameter("UserName");
		
		Employee employee = new Employee(EmployeeName, UserName, Phone, Email, Department, Password, MiBaoDaan);
		EmployeeDao employeeDao = new EmployeeDao();
		
//		if(employeeDao.checkUserName(checkInfo)){
//			try {
//				out.write("success");
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally{
//				out.close();
//			}
			boolean flag = employeeDao.addEmployee(employee);
//			request.setAttribute("successMsg", "注册成功！");
			request.getRequestDispatcher("LoginServlet").forward(request, response);
//		}
//		else{
//			try {
//				out.write("fail");
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally{
//				out.close();
//			}
			
//			request.setAttribute("errorMsg", "该用户名或手机已经被注册！");
//			request.getRequestDispatcher("registernew.jsp").forward(request, response);
//			System.out.println("error");
//		}
		
		
	}

}
