package com.art.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.art.main.EmployeeDAO;
import com.art.main.EmployeeDTO;

public class EmployeeServices {

	EmployeeDTO employeeDTO;
	static List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();

	public EmployeeServices() {

	}

	public EmployeeDTO findRecord(int idNumber) {

		for (EmployeeDTO l : list) {

			// Checking record by id Number.
			if (l.getIdNumber() == idNumber) {
				return l;
			}
		}

		return null;
	}

	public boolean find(int idNumber) {

		for (EmployeeDTO e : list) {

			if (e.getIdNumber() == idNumber) {

				System.out.println(e);
				return true;
			}
		}
		return false;
	}

	public void addEmployee(EmployeeDTO employeeDTO) {

		if (!find(employeeDTO.getIdNumber())) {
			list.add(employeeDTO);
		} else {

			System.out.println("Employee Id already exists in employee");
		}

	}

	public void updateEmployee(int idNumber) {
		Scanner input = new Scanner(System.in);
		if (find(idNumber)) {
			EmployeeDTO employeeDTO = findRecord(idNumber);
			System.out.println("Enter New Name");
			String name = input.nextLine();
			System.out.println("Enter New City");
			String city = input.nextLine();
			employeeDTO.setCity(city);
			employeeDTO.setName(name);
			System.out.println("Record Updated Successfully");

		} else {
			System.out.println("Record Not Found in update");
		}

	}

	public void viewEmployee(int idNumber) {
		for (EmployeeDTO e : list) {
			if (e.getIdNumber() == idNumber) {
				System.out.println(e);
			}
		}
	}

	public void viewAllEmployees() {

		if (list.isEmpty()) {
			System.out.println("No Records");
		}
		for (EmployeeDTO employee : list) {
			System.out.println(employee.toString());
		}
	}

	public void deleteEmployee(int idNumber) {
		EmployeeDTO emp;
		System.out.println("Do you want to delete the following Employee\n");
		for (EmployeeDTO l1 : list) {
			if (l1.getIdNumber() == idNumber) {
				System.out.println(l1);
			}
		}
		Scanner input = new Scanner(System.in);
		String c = input.nextLine();
		
			EmployeeDTO empDel = null;

			for (EmployeeDTO ll : list) {

				if (ll.getIdNumber() == idNumber) {
					empDel = ll;
				}
			}

			if (empDel == null) {

				System.out.println("No record found in delete");
			} else {

				list.remove(empDel);

				System.out.println("Successfully removed record from the list");
			}
		 
	}

}