package factorymethod.before.model;

public class IPhoneXSMax extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("Name: IPhoneXSMax");
		System.out.println("Scress: 6.5in Screnn");
		System.out.println("Others...");
	}
}
