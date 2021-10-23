package desginPattern.factoryMethod;

public class MySQL implements Database{

	@Override
	public String setName(String dbType) {
		System.out.println("it's MYSQL");
		return null;
	}

	@Override
	public int setPassword(String pass) {
		System.out.println("PAssword: chien");
		return 0;
	}

	@Override
	public void setDb() {
		System.out.println("OK MYSQL");
		
	}

}
