package sec06.ch05;

public class MethodMisson12 {

	public static void main(String[] args) {
		int[] arr = { 4, 8, 10, 11, 45 };

//		System.out.println(Arrays.toString(arr));
		String result = toString(arr);
		System.out.println(result);
	}

//	public static String toString(int[] arr) {
//		String str = "";
//		for (int i = 0; i < arr.length-1; i++) {
//			str += arr[i] + ", ";
//		}
//		return "["+str+arr[arr.length-1]+"]";
//	}
	
	public static String toString(int[] arr) {
		String str = Integer.toString(arr[0]);
		for (int i = 0; i < arr.length; i++) {
				str += ", "+arr[i];
		}
		return String.format("[%s]", str);
	}
}
