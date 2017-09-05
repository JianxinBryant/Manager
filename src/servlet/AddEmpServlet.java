package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqjtu.dao.EmployeeDao;
import com.cqjtu.vo.Employee;

/**
 * Servlet implementation class AddEmpServlet
 */
@WebServlet("/AddEmpServlet")
public class AddEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		Employee employee = new Employee();
		EmployeeDao emd = new EmployeeDao();
		
		employee.setEmployeeName(request.getParameter("employeeName"));
		employee.setUserName(request.getParameter("UserName"));
		employee.setPhone(request.getParameter("empphone"));
		employee.setEmail(request.getParameter("empemail"));
		employee.setStatus(request.getParameter("employeeStatus"));
		employee.setDepartment(Integer.parseInt(request.getParameter("empdepart")));
		employee.setPassword(request.getParameter("password"));
		employee.setMiBaoDaan(request.getParameter("mibao"));
		
		emd.addEmployee(employee);
		request.getRequestDispatcher("EmployeeServlet?pageIndex=1").forward(request, response);
	}

}
