package sec06.ch06;

public class InstanceExam3 {

	public static void main(String[] args) {  // 프로그램 시작점
		int mainNum = 10; 	  
		
		Box box1 = new Box(); // 레퍼런스타입 (주소값)
		box1.num = 10;
		
		changeNum(mainNum);  // (리터럴값) 
		System.out.println("mainNum : " + mainNum);
		
		changeBoxNum(box1);	 // (주소값)
		System.out.println("box.num : " + box1.num);
		
	}
	
	public static void changeNum(int num) {  // 10이라는 값을 복사하여 줌 ** mainNum과 num은 다른 변수임
		num = 20;
	}
	
	public static void changeBoxNum(Box box2) { // 위은 box1 과 여기의 box2 는 다른 변수임 ,복사해서 같은주소값을가짐
		box2 = new Box();
		box2.num = 20;	   
	}
	
}

class Box{
	int num;
}