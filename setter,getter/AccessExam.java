package sec06.ch06;

public class AccessExam {

	public static void main(String[] args) {
		Access acc = new Access();
		acc.printNum();

	}

}

class Access {
	private int num;  // private 은 같은 클래스 내에서만 사용가능
	
	void printNum() {
		System.out.println("num : "+num);
	}
}