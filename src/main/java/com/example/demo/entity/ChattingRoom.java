package com.example.demo.entity;

import java.util.Date;

public class ChattingRoom {
	private long seq;
	
	private String title;
	
	private String admin;
	
	private Date createDate;

	public long getSeq() {
		return seq;
	}

	public void setId(long seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "ChattingRoom [seq=" + seq + ", title=" + title + ", admin=" + admin + ", createDate=" + createDate + "]";
	}
}
