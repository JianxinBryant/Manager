package com.cqjtu.vo;

public class MeetingRoom {
	private int Meeting_room;
	private int RoomID;//������ID��ʶ
	private int RoomCode;//�����ұ��
	private String RoomName;//����������
	private int Caoacity;//����
	private String Status;//������״̬
	private String Description;//����������
	public int getMeeting_room() {
		return Meeting_room;
	}
	public void setMeeting_room(int meeting_room) {
		Meeting_room = meeting_room;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	public int getRoomCode() {
		return RoomCode;
	}
	public void setRoomCode(int roomCode) {
		RoomCode = roomCode;
	}
	public String getRoomName() {
		return RoomName;
	}
	public void setRoomName(String roomName) {
		RoomName = roomName;
	}
	public int getCaoacity() {
		return Caoacity;
	}
	public void setCaoacity(int caoacity) {
		Caoacity = caoacity;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	

}
