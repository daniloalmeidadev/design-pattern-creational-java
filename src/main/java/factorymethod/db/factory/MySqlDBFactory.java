package factorymethod.db.factory;

import factorymethod.db.databases.DB;
import factorymethod.db.databases.MySqlDB;

public class MySqlDBFactory implements DBFactory {

	@Override
	public DB getDataBase() {
		return new MySqlDB();
	}
}
