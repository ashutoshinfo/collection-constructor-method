package info.ashtosh.test.ff;

public interface Testttttt {

	default void name() {
		System.out.println("Testttttt.name()");
	}

}

class TEtingss implements Testttttt {

	@Override
	public void name() {
		System.out.println("TEtingss.name()");
		// TODO Auto-generated method stub
	}

	public void name2() {
		Testttttt.super.name();
		System.out.println("TEtingss.name2()");
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		TEtingss etings = new TEtingss();
		etings.name();

		TEtingss etings22 = new TEtingss();
		etings22.name2();
	}

}