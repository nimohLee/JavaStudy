package characters;

//class는 객체를 정의하는 틀 또는 설명서.
//왕의길(main)에서 생성하기 전까지 객체는 추상적인 상태(메모리에 올라가지 않고 만드는 방법만 있는 상태)
//객체는 속성(멤버 변수)과 기능(메소드)을 가지고 있음.
//생성자란 왕의길(main)에서 영웅(객체)를 처음 생성할 때 가지고 태어나게끔 하는 것.

public class 영웅 {

	//속성(필드): 멤버변수
		String team; // 팀 변수 ( 레드팀 or 블루팀 )
		String skin; // 스킨 변수 
		String name;  // 영웅 이름
		int x;//영웅 위치 x,y좌표
		int y;
		
		
		
		
		//생성자. (2개 이상 있으면 오버로드)
		public 영웅(String team, String name, String skin) {
			this.team = team;
			this.skin = skin;
			this.name = name;
			System.out.println(team+"에 '"+skin+"' 스킨을 착용한 '"+name+"'영웅이 생성되었습니다.");
		}
		
		public 영웅(String team, String name) { // 스킨 없을 때 생성자
			System.out.println(team+"에 '"+name+"'영웅이 생성되었습니다.");
			
		}
		
		
		
		//기능(메소드) : 멤버 메소드 ---- 여기부터 메소드
		
		public void moveCharacter(int i, int j) { 
			//움직이는 기능(메소드)
			x = x + i; //x좌표 i만큼 +
			y = y + j; //y좌료 j만큼 +
			System.out.println(name+"이(가) ("+i+","+j+") 좌표만큼 움직였습니다.");
		}
		
		public void printLocation() {
			System.out.println("현재 "+name+"의 위치는 좌표 ("+x+","+y+") 입니다.");
		}
		
		public void useSkill(String key) {
			//스킬사용
			if(key == "E") {
				System.out.println(name+"이(가) E 스킬을 사용하였습니다.");
			}
			else if(key == "Shift"){
				System.out.println(name+"이(가) SHIFT 스킬을 사용하였습니다.");
			}
			else if(key == "Q") {
				System.out.println(name+"이(가) Q 스킬을 사용하였습니다.");
			}
		}
		
}
