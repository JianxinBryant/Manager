package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqjtu._interface.IF_Meetingroom;
import com.cqjtu.dao.MeetingRoomDao;
import com.cqjtu.vo.MeetingRoom;



/**
 * Servlet implementation class MRAddServlet
 */
@WebServlet("/MRAddServlet")
public class MRAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MRAddServlet() {
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
		request.setCharacterEncoding("utf-8");// �������ı���

		// �˴��������ݿ�
		MeetingRoomDao dao = new MeetingRoomDao();
		// �˴�����meeting_room����Ӻ�����������ֵ����������
		MeetingRoom room = new MeetingRoom();
		room.setRoomCode(Integer.parseInt(request.getParameter("meetingroomID")));
		room.setRoomName(request.getParameter("meetingroomName"));
		room.setCaoacity(Integer.parseInt(request.getParameter("meetingroomrl")));
		room.setDescription(request.getParameter("meetingroomdesc"));
		// dao.addMeetingroom(room);

		ArrayList<MeetingRoom> list = dao.allMeetingroomInfo();
		for (MeetingRoom meetingRoom : list) {
			if (Integer.parseInt(request.getParameter("meetingroomID")) == meetingRoom
					.getRoomCode()) {
				// ���ݿ����Ѿ����ڸñ�ţ���Ҫ��������
				request.setAttribute("url", "meetingroomadd.jsp");
				request.setAttribute("aa", "�ñ���Ѵ��ڣ�����ģ�");
				request.getRequestDispatcher("info.jsp").forward(request,
						response);
				return;
			}
		}

		if (!dao.addMeetingroom(room)) {
			request.setAttribute("url", "SelectMRServlet?pageIndex=1");
			request.setAttribute("aa", "ʧ��");
			request.getRequestDispatcher("info.jsp").forward(request, response);
		} else {
			request.setAttribute("url", "SelectMRServlet?pageIndex=1");
			request.setAttribute("aa", "�ɹ�");
			request.getRequestDispatcher("info.jsp").forward(request, response);
		}
	}

}
