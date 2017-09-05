package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqjtu.dao.MeetingDao;
import com.cqjtu.vo.Meeting;

/**
 * Servlet implementation class UpdateShowAllMServlet
 */
@WebServlet("/UpdateShowAllMServlet")
public class UpdateShowAllMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateShowAllMServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		int meetingID = Integer.parseInt(request.getParameter("MeetingID"));
		MeetingDao meetingDao = new MeetingDao();
		Meeting meeting = meetingDao.MeetingInfoI(meetingID);
		
		request.setAttribute("MeetingID", meeting.getMeetingID());
		request.setAttribute("MeetingName", meeting.getMeetingName());
		request.setAttribute("RoomID", meeting.getRoomID());
		request.setAttribute("ReservationistID", meeting.getReservationistID());
		request.setAttribute("NumberofParticipants", meeting.getNumberofParticipants());
		request.setAttribute("StartTime", meeting.getStartTime());
		request.setAttribute("EndTime", meeting.getEndTime());
		request.setAttribute("ReservationTime", meeting.getReservationTime());
		request.setAttribute("CanceledTime", meeting.getCanceledTime());
		request.setAttribute("Status", meeting.getStatus());
		request.setAttribute("Description", meeting.getDescription());
		
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
