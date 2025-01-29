package com.blogs.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ApiResponse {
	private String message;
	private String status;
	private LocalDateTime timeStamp;
	public ApiResponse(String message,String status) {
		this.status=status;
		this.message=message;
		this.timeStamp=LocalDateTime.now();
	}
	
}
