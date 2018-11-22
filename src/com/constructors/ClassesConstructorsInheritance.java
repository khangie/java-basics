package com.constructors;

public class ClassesConstructorsInheritance {

	public static void main(String[] args) {
		
		Account account = new Account("12345", 0d, "John Doe", "test@hotmail.com", "111");
		account.withdrawal(100);
		account.deposit(50);
		
		VipPerson person = new VipPerson("Bob", 25000d);
		System.out.println(person.getName());
		
	}
}
