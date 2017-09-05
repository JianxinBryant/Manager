package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Paging;

import com.cqjtu.dao.EmployeeDao;

/**
 * Servlet implementation class Employee
 */
@WebServlet("/Employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao emd = new EmployeeDao();
		Paging paging = emd.allCount();
		int pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
		
		
		paging.setPageCount(paging.pageCount());
		paging.setPageIndex(pageIndex);
		paging.startNo(paging.getPageIndex());
		
		emd.allEmployeeInfo(paging.getStartNo(),paging.getPageNum());
		
		//System.out.println("当前页数："+paging.getPageIndex()+"----起始条数："+paging.getStartNo()+"-----总页数："+paging.getPageCount()+"-----总记录数："+paging.getCount());
		
		request.setAttribute("emdList", emd.employeeList);
		request.setAttribute("Paging", paging);
		request.setAttribute("pageCount", paging.getPageCount());
		request.setAttribute("servletName", "EmployeeServlet");
		request.getRequestDispatcher("employee.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
