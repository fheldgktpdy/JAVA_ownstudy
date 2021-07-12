package JaJung;

public class Excercise6_2 {

	public static void main(String[] args) {
		Student s = new Student("ȫ�浿",1,1,100,69,98);
		System.out.println(s.info());

	}

}

class Student{
	String name;
	int ban, no, kor, eng, math;
	Student(String name,int ban,int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal(){
		return kor+eng+math;
	}
	float getAverage(){
		return getTotal()/3;
	}
	String info(){
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage();
	}
}
