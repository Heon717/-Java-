package sec06.ch05;

import java.util.Scanner;

public class MethodMisson10 {
	// 남자 평균키 : 175 ,  여자 평균키 : 163
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		
		do {
			System.out.print("성별 : ");
			String gender = scan.next(); // 남, 여
			
			System.out.print("키 : ");
			int height = scan.nextInt();
			
			String result = chk2(gender, height);
			System.out.println(result);
			// 성별 : 남,  키: 170cm,  평균 미만
			// 성별 : 여,  키: 163cm,  평균
			
			System.out.println();
			System.out.println("게속 하시겠습니까 ? (y, n)");
			answer =  scan.next();
		} while(!answer.equals("y"));
		System.out.print("끝");
		scan.close();
	}
	
	public static String chk(String gender,int height) {
		String mid = "평균 이하";
		if (gender.equals("여")) {
			if (height > 163) {
				mid = "평균 이상";
			} else if (height == 163) {
				mid = "평균";
			}
		}
		if (gender.equals("남")) {
			if (height > 175) {
				mid = "평균 이상";
			} else if (height == 175) {
				mid = "평균";
			}
		}
		return "\n성별 :"+gender+ "  키 : "+height+"cm  "+mid;
	}
	
	public static String chk2(String gender,int height) {
		int stand = 163;
		String result = "평균";
		
		switch(gender) {
		case "여": case "여자":
			stand = 163;
			break;
		case "남": case "남자":
			stand = 175;
			break;
		default :
			return "성별을 잘 못 입력하셨습니다.";
		}
		
		if (height > stand) {
			result ="평균 초과";
		} else if(height < stand) {
			result ="평균 미만";
		}
		
		return String.format("성별 : %s, 키: %dcm, %s",gender,height,result);
//		return "\n성별 :"+gender+ ",  키 : "+height+"cm,  "+result;
	}

}
