package sec06.ch07;

public class PolyMisssion {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Bus();
		Car car3 = new LocalBus();
		Car car4 = new Truck();

		// Bus, LocalBus 객체 였다면 openDoor 메소드 호출
		// 그 외는 hoot 메소드 호출
		blowKlaxon(car1);
		blowKlaxon(car2);
		blowKlaxon(car3);
		blowKlaxon(car4);
		
	}
	public static void blowKlaxon(Car a) {
		if(a instanceof Bus || a instanceof LocalBus) {
			((Bus)a).openDoor();
		} else {
			a.hoot();
		}
	}
}
