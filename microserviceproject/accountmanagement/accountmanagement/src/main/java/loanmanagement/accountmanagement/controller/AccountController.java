package loanmanagement.accountmanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import loanmanagement.accountmanagement.pojo.AccountPojo;

@RestController
@RequestMapping("/api/account")
public class AccountController {
	
	
	@GetMapping(value = "/getacountdetails")
	public AccountPojo getAcount() {
		
		AccountPojo accountPojo = new AccountPojo();
		accountPojo.setAccNo("icici1234");
		accountPojo.setAmount(200000);
		
		return accountPojo;
	}


}
