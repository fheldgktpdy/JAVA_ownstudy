package practice;

public class Test {
	int a;
	
	public  void vartest(Test test){
		test.a++;
	}
	public static void main(String[] args) {
		Test mytest = new Test();
		mytest.a=1;
		mytest.vartest(mytest);
		System.out.println(mytest.a);

	}

}
