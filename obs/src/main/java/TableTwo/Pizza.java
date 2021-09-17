package TableTwo;

import tableOne.FoodTime;

public class Pizza extends FoodTime{
	String menuItem = "Pizza";
	String typeAnnotation = "Food";
	
	public Pizza(String retention, String menuItem, String typeAnnotation) {
		super(retention);
		this.menuItem = menuItem;
		this.typeAnnotation = typeAnnotation;
	}
	
	public static void pizzaPrice() {
		setAnnotation("Pizza");
		
		FoodTime.price();
	}
	
	public static void pizzaTime() {
		setAnnotation("Pizza");
		
		FoodTime.takes();
	}

	public String getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}

	public String getTypeAnnotation() {
		return typeAnnotation;
	}

	public void setTypeAnnotation(String typeAnnotation) {
		this.typeAnnotation = typeAnnotation;
	}
	
}
	
	
