package desginPattern.factoryMethod;

public class main {
	public static void main(String[] args) {
		Database db = DatabaseFactory.getDatabase(DBType.MYSQL);
		db.setName(null);
		db.setPassword(null);
		Database dbacc = DatabaseFactory.getDatabase(DBType.ACCESSSQL);
		dbacc.setName(null);
		dbacc.setPassword(null);
	}

}
