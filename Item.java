import java.text.*;
public class Item {
	private String name;
	private double price;
	private double bulk_price;
	private int bulk_quant;
	public Item (String name, double price){
		if (price < 0){
			throw new IllegalArgumentException("Price can't be negative!");
		}
		this.name = name;
		this.price = price;
	}
	public Item (String name, double price, int bulk_quant, double bulk_price){
		if (price < 0 || bulk_quant < 0 || bulk_price < 0){
			throw new IllegalArgumentException("Can't be negative!");
		}
		this.name = name;
		this.price = price;
		this.bulk_price = bulk_price;
		this.bulk_quant = bulk_quant;
	}
	public double priceFor (int quantity){
		if (quantity < 0){
			throw new IllegalArgumentException("Can't be negative!");
		}
		if (bulk_price == 0){
			return quantity * price;
		}
		else {
			return (quantity/bulk_quant) * bulk_price + (quantity%bulk_quant) * price;
		}
	}
	public String toString(){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		if (bulk_price == 0){
			return name + ", " + nf.format(price);
		}
		else {
			return name + ", " + nf.format(price) + " (" + bulk_quant + " for " + nf.format(bulk_price) + ")";
		}
	}
}