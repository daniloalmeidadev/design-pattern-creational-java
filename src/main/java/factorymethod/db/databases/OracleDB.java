package factorymethod.db.databases;

public class OracleDB implements DB {

	@Override
	public void query(String sql) {
		System.out.println("Query in Oracle DB: " + sql);
	}
}
