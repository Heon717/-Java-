package sec06.ch05;

public class MethodMission4 {

	public static void main(String[] args) {

		System.out.println("절대값 : " + abs(10)); // 10
		System.out.println("절대값 : " + abs(-10)); // 10
		System.out.println("절대값 : " + abs(7)); // 7
		System.out.println("절대값 : " + abs(-7)); // 7
	}

	public static int abs(int a) {
		if (a < 0) {
			return -a;
		}
		return a;
	}

}
