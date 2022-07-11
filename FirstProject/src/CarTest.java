
public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car(); // bc. 같은폴더(package)
		c1.wheelCount=4;
		c1.color="red";
		c1.name="머스탱";
		
		
		Car c2 = new Car();
		c2.wheelCount = 8;
		c2.color = "국방색";
		c2.name = "육공트럭";
		
		// 자바에서 우리가 작성한 클래스는 생성을 여러개 할 수 있는 일종의 틀이다.
		// new를 통해서 우리는 클래스를 사용할 수 있는 상태로 만든다.
		
		
		Car[] cars = new Car[3]; // 배열은 공간할당을 하기위해서 new를 사용한다. new는 무조건 메모리와 관련
		// 문제 차량 3개를 생성, 값을 넣고 출력
		
		for(int i=0;i<cars.length;i++)
			cars[i]=new Car();
		
		
		cars[0].wheelCount = 2;
		cars[0].color="blue";
		cars[0].name ="오토바이";
		
		cars[1].wheelCount = 4;
		cars[1].color="black";
		cars[1].name ="제네시스";
		
		cars[2].wheelCount = 4;
		cars[2].color="silver";
		cars[2].name ="소나타";
		
		
		Car cs1; // int에는 숫자 float에는 실수 String은 문자열 Car에는 Car; new+생성자 => 생성자는 클래스명();
		Car cs2; // 메서드 소속 변수는 반드시 초기화 해줘야 한다.
		Car cs3;
		
//		System.out.println(cs2); new를 해줘야만 주소값을 가질 수 있다.
		
		
		cs1 = new Car(); //1. 메모리에 올리기
		cs1.name ="제네시스"; // 2. 메모리에 올라가 있는 Car에 이름 cs1이고 그 안에 있는 변수 name에다가 "제네시스"를 넣음
							//기본타입이 아니면 초기화할 수 있는 값은 Null 밖에 없음
		
		
		for(int i=0; i<cars.length;i++) {
			System.out.println(cars[i].name+"의 바퀴 개수는 " + cars[i].wheelCount+"개이고 색상은 "+cars[i].color+"입니다.");
		}
		
		for (Car a1 : cars) {
			System.out.println(a1.name+"의 바퀴개수는 "+a1.wheelCount + "개이고 색상은"+a1.color+"이다");
		}
		
		
	}
}
