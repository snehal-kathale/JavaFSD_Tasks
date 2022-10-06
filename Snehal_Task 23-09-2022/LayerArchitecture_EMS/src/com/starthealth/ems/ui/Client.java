package com.starthealth.ems.ui;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.starhealth.ems.bean.Sports;
import com.starthealth.ems.service.SportsServiceImp;
import com.starthealth.ems.service.ISportsService;

public class Client { // USER INTERFACE

	
	public static void main(String[] args) {

	ISportsService service	  = new SportsServiceImp();
		
		Scanner scanner = new Scanner(System.in);

		
		
		boolean flag = true;

		while (flag) {

			System.out.println("*******WELCOME TO Sports MANAGEMENT SYSTEM*******");
			System.out.println("1. Add Sports");
			System.out.println("2. Update Sports");
			System.out.println("3. Delete Sports By Id");
			System.out.println("4. Select Sports By Id");
			System.out.println("5. Select All Sportss");
			System.out.println("6. Logout/Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				Sports sp = inputData();

				
			boolean isValid =	SportsServiceImp.validateInputs(sp);
				
			if(isValid) {
				int count = service.addSports(sp);

				System.out.println(count + " record inserted successfully");
			}
			else {
				
				System.err.println("Please Enter valid Inputs");
				
			}
				break;
				
				
			case 2:
				
					Sports sp2 = inputData();
					
					//update from DAO class
				
					int updateCount =	service.updateSports(sp2);
					
					System.out.println(updateCount+" record updated successfully");
				
				break;
				
			case 3:
				
				System.out.println("Enter Id to Delete One Record");
				int deletSid =scanner.nextInt();
					
				int deleteCount =	service.deleteById(deletSid);
				
				System.out.println(deleteCount+" record deleted successfully");
				
				break;
				
			case 4:
				System.out.println("Enter Id to Select One Record");
				int searchId =scanner.nextInt();
				
				Sports  sp1 =	service.selectSportsById(searchId);
				
				
				System.out.println(sp1);
				
				break;
				
			case 5:
				
				// select all 
				
				List<Sports> list =		service.selectAllSports();
				
			Stream<Sports> stream =	list.stream();
				
				
				//stream.forEach((Sports e1)-> {System.out.println(e1);});
			
			stream.forEach(System.out::println);
			
			
				break;
				
				
				
			case 6:
				
				//System.exit(0);// killing JVM
				
				System.out.println("Thank You , Logout Success");
				
				flag = false;
				
				break;

			default:
				break;
			}

		}

	}

	public static Sports inputData() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Sid");
		int Sid = scanner.nextInt();
		System.out.println("Enter Sname");
		String Sname = scanner.next();
		System.out.println("Enter Svalue");
		double Svalue = scanner.nextDouble();
		System.out.println("Enter Type");
		String Type = scanner.next();
		
		Sports sp = new Sports();
		sp.setsid(Sid);
		sp.setsname(Sname);
		sp.setsvalue(Svalue);
		sp.settype(Type);
		
		return sp;

	}

	
	
	
	
	
	
}
