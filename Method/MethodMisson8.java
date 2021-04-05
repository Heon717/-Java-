package sec06.ch05;

public class MethodMisson8 {

	public static void main(String[] args) {
		int star =5;
//		printStarSqure(star);
		printStarTri(star);
		
	}
	
	public static void printStar(int star) {
		for(int i=0;i<star;i++) {
			System.out.print("*");
		}
	}
	
	public static void printStarSqure(int star) {
		for(int i=0;i<star;i++) {
			System.out.println();
			printStar(star);
		}
	}
	
	public static void printStarTri(int star) {
		for (int i=1; i<=star; i++)  {
			printStar(i);
			System.out.println();
		}
	}
}
