package com.wu.file.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file")
public class FileController {
	
	@RequestMapping("upload")
	public Object upload() {
		return null;
	}
	
	
	@RequestMapping("download")
	public Object download() {
		return null;
	}
}
