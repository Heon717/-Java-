package sec06.ch05;

public class MethodMisson6 {
	public static void main(String[] args) {
		int rNum = getRandomNum(); // 0 ~ 9
//		System.out.println("rNum : " + rNum);
		
		int aa = 20;
		rNum = getRandomNum(aa); // 0 ~19
		rNum = getRandomNum(5); // 0 ~ 4

		
		rNum = getRandomNum(5,10); // 5~10
		System.out.println("rNum : " + rNum);
		rNum = getRandomNum(10,20); // 10~20
		System.out.println("rNum : " + rNum);
	}
	
	public static int getRandomNum(int n1, int n2) {
		return (int)(Math.random()*(n2-n1+1)+n1);
	}
	
	public static int getRandomNum(int max) {
		return (int)(Math.random()*max);
	}
	
	public static int getRandomNum() {
		return (int)(Math.random()*10);	
	}
}
