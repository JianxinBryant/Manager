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
 * Servlet implementation class SearchMeetingServlet
 */
@WebServlet("/SearchMeetingServlet")
public class SearchMeetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchMeetingServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		Meeting meeting = null;
		MeetingDao meetingDao = new MeetingDao();
		String info = request.getParameter("select");
		String path = request.getParameter("suserName");
		System.out.println(info + path);

		if (info.equals("1")) {
			meeting = meetingDao.MeetingInfoI(Integer.parseInt(path));
			// System.out.println(meeting.getMeetingID()+meeting.getMeetingName());
		} else if (info.equals("2")) {
			meeting = meetingDao.MeetingInfoN(path);
		} else if (info.equals("3")) {
			meeting = meetingDao.MeetingInfoR(Integer.parseInt(path));
		}

		if (meeting != null) {

			request.setAttribute("MeetingID", meeting.getMeetingID());
			request.setAttribute("MeetingName", meeting.getMeetingName());
			request.setAttribute("RoomID", meeting.getRoomID());
			request.setAttribute("ReservationistID",
					meeting.getReservationistID());
			request.setAttribute("NumberofParticipants",
					meeting.getNumberofParticipants());
			request.setAttribute("StartTime", meeting.getStartTime());
			request.setAttribute("EndTime", meeting.getEndTime());
			request.setAttribute("ReservationTime",
					meeting.getReservationTime());
			request.setAttribute("CanceledTime", meeting.getCanceledTime());
			request.setAttribute("Status", meeting.getStatus());
			request.setAttribute("Description", meeting.getDescription());
		}
		request.setAttribute("MeetingList", meetingDao);
		request.getRequestDispatcher("search.jsp").forward(request, response);
	}

}
