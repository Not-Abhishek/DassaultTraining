package com.art.main;

import java.util.Scanner;

import com.art.main.EmployeeController;
import com.art.main.EmployeeDTO;
import com.art.main.EmployeeServices;

public class UI {

	public UI() {
		System.out.println("Welcome to UI");
		userOptions();

	}

	public void userOptions() {

		System.out.println("1: Add Employee");
		System.out.println("2: View Employee");
		System.out.println("3: Delete Employee");
		System.out.println("4: Update Employee");
		System.out.println("5: View all Employees");
		System.out.println("6: Exit ");
		System.out.print("Enter your selection : ");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		doTask(choice);

	}

	public void doTask(int choice) {
		EmployeeServices employeeservice = new EmployeeServices();
		EmployeeDTO employeeDTO = new EmployeeDTO();
//		
//		employeeDTO.setIdNumber(111);
//		employeeDTO.setName("Abhishek");
//		employeeDTO.setCity("Delhi");
//		employeeservice.addEmployee(employeeDTO);
		
		Scanner scanner = new Scanner(System.in);
		
		switch (choice) {
		case 1:
			System.out.print("Employee Id Number: ");
			int idNumber = scanner.nextInt();
			System.out.println("Enter Emplpoyee Name");
			String name = scanner.next();

			System.out.println("Enter Emplpoyee City");
			String city = scanner.next();

			employeeDTO = new EmployeeDTO(idNumber, name, city);
			employeeservice.addEmployee(employeeDTO);
			System.out.println(employeeDTO.toString());
			System.out.println("Going to main menu");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			userOptions();
		case 2:
			System.out.println("Enter Employee Id to view");
			int a=scanner.nextInt();
			employeeservice.viewEmployee(a);
			System.out.println("Going to main menu");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			userOptions();
		case 3:
			System.out.println("Enter Id to be deleted");
			int x=scanner.nextInt();
			employeeservice.deleteEmployee(x);
			System.out.println("Going to main menu");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			userOptions();
		case 4:
			System.out.println("Enter Id to be updated");
			int usid=scanner.nextInt();
			employeeservice.updateEmployee(usid);
			System.out.println("Going to main menu");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			userOptions();
		case 5:
			employeeservice.viewAllEmployees();
			System.out.println("Going to main menu");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			userOptions();

		case 6:
			System.exit(0);
		default:
			break;
		}
		userOptions();
	}

}
