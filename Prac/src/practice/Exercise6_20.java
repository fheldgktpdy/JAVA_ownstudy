package practice;

public class Exercise6_20 {
	public static int [] shuffle(int[] a){
		for(int i=0; i<a.length; i++){
			int j = (int)Math.random()*a.length;
			
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}
		return a;
	}

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));


	}

}
