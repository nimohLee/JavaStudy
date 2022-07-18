package characters;

//class는 객체를 정의하는 틀 또는 설명서.
//협곡(main)에서 생성하기 전까지 객체는 추상적인 상태(메모리에 올라가지 않고 만드는 방법만 있는 상태)
//객체는 속성(멤버 변수)과 기능(메소드)을 가지고 있음.
//생성자란 협곡(main)에서 캐릭터(객체)를 처음 생성할 때 가지고 태어나게끔 하는 것.

public class 그레이브즈 {

	//속성(필드): 멤버변수
		String team; // 팀 변수 ( 레드팀 or 블루팀 )
		String skin; // 스킨 변수 
		String roon;  // 룬
		String spell; // 스펠
		String position; // 포지션
		int attackPower; // 공격력
		int magicPower; // 주문력
		int attackSpeed; // 공격속도
		int attackRange; // 사거리
		int hp; // 체력 
		int mp; // 마나
		String[] Skill = new String[4]; // 스킬은 4개이므로 4칸 배열
		
		
		
		
		//생성자. (2개 이상 있으면 오버로드)
		public 그레이브즈(String team,String position,String skin, String roon, String spell) { // 스킨 있을 때 생성자
			this.team = team;
			this.position = position;
			this.skin = skin;
			this.roon = roon;
			this.spell = spell;
			System.out.println(this.team+"팀 "+this.position+" 그레이브즈(객체)가 생성되었습니다 ( 생성자에서 println )");
		}
		
		public 그레이브즈(String team, String position, String roon, String spell) { // 스킨 없을 때 생성자
			this.team = team;
			this.position = position;
			this.roon = roon;
			this.spell = spell;
			System.out.println(this.team+"팀 "+this.position+" 그레이브즈(객체)가 생성되었습니다 ( 생성자에서 println )");
		}
		
		//기능(메소드) : 멤버 메소드 ---- 여기부터 메소드
		
		public void moveCharacter() {
			//움직이는 기능(메소드)
		}
		
		public void useSkill() {
			//스킬사용
		}
		
		public void levelUp() {
			//레벨업할 때 능력치 상승
			this.attackPower++;
			this.attackSpeed++;
			this.magicPower++;
			this.attackRange++;
			this.hp++;
			this.mp++;
			
		}
}
