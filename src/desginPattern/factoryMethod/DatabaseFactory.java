package desginPattern.factoryMethod;

enum DBType{
	MYSQL,ACCESSSQL
};
public class DatabaseFactory {

	private DatabaseFactory() {
		
	}
	
	public static final Database getDatabase(DBType dbType) {
		switch (dbType) {
		case MYSQL:
			return new MySQL();
			
		case ACCESSSQL:
			return new AccessSQL();
		
		default:
			System.out.println("errors");
		}
		return null;
		
	}
	

}
