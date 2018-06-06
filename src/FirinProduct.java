
public abstract class FirinProduct {

	private String name;
	
	public FirinProduct(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int getCost();
	
	public String toString() {
		
		
		return "product name" + getName() + "cost: ";
	}
	
}
