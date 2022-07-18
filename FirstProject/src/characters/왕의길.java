package characters;

public class 왕의길 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//왕의 길 맵에 영웅(객체) 생성(객체 실체화, 객체의 인스턴스화)
		영웅 player1 = new 영웅("A팀","라인하르트","라이언");
		영웅 player2 = new 영웅("A팀","자리야","남극");
		영웅 player3 = new 영웅("A팀","솔져","불꽃남자");
		영웅 player4 = new 영웅("A팀","위도우메이커");
		영웅 player5 = new 영웅("A팀","아나","피서");
		영웅 player6 = new 영웅("A팀","루시우","황금개구리");
		System.out.println("=====================================================");
		
		//라인하르트 x로 2만큼 y로 5만큼 이동 => (0,0) -> (2,5)
		player1.moveCharacter(2, 5);
		
		System.out.println();
		
		//솔져 E 스킬 사용(메소드)
		player3.useSkill("E");
		
		System.out.println();
		
		//자리야 Q 스킬 사용(메소드)
		player2.useSkill("Q");
		
		System.out.println();
		
		//현재 솔져위치 출력 => 설정 안 해줬기때문에 기본값(0,0)
		player3.printLocation();
		
		System.out.println();
		
		//라인하르트 x로 3만큼 y로 0만큼 이동 => (2,5) + (3,0)
		player1.moveCharacter(3,0);
		
		System.out.println();
		
		//라인하르트 현재 위치 출력 (5,5)
		player1.printLocation();
	
		
	}

}
