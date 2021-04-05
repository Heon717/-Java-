package sec06.ch05;

public class MethodMission3 {

	public static void main(String[] args) {
		int n1 = 10, n2 = 3;
		
		double result = divide(n1,n2); 
		System.out.println("result : " + result); // 3.333333
		
		n2 = 5;
		result = divide(n1,n2);
		System.out.println("result : " + result); // 2.0
	}

	public static double divide(int a, int b) {
		return (double)a/b;
	}
}
