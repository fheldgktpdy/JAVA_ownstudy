package JaJung;

class Circle implements Cloneable{
	Point p;
	double r;
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	public Circle deepcopy(){
		Object obj = null;
		try{
			obj = super.clone();
		}catch(CloneNotSupportedException e){}
		
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x,this.p.y);
		return c;
	}
}

class Point implements Cloneable{
	int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "x=" + x + ", y=" + y;
	}
	public Point clone(){
		Object obj = null;
		try{
			obj = super.clone();
		}catch(CloneNotSupportedException e){}
		return (Point)obj;
	}
}

public class CloneEx1 {

	public static void main(String[] args) {
		Point original = new Point(3,3);
		Point copy = original.clone();
		System.out.println(copy);

	}

}
