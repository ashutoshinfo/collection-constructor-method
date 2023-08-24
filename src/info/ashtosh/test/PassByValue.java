package info.ashtosh.test;

class Employee {
	private int in;
	private String name;

	public Employee(int in, String name) {
		super();
		this.in = in;
		this.name = name;
	}

	public int getIn() {
		return in;
	}

	public void setIn(int in) {
		this.in = in;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [in=" + in + ", name=" + name + "]";
	}

}

public class PassByValue {

	public static void main(String[] args) {

		Employee employee = new Employee(1, "Ashutosh");
		change(employee);
		System.out.println(employee);

		int i = 0;
		add(i);
		System.out.println(i);

		String string = "Stirng literal";
		changeStringliteral(string);
		System.out.println(string);

		String s = new String("String new Keyword");
		changeString(s);
		System.out.println(s);

		StringBuffer buffer = new StringBuffer("Ashutosh");
		changeBuffer(buffer);
		System.out.println(buffer);
	}

	private static void changeStringliteral(String string) {
		string = "TryChangingStirngliteral";

	}

	private static void changeBuffer(StringBuffer buffer) {

		buffer.setLength(0);
		buffer.append("ChangedByBuffer");
	}

	private static void changeString(String s) {

		s = "Can't Change!";
	}

	private static void add(int i) {

		i = 10;
	}

	private static void change(Employee s) {
		s.setName("Changed!");

	}
}