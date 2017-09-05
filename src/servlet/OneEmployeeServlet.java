package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqjtu.dao.DepartementDao;
import com.cqjtu.dao.EmployeeDao;
import com.cqjtu.vo.Employee;

/**
 * Servlet implementation class OneEmployeeServlet
 */
@WebServlet("/OneEmployeeServlet")
public class OneEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OneEmployeeServlet() {
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
		EmployeeDao emd = new EmployeeDao();
		Employee employee = null;
		
		employee = emd.employeeInfoI(Integer.parseInt(request.getParameter("id")));
		DepartementDao dmd = new DepartementDao();

		dmd.selectAll();
		System.out.println("³¤¶È£º"+dmd.list.size());
		request.setAttribute("Deplist", dmd.list);
		
		request.setAttribute("emp", employee);
		request.getRequestDispatcher("employeeupdate.jsp").forward(request, response);		
		
	}

}
