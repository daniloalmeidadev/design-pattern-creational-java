package factorymethod.solution_2.model;

public class IPhoneX extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("Name: IPhoneX");
		System.out.println("Screen: 5.8in Screnn");
		System.out.println("Others...");
	}
}
