
public class Ekmek extends FirinProduct{

	private int numberofDilim;
	private double priceperDilim;
	
	
	
	public Ekmek(String name, int numberofDilim, double priceperDilim) {
		super(name);
		this.numberofDilim = numberofDilim;
		this.priceperDilim = priceperDilim;
	}
	
	
	public int getCost() {
		
		return (int)(getNumberofDilim()*getPriceperDilim());
	}
	
	
	public int getNumberofDilim() {
		return numberofDilim;
	}
	public void setNumberofDilim(int numberofDilim) {
		this.numberofDilim = numberofDilim;
	}
	public double getPriceperDilim() {
		return priceperDilim;
	}
	public void setPriceperDilim(double priceperDilim) {
		this.priceperDilim = priceperDilim;
	
	}
	
	public String toString() {
		
		return super.toString() + getCost() +"\n";
	}
	
	
}
