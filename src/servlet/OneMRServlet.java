package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqjtu.dao.MeetingRoomDao;
import com.cqjtu.vo.MeetingRoom;

/**
 * Servlet implementation class OneMRServlet
 */
@WebServlet("/OneMRServlet")
public class OneMRServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OneMRServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		MeetingRoomDao mrd = new MeetingRoomDao();
		MeetingRoom mr = null;

		mr = mrd.MeetingRoomInfoI(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("MeetingRoom", mr);
		request.getRequestDispatcher("meetingroomupdate.jsp").forward(request,
				response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
