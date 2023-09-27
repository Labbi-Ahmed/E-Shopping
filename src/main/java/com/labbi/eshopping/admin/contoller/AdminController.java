package com.labbi.eshopping.admin.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String getStart() {
		return "Home";
	}
	
	
	@RequestMapping(value="/admin", method= RequestMethod.GET)
	public String getAdmins() {
		return "adminList";
	}
}
