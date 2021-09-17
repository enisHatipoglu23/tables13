package tableOne;

public class FoodTime {
	
	static String annotation;
	 String retention = "RUNTIME";
	 static String[] target = {"Prepare", "Cook", "Send"};
	
	public FoodTime(String retention) {
		super();
		this.retention = retention;
	}
	public static double price() {
		if (annotation == "Kebab") {
			System.out.println(annotation + " price = 12.5");
			
		}else if(annotation == "Pizza") {
			System.out.println(annotation + " price = 22.5");
		}else if (annotation == "Sushi") {
			System.out.println(annotation + " price = 30");
		}  
	return 1;
}
	
	public static int takes() {
			if(annotation == "Pizza") {
				for (int i = 0; i < target.length; i++) {
					if (i==0) {
					System.out.println(annotation + " Prepare Takes = 10");
				}else if (i==1) {
					System.out.println(annotation + " Cook Takes = 20");
				}else if (i==2) {
					System.out.println(annotation + " Send Takes = 15");
				}
				}
	
			}
			if(annotation == "Kebab") {
				
				for (int i = 0; i < target.length; i++) {
					if (i==0) {
					System.out.println(annotation + " Prepare Takes = 10");
				}else if (i==1) {
					System.out.println(annotation + " Cook Takes = 20");
				}else if (i==2) {
					System.out.println(annotation + " Send Takes = 15");
				}
				}
				
				
			
			if(annotation == "Sushi") {
				
				for (int i = 0; i < target.length; i++) {
					if (i==0) {
					System.out.println(annotation + " Prepare Takes = 10");
				}else if (i==1) {
					System.out.println(annotation + " Cook Takes = -");
				}else if (i==2) {
					System.out.println(annotation + " Send Takes = 15");
				}
				}
				
			
		
			}
			}
			return 1;
	}

	
	
	public static String getAnnotation() {
		return annotation;
	}


	public static void setAnnotation(String annotation) {
		FoodTime.annotation = annotation;
	}


	public String getRetention() {
		return retention;
	}


	public void setRetention(String retention) {
		this.retention = retention;
	}


	public String[] getTarget() {
		return target;
	}


	public static void setTarget(String[] string) {
		FoodTime.target = string;
	}


	
}
