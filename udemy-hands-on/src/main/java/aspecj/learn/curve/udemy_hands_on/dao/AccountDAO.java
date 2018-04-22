package aspecj.learn.curve.udemy_hands_on.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import aspecj.learn.curve.udemy_hands_on.Account;

@Component//("accountDAO")
public class AccountDAO {

	String name;
	String serviceCode;
	
	public String getName() {
		System.out.println(getClass()+ " getName(String name)");
		
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(getClass()+ " setName(String name)");
		
	}

	public String getServiceCode() {
		System.out.println(getClass()+ " String getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass()+ " setServiceCode(String serviceCode)");
		
		this.serviceCode = serviceCode;
	}

	public void addAccount() {
		System.out.println(getClass()+ " DOING my DB work: ADDING an account");
	}
	public List<Account> findAccounts(boolean throwException){
		if(throwException) {
			throw new RuntimeException("Exception from find accounts");
		}
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("Raj","Mofma"));
		accounts.add(new Account("Raasj","Madofma"));		
		return accounts;
	}
}
