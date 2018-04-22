package aspecj.learn.curve.udemy_hands_on.dao;

import org.springframework.stereotype.Component;

import aspecj.learn.curve.udemy_hands_on.Account;

@Component
public class MembershipDAO {

	public void addAccount(Account account,boolean name) {
		System.out.println(getClass()+ " DOING my DB work for membership: ADDING an account");
		return ;
	}
}
