package com.wu.common.data;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors
@Builder
public class Result {
	private String msg;
	private String errMsg;
	private int statusCode;
	private Object data;
	
	public static Result success() {
		return Result.builder().statusCode(1).build();
	}
	
	public static Result faild() {
		return Result.builder().statusCode(-1).build();
	}
	
	
	public static Result success(Object data) {
		return Result.builder().statusCode(1).data(data).build();
	}
	
	public static Result faild(String errMsg) {
		return Result.builder().statusCode(-1).errMsg(errMsg).build();
	}
}
