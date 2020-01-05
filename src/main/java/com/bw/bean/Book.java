package com.bw.bean;

public class Book {
	private Integer bid;
	private String bname;
	private String btype;
	private String bphone;
	private String bauthor;
	private String blike;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer bid, String bname, String btype, String bphone, String bauthor, String blike) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btype = btype;
		this.bphone = bphone;
		this.bauthor = bauthor;
		this.blike = blike;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBtype() {
		return btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	public String getBphone() {
		return bphone;
	}

	public void setBphone(String bphone) {
		this.bphone = bphone;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public String getBlike() {
		return blike;
	}

	public void setBlike(String blike) {
		this.blike = blike;
	}

}
