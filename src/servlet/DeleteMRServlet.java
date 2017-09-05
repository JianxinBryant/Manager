package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqjtu._interface.IF_Meetingroom;
import com.cqjtu.dao.MeetingRoomDao;
import com.cqjtu.vo.MeetingRoom;

/**
 * Servlet implementation class DeleteMRServlet
 */
@WebServlet("/DeleteMRServlet")
public class DeleteMRServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMRServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");// �������ı���

		// �˴��������ݿ�
		IF_Meetingroom dao = new MeetingRoomDao();
		MeetingRoom room = new MeetingRoom();
		room.setRoomID(Integer.parseInt(request.getParameter("id")));
		boolean flag = dao.delMeetingroom(room);
		if (flag) {
			request.setAttribute("aa", "ɾ���ɹ�");
			request.setAttribute("url", "SelectMRServlet");
			request.getRequestDispatcher("info.jsp").forward(request, response);
		}else{
			request.setAttribute("aa", "ɾ��ʧ��");
			request.setAttribute("url", "SelectMRServlet");
			request.getRequestDispatcher("info.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
