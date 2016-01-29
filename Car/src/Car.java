/*
 * Main class of the java program
 */
public class Car {
	
	/**
	 * Car brand name -testing for git undo
	 */
	String name;
	
	/*
	 * color
	 */
	String color;
	
	/*
	 * Availability in the market
	 */
	boolean available;
	
	/**
	 * Created a new car
	 * @param n name
	 * @param c color
	 * @param a availability
	 */
	
	public Car(String n, String c, boolean a){
		name = n;
		color = c;
		available = a;
	}
	
	public void CarInfo (){
		String state = "";
		if (available) {
			state = "yes";
		}
		else {
			state = "no";
		}
		System.out.println("The car is "+name+", color is "+color+" and availability in market is : "+state);
	}
	public static void main(String[] args) {
		Car c = new Car("BMW","Black",true);
		c.CarInfo();

	}

}
