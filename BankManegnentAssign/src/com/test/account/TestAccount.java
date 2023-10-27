package com.test.account;

import java.util.Scanner;

import validation.*;

import Custom_exeption.InvalidInput;


import com.bank.*;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(
					"Enter vehicle details : chasisNo,  vehicleColor,  price,  manufactureDate(yr-mon-day), company");
			Account account = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
			System.out.println(account);
		} catch (Exception e) {
		//	System.out.println(e);
			e.printStackTrace();
		}
		
		
	}

	private static Account validateAllInputs(String next, String next2, double nextDouble, String next3, String next4) {
		// TODO Auto-generated method stub
		return null;
	}

}
