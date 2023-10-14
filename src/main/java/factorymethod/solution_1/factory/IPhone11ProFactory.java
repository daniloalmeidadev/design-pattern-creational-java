package factorymethod.solution_1.factory;

import factorymethod.solution_1.model.IPhone;
import factorymethod.solution_1.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone() {
		return new IPhone11Pro();
	}
}
