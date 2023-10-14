package factorymethod.db.databases;

public class PostgresDB implements DB {

	@Override
	public void query(String sql) {
		System.out.println("Query in Postgres DB: " + sql);
	}
}
