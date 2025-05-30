package com.edu.freeBoard.domain;

import java.util.Date;

import com.edu.member.domain.MemberVo;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FreeBoardVo extends MemberVo{

	@Id
	private int freeBoardId;
	private String freeBoardTitle;
	private String freeBoardContent;
	private Date createDate;
	private Date updateDate;
	
	
	
}
