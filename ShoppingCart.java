import java.util.*;
public class ShoppingCart {
	private ArrayList<ItemOrder> itemOrders;
	private boolean discount;
	private double total;
	public ShoppingCart(){
		itemOrders = new ArrayList<ItemOrder>();
		//discount = false;
	}
	public void add (ItemOrder itemOrder) {
		for (int x = 0; x < itemOrders.size(); x++){
			if (itemOrders.get(x).getItem() == itemOrder.getItem()){
				itemOrders.remove(x);
			}
		}
		itemOrders.add(itemOrder);
	}
	public void setDiscount(boolean discount){
		this.discount = discount;
	}
	public double getTotal(){
		total = 0;
		for (int x = 0; x < itemOrders.size(); x++){
			total += itemOrders.get(x).getPrice();
		}
		if (discount == true){
			return total * .9;
		}
		else {
			return total;
		}
	}
	/*I just use this temporary method to check the size of
	the ArrayList for my test in "ShoppingTest", This is not 
	apart of the class.*/
	/*public int size (){
		return itemOrders.size();
	}*/
}