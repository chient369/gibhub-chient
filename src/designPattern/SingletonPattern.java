package designPattern;

public class SingletonPattern {
	private SingletonPattern singletonPattern;
	public static SingletonPattern getSingletonPattern() {
		return HelperSingleton.SINGLETON_PATTERN;
	}
	public static class HelperSingleton{
		public static final SingletonPattern SINGLETON_PATTERN =  new SingletonPattern();
	}

}
