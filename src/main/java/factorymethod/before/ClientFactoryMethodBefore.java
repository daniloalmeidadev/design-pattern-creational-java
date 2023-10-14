package factorymethod.before;

import factorymethod.before.model.IPhone;
import factorymethod.before.model.IPhone11;
import factorymethod.before.model.IPhone11Pro;
import factorymethod.before.model.IPhoneX;
import factorymethod.before.model.IPhoneXSMax;

public class ClientFactoryMethodBefore {

	public static void main(String[] args) {
		
		ClientFactoryMethodBefore client = new ClientFactoryMethodBefore();

		System.out.println("#### Ordering an IPhone X ####");
		IPhone iphone = client.orderIPhone("X", "standard");
		System.out.println(iphone);
	}
	
	public IPhone orderIPhone(String generation, String level) {
		
		IPhone device = null;
		
		if (generation.equals("X")) {
			if (level.equals("standard")) {
				device = new IPhoneX();
			} else if (level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		} else if (generation.equals("11")) {
			if (level.equals("standard")) {
				device = new IPhone11();
			} else if (level.equals("highEnd")) {
				device = new IPhone11Pro();
			}
		}
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
}
