package System.out;

class MyPoint {
	int x;
	int y;
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	double getDistance(int a, int b){
		return Math.sqrt((a-x)*(a-x) + (b-y)*(b-y));
	}
}

public class Exercise6_7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2,2));
	}
}
