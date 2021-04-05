package sec06.ch05;

public class MethodMisson9 {

	public static void main(String[] args) {
		int score = getRandomScore(50, 100); // 50~ 100 랜덤숫자
		
		char grade = getGrade(score);
		char gradeSign = getGradeSign(score);
		char grade2 = getGrade2(score);
		
		System.out.printf("%d : %c%c\n", score,grade,gradeSign);
	}
	
	public static int getRandomScore(int scr1, int scr2) {
		int random = (int)(Math.random()*(scr2-scr1)+1)+scr1;
		return random;
	}
	public static  char getGrade2(int a) {
		switch(a/10) {
		case 10: case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		case 6: return 'D';
		}
		return 'E';
	}
	
	
	public static char getGrade(int a) {
		//90 A  80 B 70 C 60 D 나머지 E
		if( a < 60 ) {
			return 'E';
		} else if ( a < 70) {
			return 'D';
		} else if ( a < 80) {
			return 'C';
		} else if ( a < 90) {
			return 'B';
		} else {
			return 'A';
		}
	}
	
	public static char getGradeSign(int a) {
		// 8점 이상이거나 100점이면 '+'
		// 3 이하이면 '-'
		// 나머지 '' 빈칸
		int mod = a  % 10;
		if (mod >= 8 || mod == 100) {
			return '+';
		} else if (mod <= 3) {
			return '-';
		} else {
			return ' ';
		}
	}
}
