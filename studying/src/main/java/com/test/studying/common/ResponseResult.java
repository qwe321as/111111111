package com.test.studying.common;

import lombok.Data;

@Data
public class ResponseResult {

	private Integer state;
	private String message;
    public Object result;
    public ResponseResult() {
    }

}
