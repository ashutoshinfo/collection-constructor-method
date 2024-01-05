package info.ashtosh.test.ff;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

interface InterfaceA {
	default void commonMethod() {
		System.out.println("Default implementation in InterfaceA");
	}
}

interface InterfaceB {
	default void commonMethod() {
		System.out.println("Default implementation in InterfaceB");
	}
}

class MyClass implements InterfaceA, InterfaceB {
	public static void main(String[] args) {

		try {
			// code that may throw exceptions
			Set<String> hashSet=new HashSet<>();
			System.out.println(hashSet.size());
			

		} catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
			// This will result in a compile-time error because NullPointerException
			// is a subclass of RuntimeException, and it will never be reached
			System.out.println("Compile-time error: " + e);
		}
	}

	@Override
	public void commonMethod() {
		// TODO Auto-generated method stub
		InterfaceA.super.commonMethod();
	}

}
