package exercise;

public class Exercise6_23 {

	public static int max(int[] arr){
		if(arr==null || arr.length==0)
			return -9999;
		else{
			for(int i=0; i<arr.length-1; i++){
				for(int j=i+1; j<arr.length; j++){
					if(arr[i]>arr[j]){
						int tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp;
						break;
					}
				}
			}
		return arr[arr.length-1];
		}
		
	}
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data)); 
		System.out.println("최대값:"+max(null)); 
		System.out.println("최대값:"+max(new int[]{})); // 0 최대값 크기가 인 배열

	}

}
