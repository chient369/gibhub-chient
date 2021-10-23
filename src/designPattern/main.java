package designPattern;

public class main {

	public static void main(String[] args) {
		SingletonPattern pattern = SingletonPattern.getSingletonPattern();
		System.out.println(pattern);
		Singleton2 singleton2 = Singleton2.getSingleton2();
		System.out.println(singleton2);

	}

}
