package com.demo.model;

public class Team {

	private int tid;
	private String teamName;
	private String coachName;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	@Override
	public String toString() {
		return "Team [tid=" + tid + ", teamName=" + teamName + ", coachName=" + coachName + "]";
	}
	
	
}
