package factorymethod.db.factory;

import factorymethod.db.databases.DB;
import factorymethod.db.databases.OracleDB;

public class OracleDBFactory implements DBFactory {

	@Override
	public DB getDataBase() {
		return new OracleDB();
	}
}
