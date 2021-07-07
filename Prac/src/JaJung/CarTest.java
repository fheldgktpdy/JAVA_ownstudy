package JaJung;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",3);
	}
	Car(Car c){
		this(c.color,c.gearType,c.door);
	}
	Car(String color){
		this(color,"auto",4);
	}
	Car(String a, String b, int c){
		color = a;
		gearType = b;
		door = c;
	}
}


public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("white","auto",4);
		System.out.println("c1ÀÇ color = " + c1.color);

	}

}
