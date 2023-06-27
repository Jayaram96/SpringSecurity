package com.securitysec2.securitysec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
	
@GetMapping("/notices")
public String getAccountDetails() {
	return "Here are the Notices fetched from the Db";
}

}

