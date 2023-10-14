package factorymethod.solution_1.model;

public class IPhone11Pro extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("Name: IPhone11Pro");
		System.out.println("Screen: 5.4in Screnn");
		System.out.println("Others...");
	}
}
