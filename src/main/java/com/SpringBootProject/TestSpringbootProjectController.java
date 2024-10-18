package com.SpringBootProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestSpringbootProjectController {

	@RequestMapping("/test")
	@ResponseBody
	public String handler() {
		return "TESTING SPRING BOOT APPLICATION SETUP.....";
	}
}
