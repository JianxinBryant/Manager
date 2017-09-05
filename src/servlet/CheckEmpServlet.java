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
 * Servlet implementation class CheckEmpServlet
 */
@WebServlet("/CheckEmpServlet")
public class CheckEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao emd = new EmployeeDao();
		Paging paging = emd.EbySCount("´ýÉóºË");
		
		int pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
		
		paging.setPageCount(paging.pageCount());
		paging.setPageIndex(pageIndex);
		paging.startNo(paging.getPageIndex());
		
		emd.employeeInfoS("´ýÉóºË",paging.getStartNo(),paging.getPageNum());
		
		request.setAttribute("cheEmpList", emd.employeeList);
		request.setAttribute("Paging", paging);
		request.setAttribute("pageCount", paging.getPageCount());
		request.setAttribute("servletName", "CheckEmpServlet");
		request.getRequestDispatcher("check.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
