package sec06.ch05;

public class MethodExam {

	public static void main(String[] args) {
	//소활호()있으면 메소드	// void 자리 : 리턴타입
					  // main 자리 : 매개변수
		 int aaa = 10;
		 int result = sum(aaa,40);
		 System.out.println("sum + result : " + result);
		 
		 result = minus(20,10);
		 System.out.println("minus - result : " + result);
	}
							// 소괄호() 안 : 선언부 
							// 대활도{} 안 : 구현구
				// int 자라 : return 하는 값의 타입
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}
}
