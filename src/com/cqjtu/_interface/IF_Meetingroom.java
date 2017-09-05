package com.cqjtu._interface;

import java.util.ArrayList;

import com.cqjtu.dao.MeetingRoomDao;
import com.cqjtu.vo.Meeting;
import com.cqjtu.vo.MeetingRoom;

public interface IF_Meetingroom {
	
	/**
	 * �������л�������Ϣ�ļ���
	 */
	public ArrayList<MeetingRoom> MeetingroomList = new ArrayList<MeetingRoom>();
	
	
	/**
	 * ���л�������Ϣ
	 * ������ÿһ����������Ϣ������������ļ��϶�����
	 */
	public ArrayList<MeetingRoom> allMeetingroomInfo(int startNo, int pageNum);
	
	
	
	
	/**
	 * ��ӻ�������Ϣ
	 * 
	 */
	public boolean addMeetingroom(MeetingRoom meetingroom);
	
	/**
	 * �޸Ļ�������Ϣ
	 * 
	 */
	public boolean modifyMeetingroom(MeetingRoom meetingroom);
	
	/**
	 * ɾ����������Ϣ
	 * 
	 */
	public boolean delMeetingroom(MeetingRoom room);
	
	/**
	 * ���ظ���ļ��϶���
	 * @return MeetingroomList
	 */
	public ArrayList<MeetingRoom> getMeetingroomList();

}
