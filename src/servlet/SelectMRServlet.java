package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Paging;

import com.cqjtu._interface.IF_Meetingroom;
import com.cqjtu.dao.MeetingRoomDao;
import com.cqjtu.vo.MeetingRoom;

/**
 * Servlet implementation class SelectMRServlet
 */
@WebServlet("/SelectMRServlet")
public class SelectMRServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectMRServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");// 处理中文编码

		// 此处连接数据库
		MeetingRoomDao dao = new MeetingRoomDao();
		Paging paging = dao.allCount();
		
		int pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
		
		paging.setPageCount(paging.pageCount());
		paging.setPageIndex(pageIndex);
		paging.startNo(paging.getPageIndex());
		
		ArrayList<MeetingRoom> list = dao.allMeetingroomInfo(paging.getStartNo(),paging.getPageNum());
		request.setAttribute("list", list);
		request.setAttribute("Paging", paging);
		request.setAttribute("pageCount", paging.getPageCount());
		request.setAttribute("servletName", "SelectMRServlet");
		request.getRequestDispatcher("meetingroom.jsp").forward(request,
				response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
