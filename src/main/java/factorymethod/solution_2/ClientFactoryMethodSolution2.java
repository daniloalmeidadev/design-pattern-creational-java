package factorymethod.solution_2;

import factorymethod.solution_2.factory.IPhoneFactory;
import factorymethod.solution_2.model.IPhone;

public class ClientFactoryMethodSolution2 {

	public static void main(String[] args) {
		
		System.out.println("#### Ordering an IPhone X ####");
		IPhone iphone = IPhoneFactory.orderIPhone("IPhoneX");
		System.out.println(iphone);

		System.out.println("\n\n#### Ordering an IPhone11Pro ####");
		IPhone iphone2 = IPhoneFactory.orderIPhone("IPhone11Pro");
		System.out.println(iphone2);
	}
}
