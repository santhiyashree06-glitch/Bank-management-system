package com.example.bank.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.model.Account;
import com.example.bank.service.AccountService;
@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	AccountService as;
	@PostMapping("/addaccount")
public Account get(@RequestBody Account a)	
{
		return as.createAccount(a);
}
@GetMapping("/selectall")
public List<Account>get2()
{
	return as.Viewallaccount();
}
@GetMapping("part/{id}")
public Account get3(@PathVariable int id)
{
	return as.partaccount(id);
}
@PutMapping("/deposit/{id}/{amount}")
public Account get4(@PathVariable int id,@PathVariable double amount)
{
	return as.deposit(id,amount);
}
@PutMapping("/withdraw/{id}/{amount}")
public Account get5(@PathVariable int id,@PathVariable double amount)
{
{
	return as.withdraw(id,amount);
}
}
}
