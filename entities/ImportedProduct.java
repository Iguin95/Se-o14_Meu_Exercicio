package entities;

public class ImportedProduct extends Product {

	private Double Customsfee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsfee) {
		super(name, price);
		Customsfee = customsfee;
	}

	public Double getCustomsfee() {
		return Customsfee;
	}

	public void setCustomsfee(Double customsfee) {
		Customsfee = customsfee;
	}
	
	public double totalPrice() {
		return super.getPrice() + this.Customsfee;
	}

	@Override
	public String priceTag() {
		return getName() 
		+ " $ " 
		+ String.format("%.2f", totalPrice()) 
		+ "(Customs fee: $ "
		+ String.format("%.2f", this.Customsfee) + ")";
	}
	
	
}
