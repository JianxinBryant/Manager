package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.Paging;

import com.cqjtu.dao.DepartementDao;

/**
 * Servlet implementation class SerDepServlet
 */
@WebServlet("/SerDepServlet")
public class SerDepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SerDepServlet() {
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
		DepartementDao dmd = new DepartementDao();
		
		Paging paging = null;
		int pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
		
		String deptName = request.getParameter("deptName");
		
		if (deptName == null) {
			deptName = (String) session.getAttribute("deptName");
		} else {
			session.setAttribute("deptName", request.getParameter("deptName"));
		}
		
		paging = dmd.DbyNCount(deptName);
		paging.setPageCount(paging.pageCount());
		paging.setPageIndex(pageIndex);
		paging.startNo(paging.getPageIndex());

		dmd.departInfoN(deptName,paging.getStartNo(),paging.getPageNum());
		request.setAttribute("Deplist", dmd.list);
		request.setAttribute("Paging", paging);
		request.setAttribute("pageCount", paging.getPageCount());
		request.setAttribute("servletName", "SerDepServlet");
		request.getRequestDispatcher("depart.jsp").forward(request, response);
	}

}
