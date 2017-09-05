package com.cqjtu.vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Meeting {
	

	private int MeetingID;
	
	private String MeetingName;
	
	private int RoomID;
	
	private int ReservationistID;
	
	private int NumberofParticipants;
	
	private String StartTime;
	
	private String EndTime;
	
	private String ReservationTime;
	
	private String CanceledTime;
	
	private String Description;
	
	private String Status;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	private Calendar cal = Calendar.getInstance();	
	
	public Meeting(){
		System.out.println(cal.getTime());
		String str = sdf.format(cal.getTime()); 
		System.out.println(str);
	}
	
	public Meeting(int MeetingID,String MeetingName,int RoomID,
			int ReservationistID,int NumberofParticipants,String StartTime,
			String EndTime,String ReservationTime,
			String CanceledTime,String Description,String Status){
		this.MeetingID = MeetingID;
		this.MeetingName = MeetingName;
		this.RoomID = RoomID;
		this.ReservationistID = ReservationistID;
		this.NumberofParticipants = NumberofParticipants;
		this.StartTime = StartTime;
		this.EndTime = EndTime;
		this.ReservationTime = ReservationTime;
		this.CanceledTime = CanceledTime;
		this.Description = Description;
		this.Status = Status;
	}
	
	public Meeting(int MeetingID,String MeetingName,int RoomID){
		this.MeetingID = MeetingID;
		this.MeetingName = MeetingName;
		this.RoomID = RoomID;
	}
	
	

	public int getMeetingID() {
		return MeetingID;
	}



	public void setMeetingID(int meetingID) {
		MeetingID = meetingID;
	}



	public String getMeetingName() {
		return MeetingName;
	}

	public void setMeetingName(String meetingName) {
		MeetingName = meetingName;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	public int getReservationistID() {
		return ReservationistID;
	}

	public void setReservationistID(int reservationistID) {
		ReservationistID = reservationistID;
	}

	public int getNumberofParticipants() {
		return NumberofParticipants;
	}

	public void setNumberofParticipants(int numberofParticipants) {
		NumberofParticipants = numberofParticipants;
	}

	public String getStartTime() {
		return StartTime;
	}

	public void setStartTime(String startTime) {
		StartTime = startTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	public String getReservationTime() {
		return ReservationTime;
	}

	public void setReservationTime(String reservationTime) {
		ReservationTime = reservationTime;
	}

	public String getCanceledTime() {
		return CanceledTime;
	}

	public void setCanceledTime(String canceledTime) {
		CanceledTime = canceledTime;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Calendar getCal() {
		return cal;
	}

	public void setCal(Calendar cal) {
		this.cal = cal;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	public static void main(String[] args) {
		new Meeting();
	}
	
}

