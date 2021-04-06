package sec06.ch06;

public class InstanceExam5 {

	public static void main(String[] args) {
		Car[] carArr = new Car[5];	// 각 방에 null 이 들어있다. (레퍼런스로 시작하면 ( 대문자시작))
									// 대문자ex)String.. 주소값   소문자ex) int, double.. 리터럴값
		
		carArr[0] = new Car();
		
		carArr[0].name="그랜저";

	}

}

