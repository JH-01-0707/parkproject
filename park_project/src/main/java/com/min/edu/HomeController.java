package com.min.edu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {

	@GetMapping
	public String getMethodName() {
		return "안녕하세요 Park 프로젝트 입니다";
	}
}
