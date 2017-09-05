package com.cqjtu._interface;

import java.util.ArrayList;

import com.cqjtu.dao.MeetingRoomDao;
import com.cqjtu.vo.Meeting;
import com.cqjtu.vo.MeetingRoom;

public interface IF_Meetingroom {
	
	/**
	 * 接收所有会议室信息的集合
	 */
	public ArrayList<MeetingRoom> MeetingroomList = new ArrayList<MeetingRoom>();
	
	
	/**
	 * 所有会议室信息
	 * 将所得每一个会议室信息遍历插入上面的集合对象里
	 */
	public ArrayList<MeetingRoom> allMeetingroomInfo(int startNo, int pageNum);
	
	
	
	
	/**
	 * 添加会议室信息
	 * 
	 */
	public boolean addMeetingroom(MeetingRoom meetingroom);
	
	/**
	 * 修改会议室信息
	 * 
	 */
	public boolean modifyMeetingroom(MeetingRoom meetingroom);
	
	/**
	 * 删除会议室信息
	 * 
	 */
	public boolean delMeetingroom(MeetingRoom room);
	
	/**
	 * 返回该类的集合对象
	 * @return MeetingroomList
	 */
	public ArrayList<MeetingRoom> getMeetingroomList();

}
