package com.edu.member.domain;

import java.util.Date;

public class MemberVo {

	private int memberNo;
	private String email;
	private String memberName;
	private String password;
	private Date createDate;
	private Date modifyDate;
	
	private String provider;
	
	public MemberVo() {
		super();
	}

	public MemberVo(int memberNo, String email, String memberName
			, String password, Date createDate, Date modifyDate,
			String provider) {
		super();
		this.memberNo = memberNo;
		this.email = email;
		this.memberName = memberName;
		this.password = password;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.provider = provider;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberVo [memberNo=");
		builder.append(memberNo);
		builder.append(", email=");
		builder.append(email);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", modifyDate=");
		builder.append(modifyDate);
		builder.append(", provider=");
		builder.append(provider);
		builder.append("]");
		return builder.toString();
	}

}
