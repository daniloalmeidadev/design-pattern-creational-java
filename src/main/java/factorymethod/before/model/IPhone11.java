package factorymethod.before.model;

public class IPhone11 extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("Name: IPhone11");
		System.out.println("Scress: 6.4in Screnn");
		System.out.println("Others...");
	}
}
