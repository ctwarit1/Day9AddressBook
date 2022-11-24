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
	
//	UC3 ability to edit a contact using their first name
	
	// edit method *********UC3************
	
		public void editDetails() {
			System.out.println("Enter the first name of the contact to edit the details ");
			Scanner input = new Scanner(System.in);
			String fName = input.next();
			for (AddressBook edit : contactsArray) {
				if (edit == null) {
					
				} else {
					
					if (fName.equals(edit.getFirstName())) {
						System.out.println("First name is: " + fName);
						System.out.println("   Re-enter the correct details of the person   ");
						System.out.println(
								"What you want to edit?\n1. Last Name \n 2. Address \n 3. City \n 4. State \n 5. Email \n 6. Zip \n 7. Phone Number ");
						int editInput = input.nextInt();
						switch (editInput) {

						case 1:
							System.out.println("Enter the last name: ");
							String name = input.next();
							edit.setLastName(name);
							break;

						case 2:
							System.out.println("Enter the Address: ");
							String address = input.next();
							edit.setAddress(address);
							break;

						case 3:
							System.out.println("Enter the City: ");
							String city = input.next();
							edit.setCity(city);
							break;

						case 4:
							System.out.println("Enter the State: ");
							String state = input.next();
							edit.setState(state);
							break;

						case 5:
							System.out.println("Enter the Email: ");
							String email = input.next();
							edit.setEmail(email);
							break;

						case 6:
							System.out.println("Enter the Zip: ");
							int zip = input.nextInt();
							edit.setZip(zip);
							break;

						case 7:
							System.out.println("Enter the Phone Number: ");
							long phoneNumber = input.nextLong();
							edit.setPhoneNumber(phoneNumber);
							break;
						}
					} else
						System.out.println("***Wrong input***");
				}
			}
		}