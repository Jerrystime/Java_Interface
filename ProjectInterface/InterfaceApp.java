
public class InterfaceApp {

	public static void main(String[] args) {
		// 더하기 기능이 있는 클래스를 외주에 맡겼다고 가정
//		DummyCal c = new DummyCal();
		realCal c = new realCal();	// 외주업체로부터 납품 받은 클래스가 인터페이스를 통해 구현이 되었다면 원하는 규격으로 구현 됐을 거라는 확실성이 있기 때문에 가짜 클래스에서 바로 바꿔서 사용이 가능하다.
		System.out.println(c.sum(2, 1));
	}

}

interface Calculable {	// 인터페이스를 통해 자바의 기능을 통해서 클래스의 규격을 엄격하게 준수할 수 있도록 유도
	int sum(int v1, int v2);	// int형의 매개 변수 두 개를 받고, 출력 또한 int형인 sum이라는 이름의 메소드가 존재해야한다고 강제
}

class DummyCal implements Calculable {	// 외주 맡긴 클래스를 납품 받으면 접목시킬 생각을 하고 임의의 가짜 클래스를 만들어서 사용
	public int sum(int v1, int v2) {
		return 3;
	}
}

class realCal implements Calculable {	// Calculable 인터페이스를 구현하는 realCal 클래스
	public int sum(int v1, int v2) {
		return v1 + v2;	// 정해진 규격에 따른 메소드를 생성하면 되고, 구동 방법만 추가해주면 된다.
	}
	
}