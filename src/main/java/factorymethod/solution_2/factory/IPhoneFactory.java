package factorymethod.solution_2.factory;

import factorymethod.solution_2.model.IPhone;
import factorymethod.solution_2.model.IPhone11Pro;
import factorymethod.solution_2.model.IPhoneX;

public class IPhoneFactory {

	public static IPhone orderIPhone(String generation) {

		IPhone device = null;

		if (generation.equals("IPhoneX")) {
			device = new IPhoneX();
		} else if (generation.equals("IPhone11Pro")) {
			device = new IPhone11Pro();
		}

		if (device != null) {
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();
		}

		return device;
	}
}
