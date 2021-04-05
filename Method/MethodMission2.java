package sec06.ch05;

public class MethodMission2 {

	public static void main(String[] args) {
		
		int big = getBigNum(10,30);
		System.out.println("big : " + big); // big : 30
		
		big = getBigNum(10, 9);
		System.out.println("big : " + big); // big : 10

	}

	public static int getBigNum(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		}
		return n2;
	}
}