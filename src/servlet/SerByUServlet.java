package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.Paging;

import com.cqjtu.dao.EmployeeDao;
import com.cqjtu.vo.Employee;

/**
 * Servlet implementation class SerByUServlet
 */
@WebServlet("/SerByUServlet")
public class SerByUServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SerByUServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		EmployeeDao emd = new EmployeeDao();
		Employee employee = new Employee();
		Paging paging = null;
		int pageIndex = Integer.parseInt(request.getParameter("pageIndex"));

		String info = request.getParameter("select");
		String tiaojian = request.getParameter("suserName");
		// System.out.println("select信息：" + request.getParameter("select"));
		// System.out.println("suserName信息：" +
		// request.getParameter("suserName"));

		if (info == null || tiaojian == null) {
			info = (String) session.getAttribute("info");
			tiaojian = (String) session.getAttribute("tiaojian");
			// System.out.println("特殊---select信息：" + info);
			// System.out.println("特殊---suserName信息：" + tiaojian);
		} else {
			session.setAttribute("info", request.getParameter("select"));
			session.setAttribute("tiaojian", request.getParameter("suserName"));
//			 System.out.println("S--select信息：" +
//			 session.getAttribute("info"));
//			 System.out.println("S--suserName信息：" +
//			 session.getAttribute("tiaojian"));
		}

		if (info.equals("1")) {
			paging = emd.EbyUCount(tiaojian);
			paging.setPageCount(paging.pageCount());
			paging.setPageIndex(pageIndex);
			paging.startNo(paging.getPageIndex());

			emd.employeeInfoU(tiaojian, paging.getStartNo(),
					paging.getPageNum());
		} else if (info.equals("2")) {
			paging = emd.EbyNCount(tiaojian);
			paging.setPageCount(paging.pageCount());
			paging.setPageIndex(pageIndex);
			paging.startNo(paging.getPageIndex());
			
			emd.employeeInfoN(tiaojian, paging.getStartNo(),
					paging.getPageNum());
		} else if (info.equals("3")) {
			paging = emd.EbySCount(tiaojian);
			paging.setPageCount(paging.pageCount());
			paging.setPageIndex(pageIndex);
			paging.startNo(paging.getPageIndex());
			
			emd.employeeInfoS(tiaojian, paging.getStartNo(),
					paging.getPageNum());
		}
		request.setAttribute("emdList", emd.employeeList);
		request.setAttribute("Paging", paging);
		request.setAttribute("pageCount", paging.getPageCount());
		request.setAttribute("servletName", "SerByUServlet");
		request.getRequestDispatcher("employee.jsp").forward(request, response);

	}

}
