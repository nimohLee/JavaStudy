
public class VariableEx {	// 클래스
	int k=100; // 클래스 변수이다. 클래스 변수는 클래스의 소속{}이다. 이 변수는 이 클래스 내부에 모두가 사용가능
	String str = "헬로";
	public static void main(String[] args) { // 메서드

//			System.out.println(k);//사용가능. 다만 그냥 사용 불가 => 메모리에 올려서 사용해야 함
		
			int i=0; // 메서드에 포함된 변수. 메서드의 영역은 {} 사이. 이 변수는 이 메서드 내부에서만 사용가능하다.
			int j=0;
			System.out.println(i==j);
			
			String str1 = "안녕";
			
			String str2 = new String("안녕");// new = 새로 메모리에 만들어라
			
			System.out.println(str1 + ":" + str2);
			System.out.println(str1==str2);
			
			
			String str3 = str2;//str2의 값을 str3에 넣은 게 아닌 주소를 복사해줬기 때문에 true
			System.out.println(str2 ==str3);
	
			String str4 = "안녕";
			System.out.println(str1 == str4); // 같은 상수가 들어가면 같은 주소로 넣어줌(String만 적용됨)
			
			// == :: 스택비교		 .equals() :: 값 비교
			System.out.println(str1.equals(str2));// 레퍼런스 타입 비교
			//System.out.println(i.equals(j)); // 기본타입은 비교가 안됨
	}
	
}
