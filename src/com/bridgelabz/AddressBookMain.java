package com.bridgelabz;



import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		
		AddressBookMethods obj = new AddressBookMethods();
		obj.startOfProgram();
		System.out.println(Arrays.toString(obj.contactsArray));
	}
}
