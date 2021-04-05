package sec06.ch05;

public class MethodMission5 {

	public static void main(String[] args) {
		
		sumAllFromTo(5, 10); // sum : 45
		
		sumAllFromTo(2, 4); // sum : 9
		
		sumAllFromTo(1,100); // sum : 5050
		
		sumAllFromTo(100 ,1); // sum : 5050
		
		System.out.println();
		//System.out.println(5+6+7+8+9+10);
	}

	public static void sumAllFromTo(int a,int b) {
		int sum = 0;
		for (int i=a; i<=b; i++) {
			sum += i;
		}
		for (int i=a; i>=b; i--) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
}
