package factorymethod.db.databases;

public class MySqlDB implements DB {

	@Override
	public void query(String sql) {
		System.out.println("Query in MySQL DB: " + sql);
	}
}
