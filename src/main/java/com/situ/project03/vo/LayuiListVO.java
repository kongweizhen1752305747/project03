package com.situ.project03.vo;

import java.util.List;


import lombok.Data;



@Data
public class LayuiListVO {
	private int code;  //code为0表示成功
	
	private String msg;		//查询失败原因
	
	private Long count;//总条数(分页使用)
	
	private List<?> data;
}
