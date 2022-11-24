package com.bridgelabz;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddressBookMethods {

//	array creation
	AddressBook contactsArray[] = new AddressBook[20];
	static Scanner input = new Scanner(System.in);
	int index;
	
	//UC 2 ability to a new contact in address book.
	// adding details   *******UC2*******
	public void AddingDetails() {

		System.out.println(" Enter how many persons you want to add in contact book: ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {

			System.out.println("***Enter persons details***");
			System.out.println("Enter First name: ");
			String firstName = input.next();
			System.out.println("Enter Last name: ");
			String lastName = input.next();
			System.out.println("Enter address: ");
			String address = input.next();
			System.out.println("Enter city: ");
			String city = input.next();
			System.out.println("Enter state: ");
			String state = input.next();
			System.out.println("Enter email: ");
			String email = input.next();
			System.out.println("Enter zip: ");
			int zip = input.nextInt();
			System.out.println("Enter phoneNumber: ");
			long phoneNumber = input.nextLong();
			AddressBook obj = new AddressBook(firstName, lastName, address, city, state, email, zip, phoneNumber);
			storeArray(obj);
		}
	}