package info.ashtosh.test.ff;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

class Employee2 implements Comparable<Employee2> {
	public int i;
	String name;

	public Employee2(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}

	@Override
	public int compareTo(Employee2 o) {
		if (this.i < o.i) {
			return -1;
		} else if (this.i > o.i) {
			return 1;
		} else {
			return this.name.compareTo(o.name);
		}
	}

	@Override
	public String toString() {
		return "Employee2 [i=" + i + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Employee2.hashCode()" + toString());
		return Objects.hash(i, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("equals() this == obj true" + toString());
			return true;
		}
		if (obj == null) {
			System.out.println("equals() obj == null false" + toString());
			return false;
		}
		if (getClass() != obj.getClass()) {
			System.out.println("Employee2.equals() false" + toString());
			return false;
		}
		Employee2 other = (Employee2) obj;
		boolean b = i == other.i && Objects.equals(name, other.name);
		System.out.println("equals() i == other.i && Objects.equals(name, other.name) " + b + " | " + toString());
		return i == other.i && Objects.equals(name, other.name);
	}

}

public class Testing {

//	static final Comparator<Employee2> COMPARATOR = (o1, o2) -> o1.name.compareTo(o2.name);
	static final Comparator<Employee2> COMPARATOR = Comparator.<Employee2, Integer>comparing(e -> e.i)
			.thenComparing(e -> e.name);

	public static void main(String[] args) {
		Employee2 employee1 = new Employee2(1, "A");
		Employee2 employee2 = new Employee2(2, "B");
		Employee2 employee3 = new Employee2(3, "C");
		Employee2 employee4 = new Employee2(1, "A");

		TreeSet<Employee2> employee2s = new TreeSet<>(COMPARATOR);
		employee2s.add(employee1);
		employee2s.add(employee2);
		employee2s.add(employee3);
		employee2s.add(employee4);

//		System.out.println(employee2s);

		Map<Employee2, Employee2> map = new HashMap<>();
		map.put(employee1, employee3);
		map.put(employee4, employee3);
		map.put(employee3, employee3);
		map.forEach((o1, o2) -> System.out.println(o1 + " | " + o2));

	}
}
