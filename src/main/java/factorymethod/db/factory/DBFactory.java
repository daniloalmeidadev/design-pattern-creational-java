package factorymethod.db.factory;

import factorymethod.db.databases.DB;

public interface DBFactory {
	DB getDataBase();
}
