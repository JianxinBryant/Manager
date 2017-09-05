package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Paging;

import com.cqjtu.dao.DepartementDao;

/**
 * Servlet implementation class DepartServlet
 */
@WebServlet("/DepartServlet")
public class DepartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DepartServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		DepartementDao dmd = new DepartementDao();
		Paging paging = dmd.allCount();

		int pageIndex = Integer.parseInt(request.getParameter("pageIndex"));

		paging.setPageCount(paging.pageCount());
		paging.setPageIndex(pageIndex);
		paging.startNo(paging.getPageIndex());

		dmd.selectAll(paging.getStartNo(),paging.getPageNum());

		request.setAttribute("Deplist", dmd.list);
		request.setAttribute("Paging", paging);
		request.setAttribute("pageCount", paging.getPageCount());
		request.setAttribute("servletName", "DepartServlet");
		request.getRequestDispatcher("depart.jsp").forward(request, response);
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
