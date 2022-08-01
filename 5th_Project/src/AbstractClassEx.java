abstract class Animal{
	public void moving() {
		System.out.println("움직인다");
	}
	public abstract void sound(); // 추상메서드
	
}



public class AbstractClassEx {
	
	public static void main(String[] args) {
		
	
	
	Animal ani = new Animal() { //추상 클래스는 생성 시, 상속 시 반드시 빈 메서드를 구현해야함 -> {}
		
		@Override
		public void sound() {
			// TODO Auto-generated method stub
		System.out.println("멍");	
		}
	};
	ani.moving();
	ani.sound();
	
	}
}

// 추상클래스 - 일반클래스에 추상 메서드를 포함하고 있는 것
// 일반클래스 - 완성되지 않은 메서드를 1개라도  포함하고 있는 것
// 완성되지 않은클래스는 body ({}) 가 없는 것 ex) void plus();
// 공통적인 특성을 추출해서 메서드를 뽑아놓은 것
// 사용할 때 반드시 오버라이딩 
// 이 클래스를 상속받으려면 반드시 완성해서 사용할 수 있도록 강제함