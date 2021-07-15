package exercise;

abstract class Shape {
	Point p;
	Shape() {
	this(new Point(0,0));
	}
	Shape(Point p) {
	this.p = p;
	}
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	Point getPosition() {
	return p;
	}
	void setPosition(Point p) {
	this.p = p;
	}
}

class Point {
	int x;
	int y;
	Point() {
	this(0,0);
	}
	Point(int x, int y) {
	this.x=x;
	this.y=y;
	}
	public String toString() {
	return "["+x+","+y+"]";
		}
}

class Circle extends Shape{
	Circle(Point p, double r){
		super(p);
		this.r = r;
	}
	Circle(double r){
		this(new Point(0,0),r);
	}
	double r;
	double calcArea(){
		return r*r*3.14;
	}
}

class Rectangle extends Shape{
	Rectangle(double width, double height){
		this(new Point(0,0),width, height);
	}
	Rectangle(Point p,double width, double height){
		super(p);
		this.width = width;
		this.height = height;
	}
	
	double width;
	double height;
	double calcArea(){
		return width*height;
	}
	public boolean isSquare(){
		if(width==height)
			return true;
		else
			return false;
	}
}

public class Exercise7_22 {

	public static double sumArea(Shape arr[]){
		double sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i].calcArea();
		}
		return sum;
	}
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println(" :"+sumArea(arr));

	}

}
