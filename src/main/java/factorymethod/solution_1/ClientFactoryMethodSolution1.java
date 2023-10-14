package factorymethod.solution_1;

import factorymethod.solution_1.factory.IPhone11ProFactory;
import factorymethod.solution_1.factory.IPhoneFactory;
import factorymethod.solution_1.factory.IPhoneXFactory;
import factorymethod.solution_1.model.IPhone;

public class ClientFactoryMethodSolution1 {

	public static void main(String[] args) {
		System.out.println("#### teste");

		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		System.out.println("#### Ordering an IPhone X ####");
		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);

		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		System.out.println("\n\n#### Ordering an IPhone11Pro ####");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);
	}
}
