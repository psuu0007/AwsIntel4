package com.edu.home.apple.dto;

//테이블하고 깊은 관련이 있다. 
//테이블 컬럼 순서랑 무조건 같아야 한다
public class AppleDto {
	
	private int fruSeq = 0;   
	private String fruTitle = ""; 
	private int fruPrice = 0;
	private String fruImgTitle = "";
	
	public AppleDto() {
		super();
	}

	public AppleDto(int fruSeq, String fruTitle, int fruPrice
		, String fruImgTitle) {
		super();
		this.fruSeq = fruSeq;
		this.fruTitle = fruTitle;
		this.fruPrice = fruPrice;
		this.fruImgTitle = fruImgTitle;
	}

	public int getFruSeq() {
		return fruSeq;
	}

	public void setFruSeq(int fruSeq) {
		this.fruSeq = fruSeq;
	}

	public String getFruTitle() {
		return fruTitle;
	}

	public void setFruTitle(String fruTitle) {
		this.fruTitle = fruTitle;
	}

	public int getFruPrice() {
		return fruPrice;
	}

	public void setFruPrice(int fruPrice) {
		this.fruPrice = fruPrice;
	}

	public String getFruImgTitle() {
		return fruImgTitle;
	}

	public void setFruImgTitle(String fruImgTitle) {
		this.fruImgTitle = fruImgTitle;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AppleDto [fruSeq=");
		builder.append(fruSeq);
		builder.append(", fruTitle=");
		builder.append(fruTitle);
		builder.append(", fruPrice=");
		builder.append(fruPrice);
		builder.append(", fruImgTitle=");
		builder.append(fruImgTitle);
		builder.append("]");
		return builder.toString();
	}

}
