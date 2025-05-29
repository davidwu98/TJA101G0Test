package com.tibame.member.model;

public class MemberVO {
	private Integer memId;
	private String ooo;
	
	public MemberVO() {
		super();
	}
	public MemberVO(Integer memId, String memName) {
		super();
		this.memId = memId;
		this.ooo = memName;
	}
	public Integer getMemId() {
		return memId;
	}
	public void setMemId(Integer memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return ooo;
	}
	public void setMemName(String memName) {
		this.ooo = memName;
	}
	
}
