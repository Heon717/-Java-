package sec06.ch05;

public class MethodMission {

	public static void main(String[] args) {
		whoIsBig(10, 30); // 콘솔 > 30이(가) 가장 큽니다.
							// ex) int a = whoIsBig (10,30); 비 보이드
							// ex) whoIsBig (10,30); 보이드 (혼자)

		System.out.println();
		whoIsBig(10, 9); // 콘솔 > 10이(가) 가장 큽니다.

		System.out.println();
		whoIsBig(11, 25); // 콘솔 > 25이(가) 가장 큽니다.

	}

	public static void whoIsBig(int n1, int n2) {
		int big = n2;
		if (n1 > n2) {
			big = n1;
		}
		System.out.printf("%d이(가) 가장 큽니다.", big);
	}
}
