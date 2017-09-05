package com.cqjtu._interface;

import java.util.ArrayList;

import com.cqjtu.vo.Meeting;


public interface IF_Meeting {
	
	/**
	 * 用于接收所有会议信息的集合
	 */
	public ArrayList<Meeting> MeetingList = new ArrayList<Meeting>();

	
	/**
	 * 显示所有会议信息
	 * 将所得每一个会议信息遍历插入上面的集合对象里
	 * @return 
	 */
	public ArrayList<Meeting> allMeetingInfo();
	
	
	
	/**
	 * 显示某人的所有会议
	 * @param UserName 员工用户名
	 */
	public void selectMeeting(String UserName);
	
	
	/**
	 * 返回该类的集合对象
	 * @return MeetingList
	 */
	public ArrayList<Meeting> getMeetingList();

}
