package com.Assessment;

public class TextAndImageNote {
	public TextAndImageNote(String note, String imgUrl) {
		this.note = note;
		this.imgUrl = imgUrl;
	}
	
	private String note;
	private String imgUrl;
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
}
