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
 * Servlet implementation class UpdateMeetingServlet
 */
@WebServlet("/UpdateMeetingServlet")
public class UpdateMeetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMeetingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		
		int MeetingID = Integer.parseInt(request.getParameter("MeetingID"));
		String MeetingName = request.getParameter("MeetingName");
		int RoomID = Integer.parseInt(request.getParameter("RoomID"));
		int ReservationistID = Integer.parseInt(request.getParameter("ReservationistID"));
		int NumberofParticipants = Integer.parseInt(request.getParameter("NumberofParticipants"));
		String StartTime = request.getParameter("StartTime");
		String EndTime = request.getParameter("EndTime");
		String ReservationTime = request.getParameter("ReservationTime");
		String CanceledTime = request.getParameter("CanceledTime");
		String Description = request.getParameter("Description");
		String Status = request.getParameter("Status");
		
		Meeting meeting = new Meeting(MeetingID, MeetingName, RoomID, ReservationistID, NumberofParticipants, StartTime, EndTime, ReservationTime, CanceledTime, Description, Status);
		MeetingDao meetingDao = new MeetingDao();
		int flag = meetingDao.updateMeeting(meeting);
		System.out.println(flag);
		request.getRequestDispatcher("search.jsp").forward(request, response);
	}

}
