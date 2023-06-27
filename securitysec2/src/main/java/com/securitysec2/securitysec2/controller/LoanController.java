package com.securitysec2.securitysec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	
@GetMapping("/loan")
public String getAccountDetails() {
	return "Here are the loan details from the Db";
}

}

