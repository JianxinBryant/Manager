package com.cqjtu._interface;

import java.util.ArrayList;

import com.cqjtu.vo.Meeting;


public interface IF_Meeting {
	
	/**
	 * ���ڽ������л�����Ϣ�ļ���
	 */
	public ArrayList<Meeting> MeetingList = new ArrayList<Meeting>();

	
	/**
	 * ��ʾ���л�����Ϣ
	 * ������ÿһ��������Ϣ������������ļ��϶�����
	 * @return 
	 */
	public ArrayList<Meeting> allMeetingInfo();
	
	
	
	/**
	 * ��ʾĳ�˵����л���
	 * @param UserName Ա���û���
	 */
	public void selectMeeting(String UserName);
	
	
	/**
	 * ���ظ���ļ��϶���
	 * @return MeetingList
	 */
	public ArrayList<Meeting> getMeetingList();

}
