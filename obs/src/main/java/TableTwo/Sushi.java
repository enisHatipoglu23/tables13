package TableTwo;

import tableOne.FoodTime;

public class Sushi extends FoodTime{

	static String menuItem = "Sushi";
	String typeAnnotation = "Food";
	
	
	public Sushi(String retention, String menuItem, String typeAnnotation) {
		super(retention);
		Sushi.menuItem = menuItem;
		this.typeAnnotation = typeAnnotation;
	}


	public static void sushiPrice() {
		setAnnotation("Sushi");
		
		FoodTime.price();
		
	}
	
	public static void sushiTime() {
		setAnnotation("Sushi");
		
		FoodTime.takes();
		
	}
	
	public String getMenuItem() {
		return menuItem;
	}


	public void setMenuItem(String menuItem) {
		Sushi.menuItem = menuItem;
	}


	public String getTypeAnnotation() {
		return typeAnnotation;
	}


	public void setTypeAnnotation(String typeAnnotation) {
		this.typeAnnotation = typeAnnotation;
	}
	
	
	
	

}
