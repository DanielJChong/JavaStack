package com.daniel.thecode.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	@RequestMapping("/code")
	public String correctCode() {
		return "correctcode.jsp";
	}
}