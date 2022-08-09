
public class InterfaceApp {

	public static void main(String[] args) {
//		Calculable c = new RealCal();	// 인스턴스는 상속 받은 부모 클래스나, 구현한 인터페이스로 데이터 타입을 가질 수 있다.
		Calculable c = new AdvancedCalcular();	// 다른 Calculable 인터페이스를 구현한 클래스로 바꾸어주어도 이상이 없을 거라는 확실성을 갖게 된다. 즉, 호환성을 보장할 수 있다.
		System.out.println(c.sum(2, 1));
//		c.print();	// RealCal의 인터페이스인 Calculable을 데이터 타입으로 갖고 있기 때문에 Calculable 인터페이스에 없는 print() 메소드를 사용할 수 없다.
		System.out.println(c.PI);
	}
	// 인스턴스의 데이터 타입을 바꿈으로써 자신이 필요한 기능을 제외한 기능들을 비활성화(?) 시킬 수 있다. 그래서 자신이 필요한 기능의 사용법만 익혀서 사용할 수 있다.
}

interface Calculable {
	double PI = 3.14;
	int sum(int v1, int v2);
}

interface Printable {
	void print();
}

class RealCal implements Calculable, Printable {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	public void print() {
		System.out.println("This is RealCal!!");
	}
	
}

class AdvancedCalcular implements Calculable {	// 다른 Calculable 인터페이스를 구현한 클래스 생성
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	
}