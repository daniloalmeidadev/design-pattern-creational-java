package factorymethod.solution_1.factory;

import factorymethod.solution_1.model.IPhone;
import factorymethod.solution_1.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone() {
		return new IPhoneX();
	}
}
