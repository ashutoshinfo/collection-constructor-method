package info.ashtosh.test.ff;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	// Other employee attributes...

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Getter and setter methods...

	@Override
	public int compareTo(Employee otherEmployee) {
		// Implement default comparison logic based on employee names
		return this.name.compareTo(otherEmployee.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	// Getter for ID
	public int getId() {
		return id;
	}

	// Getter for Name
	public String getName() {
		return name;
	}
}

public class EmployeeSortingExample {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "John"));
		employees.add(new Employee(101, "John"));
		employees.add(new Employee(102, "Mary"));
		employees.add(new Employee(102, "Mary"));
		employees.add(new Employee(102, "Mary"));
		employees.add(new Employee(103, "Alice"));
		employees.add(new Employee(104, "Bob"));

		// Step 1: Remove Duplicates
		Set<Employee> uniqueEmployeesSet = new HashSet<>(employees);
		List<Employee> uniqueEmployeesList = new ArrayList<>(uniqueEmployeesSet);

		// Step 2: Sort the List based on ID using Comparator
		Collections.sort(uniqueEmployeesList, Comparator.comparingInt(Employee::getId));

		// Step 3: Display or Use the Sorted List
		for (Employee employee : uniqueEmployeesList) {
			System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName());
		}
	}
}
