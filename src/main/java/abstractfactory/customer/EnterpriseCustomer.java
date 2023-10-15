package abstractfactory.customer;

public class EnterpriseCustomer 
	implements Customer {
	
	private String name;

	public EnterpriseCustomer(String name) {
		this.name = name;
	}
	
	@Override
	public String name() {
		return name;
	}
}
