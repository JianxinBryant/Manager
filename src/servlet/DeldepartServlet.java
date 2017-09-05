package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqjtu.dao.DepartementDao;
import com.cqjtu.vo.Department;

/**
 * Servlet implementation class DeldepartServlet
 */
@WebServlet("/DeldepartServlet")
public class DeldepartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeldepartServlet() {
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
		DepartementDao dmd = new DepartementDao();
		Department dm = new Department();
		
		dm.setDepartmentID(Integer.parseInt(request.getParameter("id")));
		
		dmd.delDepart(dm);
		
		request.getRequestDispatcher("DepartServlet?pageIndex=1").forward(request, response);
	}

}
