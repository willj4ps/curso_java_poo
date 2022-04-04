package poo.polymorphism.exercises2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price) {
		super(name, price);
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	
	
	
	@Override
	public String priceTag() {
		return super.getName() + 
				" (used) $ " + String.format("%.2f", super.getPrice()) + 
				" (Manufacture date: " + sdf.format(manufactureDate) + ")" ;
	}
	
	
}
