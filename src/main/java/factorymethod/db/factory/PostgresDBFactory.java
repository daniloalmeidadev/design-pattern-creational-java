package factorymethod.db.factory;

import factorymethod.db.databases.DB;
import factorymethod.db.databases.PostgresDB;

public class PostgresDBFactory implements DBFactory {

	@Override
	public DB getDataBase() {
		return new PostgresDB();
	}
}
