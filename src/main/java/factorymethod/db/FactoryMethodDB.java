package factorymethod.db;

import factorymethod.db.databases.DB;
import factorymethod.db.factory.MySqlDBFactory;

public class FactoryMethodDB {

	public static void main(String[] args) {
		System.out.println("\n");
		
		DB db = new MySqlDBFactory().getDataBase();
		db.query("Select * from users;");
	}
}
