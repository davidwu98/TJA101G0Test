package com.tibame.member.model;

public class MemberVO {
	private Integer memId;
	private String xxx;
	
	public MemberVO() {
		super();
	}
	public MemberVO(Integer memId, String memName) {
		super();
		this.memId = memId;
		this.xxx = memName;
	}

	public Integer getMemId() {
		return memId;
	}
	public void setMemId(Integer memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return xxx;
	}
	public void setMemName(String memName) {
		this.xxx = memName;
	}
	
}
