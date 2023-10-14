package factorymethod.before;

import factorymethod.before.model.IPhone;
import factorymethod.before.model.IPhone11Pro;
import factorymethod.before.model.IPhoneX;

public class ClientFactoryMethodBefore {

	public static void main(String[] args) {

		ClientFactoryMethodBefore client = new ClientFactoryMethodBefore();

		System.out.println("#### Ordering an IPhone X ####");
		IPhone iphone = client.orderIPhone("IPhoneX");
		System.out.println(iphone);
		
		System.out.println("\n\n#### Ordering an IPhone X ####");
		IPhone iphone2 = client.orderIPhone("IPhone11Pro");
		System.out.println(iphone2);
	}

	public IPhone orderIPhone(String generation) {

		IPhone device = null;

		if (generation.equals("IPhoneX")) {
			device = new IPhoneX();
		} else if (generation.equals("IPhone11Pro")) {
			device = new IPhone11Pro();
		}

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}
}
