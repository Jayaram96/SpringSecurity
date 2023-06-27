package com.securitysec2.securitysec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
@GetMapping("/account")
public String getAccountDetails() {
	return "Here are the acount details from the Db";
}

}
