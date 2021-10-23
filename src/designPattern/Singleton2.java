package designPattern;

public class Singleton2 {
	private static final Singleton2 SINGLETON2 = new Singleton2();

	private Singleton2() {

	}

	public static Singleton2 getSingleton2() {
		return SINGLETON2;
	}

}
