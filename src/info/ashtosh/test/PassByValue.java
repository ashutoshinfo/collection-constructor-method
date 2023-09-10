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

		int i = 10;
		changePrimitive(i);
		System.out.println(i);

		String string = "Stirng literal";
		changeStringliteral(string);
		System.out.println(string);

		String s = new String("new String");
		changeStringObject(s);
		System.out.println(s);

		StringBuffer stringBuffer = new StringBuffer("new StringBuffer");
		changeStringBuffer(stringBuffer);
		System.out.println(stringBuffer);
	}

	private static void changeStringliteral(String string) {
		string = "TryChangingStirngliteral";
	}

	private static void changeStringBuffer(StringBuffer buffer) {
		buffer.setLength(0);
		buffer.append("Try Changing StirngBuffer");
	}

	private static void changeStringObject(String string) {
		string = "Try Changing Stirng Object";
	}

	private static void changePrimitive(int i) {
		i = 100;
	}

	private static void change(Employee s) {
		s.setName("Changed!");

	}
}