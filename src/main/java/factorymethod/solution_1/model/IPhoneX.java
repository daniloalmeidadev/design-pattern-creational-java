package factorymethod.solution_1.model;

public class IPhoneX extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("Name: IPhoneX");
		System.out.println("Scress: 5.8in Screnn");
		System.out.println("Others...");
	}
}
