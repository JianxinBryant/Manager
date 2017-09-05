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
 * Servlet implementation class DelEmployeeServlet
 */
@WebServlet("/DelEmployeeServlet")
public class DelEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		EmployeeDao emd = new EmployeeDao();
		Employee employee = new Employee();
		
		//TODO (判断登录账号信息的状态)
		employee.setStatus("管理员");//暂定是管理员
		
		employee.setEmployeeID(Integer.parseInt(request.getParameter("id")));
		
		emd.delEmployee(employee);
		request.getRequestDispatcher("EmployeeServlet?pageIndex=1").forward(request, response);
	}

}
