// ex) naver.com   --> com.naver.프로젝트명.클래스명 (소문자로만) (클래스는 대문자시작)
package sec06.ch06;

public class InstanceExam {
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();   // 주소값 다름
		d1.name = "뽀삐";
		d2.name = "돌쇠";
	 //Type //변수명 //객체화시켜주는 키워드     * new가 Dog를 객체화하고 주소값(메모리)을 dog에 준다.
	 // 대문자로 시작하는건 레퍼런스변수(주소값) ex) 위의 Dog  
	 // 주소값(d1)접근(.) dd2.
		d1.bark();
		d2.bark();
	}
}

// 멤버필드   : 값을 저장할 수 있는 것 (명사 담당) 
// 멤버메소드 : 값을 수정할 수 있는 것 (동사 담당)
class Dog { // 멤버 필드
	String name; // 멤버 변수
	int age;
	
	void bark() {
		System.out.printf("%s가 멍멍\n",name);
	}
}
