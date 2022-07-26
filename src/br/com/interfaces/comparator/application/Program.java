package br.com.interfaces.comparator.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.interfaces.comparator.entities.Employee;

public class Program {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "C:\\Windows\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[0])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for (Employee employeName : list) {
				System.out.println(employeName.getName() + ", " + employeName.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
