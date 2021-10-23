package desginPattern.factoryMethod;

public class AccessSQL implements Database {

	public String setName(String dbType) {
		System.out.println("its AcessSQL");
		return null;
	}

	@Override
	public int setPassword(String pass) {
		System.out.println("Pass: 0000000");
		return 0;
	}

	@Override
	public void setDb() {
		System.out.println("Ac ok");
		
	}

	

}
