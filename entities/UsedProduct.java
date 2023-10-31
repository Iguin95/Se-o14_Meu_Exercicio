package entities;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDate manufactureDate;
	
	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}


	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}



	@Override
	public String priceTag() {
		String formattedDate = manufactureDate.format(fmt);
		return getName() +" (used) $ " 
				+ String.format("%.2f", getPrice()) 
				+ "(Manufacture date:" + formattedDate + ")";
	}

}
