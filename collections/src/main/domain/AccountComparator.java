package main.domain;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {

	@Override
	public int compare(Account a1, Account a2) {
		
		System.out.println("In compare");
 		
		if(a1.equals(a2)) return 0;
		
		if(a1.getBalance() > a2.getBalance()) return -1;
		if(a1.getBalance() < a2.getBalance()) return 1;
		
		return a1.getName().compareTo(a2.getName());
		
		
	}

}
