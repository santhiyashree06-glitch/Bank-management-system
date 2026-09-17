package com.example.bank.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bank.dao.*;
import com.example.bank.model.*;
import java.time.LocalDateTime;
import java.util.*;
@Service
public class AccountService {
	@Autowired
	AccountRepo ar;
	@Autowired
	TransRepo tr;
	
public Account createAccount(Account a)	
{
	return ar.save(a);
}
public List<Account> Viewallaccount()
{
	return ar.findAll();

}
public Account partaccount(int id)
{
	return ar.findById(id).orElse(null);
}
public Account deposit(int id,double amount)
{
	Account ac= ar.findById(id).orElse(null);
    if(ac!=null)	
    {
    	ac.setBalance(ac.getBalance()+amount);
    	Transaction tc=new Transaction();
    	tc.setTranasactiontype("DEPOSIT");
    	tc.setTransactiondate(LocalDateTime.now());
    	tc.setAccount(ac);
    	tr.save(tc);
    	return ar.save(ac);
    }
    else {
    	return null;
    }
}


public Account withdraw (int id,double amount)
{
	Account ac= ar.findById(id).orElse(null);
    if(ac!=null&&ac.getBalance()>=amount)	
    {
    	ac.setBalance(ac.getBalance()-amount);
    	Transaction tc=new Transaction();
    	tc.setTranasactiontype("WITHDRAW");
    	tc.setTransactiondate(LocalDateTime.now());
    	tc.setAccount(ac);
    	tr.save(tc);
    	return ar.save(ac);
    }
    else {
    	return null;
    }
}

}
