package com.securitysec2.securitysec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
	
@GetMapping("/card")
public String getAccountDetails() {
	return "Here are the card details from the Db";
}

}

