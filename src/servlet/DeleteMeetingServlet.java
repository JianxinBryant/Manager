package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqjtu.dao.MeetingDao;
import com.cqjtu.vo.Meeting;

/**
 * Servlet implementation class DeleteMeetingServlet
 */
@WebServlet("/DeleteMeetingServlet")
public class DeleteMeetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMeetingServlet() {
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
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		Meeting meeting = new Meeting();
		MeetingDao meetingDao = new MeetingDao();
		
		int MeetingID = Integer.parseInt(request.getParameter("id"));
		System.out.println(MeetingID);
		meeting.setMeetingID(MeetingID);
		boolean flag = meetingDao.delMeeting(meeting);
		System.out.println(flag);
		request.getRequestDispatcher("DeleteShowThreeServlet").forward(request, response);
	}

}
