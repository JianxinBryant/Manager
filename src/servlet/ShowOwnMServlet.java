package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cqjtu.dao.EmployeeDao;
import com.cqjtu.dao.MeetingDao;
import com.cqjtu.vo.Employee;
import com.cqjtu.vo.Meeting;

/**
 * Servlet implementation class ShowOwnMServlet
 */
@WebServlet("/ShowOwnMServlet")
public class ShowOwnMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowOwnMServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		EmployeeDao employeeDao = new EmployeeDao();
		MeetingDao meetingDao = new MeetingDao();
		String UserName = (String) session.getAttribute("UserName");
		Employee employee = employeeDao.searchEmployeeIDByUserName(UserName);
		System.out.println(UserName);
		ArrayList<Meeting> MeetingList = meetingDao.MeetingInfoRe(employee.getEmployeeID());
		System.out.println(employee.getEmployeeID());
		request.setAttribute("MeetingList", MeetingList);
		
		request.getRequestDispatcher("mymeeting.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
