package abstractfactory.customer;

public class IndividualCustomer 
	implements Customer {
	
	private String name;

	public IndividualCustomer(String name) {
		this.name = name;
	}
	
	@Override
	public String name() {
		return name;
	}
}
