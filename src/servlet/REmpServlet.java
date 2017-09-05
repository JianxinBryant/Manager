package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Paging;

import com.cqjtu.dao.EmployeeDao;
import com.cqjtu.vo.Employee;

/**
 * Servlet implementation class REmpServlet
 */
@WebServlet("/REmpServlet")
public class REmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public REmpServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("Fid");
		EmployeeDao emd = new EmployeeDao();
		Employee employee = null;
		
		//���޸�״ֵ̬
		employee = emd.employeeInfoI(Integer.parseInt(id));
		employee.setStatus("�ѹر�");
		emd.modifyEmployee(employee);
		
		request.getRequestDispatcher("CheckEmpServlet?pageIndex=1").forward(request, response);
	}

}
