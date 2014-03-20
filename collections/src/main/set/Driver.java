package main.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import main.domain.Account;
import main.domain.AccountComparator;



public class Driver {

	public static void main(String[] args) {
		Account accountTwo = new Account(2, "Jill", 200.0);
		Account accountThree = new Account(3, "Joan", 300.0);
		Account accountFour = new Account(4, "Arthur", 400.0);
		Account accountFive = new Account(5, "Jayne", 50.0);
		Account accountOne = new Account(1, "Fred", 100.0);
		
		Set<Account> accounts = 
			new TreeSet<Account>(new AccountComparator());


		
		
//		Set<Account> accounts = new LinkedHashSet<Account>();
		
//		Set<Account> accounts = new HashSet<Account>();

	
		
		
		
		accounts.add(accountTwo);
		accounts.add(accountThree);
		accounts.add(accountFour);
		accounts.add(accountFive);
		accounts.add(accountOne);
		

		
		System.out.println("\n\naccounts: ");

		for(Account account: accounts){
			System.out.println(account);
		}
		
		
	}

}
