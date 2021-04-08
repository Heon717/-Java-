package sec06.ch06;

public class InheriExam {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.howling();
	}

}

class Animal extends Object{
	String name;
	int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void howling() {
		System.out.println("운다");
	}
}

class Cat extends Animal{
	
	public Cat() {
		super("",0);
	}

	void lick() {
		System.out.printf("%s가 핥다\n",name);
	}
					// 오버로딩은 똑같은 메소드를 여러개 만들때 사용   // 오버 라이딩은 메소드 덮어쓰기
	@Override        // 적어야 실수를 안한다 ex) 메소드 오타나면 빨간줄이 뜸
	void howling() {
		System.out.println("야옹");
	}
}

class koShort extends Cat {
	
	void pee() {
		System.out.printf("%s가 소변은 보다\n",name);
	}
}
