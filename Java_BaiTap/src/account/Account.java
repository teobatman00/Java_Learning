package account;

import java.util.Scanner;

public class Account {
	private String id;
	private String name;
	private int balance;
	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	
	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getBalance() {
		return this.balance;
	}
	
	public int credit (int amount) {
		return this.balance += amount;
	}

	public int debit(int amount) {
		if(amount <= this.balance) {
			this.balance-= amount;
		} else {
			System.out.println("Amount exceed balance");
		}
		return this.balance;
	}
	
	public int transferTo(Account another, int amount) {
		if(amount<=this.balance) {
			System.out.println("Transfered "+ amount +" to the given Account");
			this.balance -= amount;
			another.balance+= amount;
		} else {
			System.out.println("Amount exceed balance");
		}
		return this.balance;
	}
	
	@Override
	public String toString() {
		return "Account[id= "+this.id+", name= "+this.name+", balance= "+this.balance+"]";
	}

	public static void main(String[] args) {
		String id, another_id;
		String name, another_name;
		int balance, amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to banking account management ");
		System.out.println("Create account id: ");
		id = sc.next();
		sc.nextLine();
		System.out.println("Create account name: ");
		name = sc.nextLine();
		System.out.println("Create account balance: ");
		balance = sc.nextInt();
		Account ac1 = new Account(id, name, balance);
		System.out.println("Account id: "+ac1.getId());
		System.out.println("Account name: "+ac1.getName());
		System.out.println("Account balance: "+ac1.getBalance());
		System.out.println(ac1.toString());
		
		System.out.println("Type money for adding to balance: ");
		amount = sc.nextInt();
		System.out.println("New balance: "+ac1.credit(amount));
		System.out.println("Type money to subtract from balance: ");
		amount = sc.nextInt();
		System.out.println("Balance after subtract: "+ac1.debit(amount));
		System.out.println(ac1.toString());
		
		System.out.println("Type another account id: ");
		another_id = sc.next();
		sc.nextLine();
		System.out.println("Type another account name: ");
		another_name = sc.nextLine();
		Account another = new Account(another_id, another_name);
		System.out.println("Type amount of money to transfer: ");
		amount = sc.nextInt();
		System.out.println(ac1.transferTo(another, amount));
		System.out.println("Your balace: "+ac1.getBalance());
		System.out.println(ac1.toString());
	}

}
