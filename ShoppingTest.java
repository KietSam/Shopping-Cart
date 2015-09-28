public class ShoppingTest {
	public static void main (String[]args){
		//|---TESTS FOR "ITEM" CLASS---|//
		
		//Negative Argument Exception Test, It works.
		//Item test = new Item ("String", -24);
		//Standard Input Test, It works.
		//Item test2 = new Item ("Pencils", 3);
		//Standard Input Test, It works.
		//Item test3 = new Item ("Pencils", 3, 4, 5);
		
		//Negative Argument Exception Tests.
		//Confirmed
		//Item test4 = new Item ("Pencils", -3, 4, 5);
		//Confirmed
		//Item test5 = new Item ("Pencils", 3, -4, 5);
		//Confirmed
		//Item test6 = new Item ("Pencils", 3, 4, -5);
		//Confirmed
		//Item test7 = new Item ("Pencils", -3, -4, 5);
		//Confirmed
		//Item test8 = new Item ("Pencils", 3, -4, -5);
		//Confirmed
		//Item test9 = new Item ("Pencils", -3, 4, -5);
		//Confirmed
		//Item test10 = new Item ("Pencils", -3, -4, -5);
		
		//"Price for" method tests
		//Item test3 = new Item ("Pencils", 3, 4, 5);
		//Returns 10
		//System.out.println(test3.priceFor(8));
		//Returns 13
		//System.out.println(test3.priceFor(9));
		//Illegal Argument; Can't be negative. Works
		//System.out.println(test3.priceFor(-3));
		//Returns 3
		//System.out.println(test3.priceFor(1));
		//Returns 6
		//System.out.println(test3.priceFor(2));
		
		//"To String" method tests
		//Prints: Pencils, $3.00 which is correct
		//Item test3 = new Item ("Pencils", 3);
		//System.out.println(test3);
		//Prints: Pencils, $3.00 which is correct
		//Item test3 = new Item ("Pencils", 3, 4, 5);
		//System.out.println(test3);
		
		
		//|---TESTS FOR "Catalog" CLASS---|//
		/*Made a new Catalog and added three items, when I 
		print the size it returns 3 items as the size. This works.*/
		/*Catalog list = new Catalog("Cleveland CS Gift Catalog");
      list.add(new Item("Game of Life circuit", 3.50, 10, 14.95));
      list.add(new Item("bottle o bubbles", 0.99));
      list.add(new Item("Nintendo Wii system", 199.99));
		System.out.println(list.size());*/
		/*This should return the "Game of Life circuit"
		which it does.*/
		//System.out.println(list.get(0));
		/*This should return "Cleveland CS Gift Catalog"
		which it does.*/
		//System.out.println(list.getName());
		
		//|---TESTS FOR "ItemOrder" CLASS---|//
		//Item test3 = new Item ("Pencils", 3, 4, 5);
		//ItemOrder test = new ItemOrder (test3, 10);
		/*The bulk price is 4 dollars so since there are 2
		fours that go into 10 the price will be 10 dollars for
		the first 8 plus the 6 dollars from the left overs. So this
		prints the correct price of 16.00 dollars for the price*/
		//System.out.println(test.getPrice());
		//This works
		//System.out.println(test.getItem());
		
		//|---TESTS FOR "ShoppingCart" CLASS---|//
		/*For this test I made a shopping cart and 2 items:
		pencils and boxes. I then added the 2 items by using
		ItemOrder. Since there should only be either one order of
		pencils or one order of boxes the size should always be 2 no 
		matter how many ItemOrders I add, which it is.*/
		/*ShoppingCart toDo = new ShoppingCart();
		Item pencils = new Item ("Pencils", 3, 4, 5);
		Item boxes = new Item ("Box", 7, 4, 5);
		toDo.add(new ItemOrder(pencils, 70));
		toDo.add(new ItemOrder(boxes, 702));
		toDo.add(new ItemOrder(pencils, 70));
		toDo.add(new ItemOrder(boxes, 703));*/
		/*The size method is my way of testing the replacements
		I left it commentted out in the ShoppingCart class so that
		you could see it, but it's not incorporated into the class.*/
		//System.out.println(toDo.size());
		//Now I'm testing the getTotal() method
		ShoppingCart toDo = new ShoppingCart();
		Item pencils = new Item ("Pencils", 3, 4, 5);
		Item boxes = new Item ("Box", 7, 4, 5);
		toDo.add(new ItemOrder(pencils, 10)); //16 Dollars
		toDo.add(new ItemOrder(boxes, 10)); //10 + 14 = 24 Dollars
		//Total is 40 Dollars
		System.out.println(toDo.getTotal());
	}
}