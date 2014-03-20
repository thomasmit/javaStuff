package main.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import main.domain.Account;
import main.domain.AccountComparator;

class X {}
public class Driver {
	public static void main(String[] args) {
		Account accountThree = new Account(3, "Joan", 300.0);
		Account accountFour = new Account(4, "Arthur", 400.0);
		Account accountFive = new Account(5, "Jayne", 500.0);
				
		Account accountTwo = new Account(2, "Jill", 200.0);
		Account accountOne = new Account(1, "Fred", 100.0);
		
		
//		Map<Integer, Account> accounts = new HashMap<Integer, Account>();
//		Map<Integer, Account> accounts = new LinkedHashMap<Integer, Account>();
	Map<String, Account> accounts = 
			new TreeMap<String, Account>(new ReverseStringComparator());


		
		accounts.put("b",accountTwo);
		accounts.put("c",accountThree);
		accounts.put("d",accountFour);
		accounts.put("e",accountFive);
		accounts.put("a",accountOne);
		System.out.println("\n\nAccounts: ");

		for(Account account: accounts.values()){
			System.out.println(account);
		}

	}

}
