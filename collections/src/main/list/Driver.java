package main.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import main.domain.Account;
import main.domain.AccountComparator;

public class Driver {

	public static void main(String[] args) {

		Account accountOne = new Account(1, "Fred", 300.0);
		Account accountTwo = new Account(2, "Jill", 300.0);
		Account accountThree = new Account(3, "Joan", 300.0);
		Account accountFour = new Account(4, "Arthur", 400.0);
		Account accountFive = new Account(5, "Jayne", 500.0);

		List<Account> accounts = new ArrayList<Account>();
		
		
		accounts.add(accountTwo);
		accounts.add(accountThree);
		accounts.add(accountFour);
		accounts.add(accountFive);
		accounts.add(accountOne);
		
		System.out.println("\n\n	Pre-Sorted accounts: ");

				
		for(Account account: accounts){
			System.out.println(account);
		}
		
		Collections.sort(accounts,
							new AccountComparator()); 
		

		System.out.println("\n\nAccounts sorted by comparator: ");
		for(Account account: accounts){
			System.out.println(account);
		}		

		Collections.sort(accounts); 


		System.out.println("\n\nAccounts sorted by comparable: ");
		for(Account account: accounts){
			System.out.println(account);
		}		
	
	
	}

}
