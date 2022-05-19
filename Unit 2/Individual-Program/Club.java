package ICS4U1;

import java.util.*;
import java.io.*;

public class Club {

	private int memberCount;

	private boolean isInPerson;

	private ArrayList<String> meetingDate;

	private double fees;

	private double budget;

	private ArrayList<ExecutiveMember> execs;

	private String topic;

	private ArrayList<GeneralMember> generalMember;

	private TeacherSupervisor teacherSupervisor;

	private ArrayList<Event> event;

	public Club(int memberCount, boolean isInPerson, ArrayList<String> meetingDate, double fees, double budget,
			ArrayList<ExecutiveMember> execs, String topic, ArrayList<GeneralMember> generalMember,
			TeacherSupervisor teacherSupervisor, ArrayList<Event> event) {
		this.memberCount = memberCount;
		this.isInPerson = isInPerson;
		this.meetingDate = meetingDate;
		this.fees = fees;
		this.budget = budget;
		this.execs = execs;
		this.topic = topic;
		this.generalMember = generalMember;
		this.teacherSupervisor = teacherSupervisor;
		this.event = event;
	}

	public Club() {
		this.memberCount = 0;
		this.isInPerson = true;
		this.meetingDate = new ArrayList<>();
		this.fees = 0;
		this.budget = 0;
		this.execs = new ArrayList<>();
		this.topic = "";
		this.generalMember = new ArrayList<>();
		this.teacherSupervisor = new TeacherSupervisor();
		this.event = new ArrayList<>();
	}

	public int getMemberCount() {
		return memberCount;
	}

	public String getIsInPerson() {
		return isInPerson ? "Yes" : "No";
	}

	public ArrayList<String> getMeetingDate() {
		return meetingDate;
	}

	public double getFees() {
		return fees;
	}

	public double getBudget() {
		return budget;
	}

	public ArrayList<ExecutiveMember> getExecs() {
		return execs;
	}

	public String getTopic() {
		return topic;
	}

	public ArrayList<GeneralMember> getGeneralMember() {
		return generalMember;
	}

	public TeacherSupervisor getTeacherSupervisor() {
		return teacherSupervisor;
	}

	public ArrayList<Event> getEvent() {
		return event;
	}

	public void setMemberCount(int newMemberCount) {
		memberCount = newMemberCount;
	}

	public void setIsInPerson(boolean newIsInPerson) {
		isInPerson = newIsInPerson;
	}

	public void setMeetingDate(ArrayList<String> newMeetingDate) {
		meetingDate = newMeetingDate;
	}

	public void setFees(double newFees) {
		fees = newFees;
	}

	public void setBudget(double newBudget) {
		budget = newBudget;
	}

	public void setTopic(String newTopic) {
		topic = newTopic;
	}

	public void setTeacherSupervisor(TeacherSupervisor newTeacherSupervisor) {
		teacherSupervisor = newTeacherSupervisor;
	}

	public void addExec(ExecutiveMember newExec) {
		execs.add(newExec);
	}

	public void removeExec(ExecutiveMember exec) {
		if (!execs.contains(exec)) {
			System.out.println("Wrong Info!");
			return;
		}
		execs.remove(exec);
	}

	public void addMember(GeneralMember newMember) {
		generalMember.add(newMember);
	}

	public void removeMember(GeneralMember member) {
		if (!generalMember.contains(member)) {
			System.out.println("Wrong Info!");
		}
		generalMember.remove(member);
	}

	public void addEvent(Event newEvent) {
		event.add(newEvent);
	}

	public void removeEvent(Event e) {
		if (!event.contains(e)) {
			System.out.println("Wrong Info!");
		}
		event.remove(e);
	}

	public String printMeetingDate() {
		String S = "";
		for (String k : meetingDate) {
			S += k + " ";
		}

		return S.trim();
	}

	public String toString() {
		return "Member Count: " + memberCount + "\nIs In Person: " + (isInPerson ? "Yes" : "No") + "\nMeeting Date: "
				+ printMeetingDate() + "\nFees: " + fees + "\nBudget: " + budget + "\nTopic: " + topic + "\nExecs: \n  "
				+ execs + "\nGeneral Members: \n  " + generalMember + "\nTeacher Supervisor: \n" + teacherSupervisor
				+ "\nEvents: \n  " + event;
	}

	public void writeMemberInfo() {
		String fileName = topic + ".txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, false));
			out.write(toString());
			out.close();
		} catch (IOException e) {
			System.out.println("There was an issue opening or closing your file. Sorry :/ " + e);
		}
	}

	public void readMemberInfo() {
		String fileName = topic + ".txt";
		try {
			String strCurrentLine;
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			while ((strCurrentLine = in.readLine()) != null) {
				System.out.println(strCurrentLine);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("There was an issue opening or reading your file. Sorry :/ " + e);
		}
	}

}
