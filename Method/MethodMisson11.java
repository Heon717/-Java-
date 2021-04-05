package sec06.ch05;

public class MethodMisson11 {

	public static void main(String[] args) {
//		gugudan(8);
		// 8 * 1 = 8
		// 8 * 2 = 16
		
		gugudan(4, 8); // 단 바뀔 때 ----, 개행 구분자 사용

	}

	public static void gugudan(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",num,i,(num*i));
		}
	}
	
	public static void gugudan(int num1, int num2) {
		for (int i=num1; i<=num2; i++) {
			gugudan(i);
			System.out.println("-----------");
		}

	}

}
