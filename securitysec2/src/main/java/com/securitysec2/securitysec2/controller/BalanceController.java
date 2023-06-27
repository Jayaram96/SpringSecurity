package com.securitysec2.securitysec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BalanceController {
	
@GetMapping("/balance")
public String getAccountDetails() {
	return "Here are the balance details from the Db";
}

}

