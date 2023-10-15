package abstractfactory;

import abstractfactory.factories.EnterpriseCustomerVehicleFactory;
import abstractfactory.vehicle.Vehicle;

public class AbstractFactory {

	public static void main(String[] args) {

		EnterpriseCustomerVehicleFactory EnterpriseFactory = 
				new EnterpriseCustomerVehicleFactory();

		Vehicle car1 = EnterpriseFactory.createVehicle("Fusca", "João");
		Vehicle car2 = EnterpriseFactory.createVehicle("Celta", "Helena");

		car1.pickUp();
		car2.pickUp();
	}
}
