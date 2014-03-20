package main.domain;

public class Account implements Comparable<Account>{
	private int id;
	private String name;
	private double balance;

	
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getBalance() {
		return balance;
	}

	
	@Override
	public String toString(){
		return name + " id: " + id + " balance: " + balance;
	}



	




	@Override
	public int hashCode() {
//		System.out.println("Hashcode called");
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
//		System.out.println("eQUALS called");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Double.doubleToLongBits(balance) != Double
				.doubleToLongBits(other.balance))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public int compareTo(Account account) {

		
		if(this.equals(account)) return 0;
		
		if(this.getBalance() < account.getBalance()) return -1;
		if(this.getBalance() > account.getBalance()) return 1;
		
		
		return 0;
	}
	
	

}
