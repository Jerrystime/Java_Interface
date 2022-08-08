
public class InterfaceApp {

	public static void main(String[] args) {
		// 더하기 기능이 있는 클래스를 외주에 맡겼다고 가정
//		DummyCal c = new DummyCal();
		RealCal c = new RealCal();	// 외주업체로부터 납품 받은 클래스가 인터페이스를 통해 구현이 되었다면 원하는 규격으로 구현 됐을 거라는 확실성이 있기 때문에 가짜 클래스에서 바로 바꿔서 사용이 가능하다.
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
	}

}

interface Calculable {	// 인터페이스에는 메소드와 변수가 정의될 수 있는데, 변수에는 할당을 해주고, 메소드에는 실제 구현이 들어가지 않는다. 인터페이스를 구현하는 클래스는 인터페이스에 정의된 메소드 형태에 따라 실제 구현을 해야한다.
	double PI = 3.14; // 인터페이스에서도 변수를 정의할 땐, 내용을 적는다. 인터페이스를 구현하는 클래스에 변수는 따로 정의하지 않아도 된다.
	int sum(int v1, int v2);	// int형의 매개 변수 두 개를 받고, 출력 또한 int형인 sum이라는 이름의 메소드가 존재해야한다고 강제
}

interface Printable {	// 인터페이스 생성
	void print();	// 메소드 정의, 인터페이스에서 메소드를 정의할 때 내용은 들어가지 않는다.
}

class DummyCal implements Calculable {	// 외주 맡긴 클래스를 납품 받으면 접목시킬 생각을 하고 임의의 가짜 클래스를 만들어서 사용
	public int sum(int v1, int v2) {
		return 3;
	}
}

class RealCal implements Calculable, Printable {	// Calculable과 Printable 인터페이스를 구현하는 realCal 클래스
	public int sum(int v1, int v2) {
		return v1 + v2;	// 정해진 규격에 따른 메소드를 생성하면 되고, 구동 방법만 추가해주면 된다.
	}

	public void print() {	// Printable 인터페이스에 있는 메소드 정의
		System.out.println("This is RealCal!!");
	}
	
}

// 상속은 하나의 자식 클래스가 하나의 부모 클래스만 상속 받을 수 있지만, 인터페이스는 하나의 클래스가 여러 개의 인터페이스를 구현할 수 있다.