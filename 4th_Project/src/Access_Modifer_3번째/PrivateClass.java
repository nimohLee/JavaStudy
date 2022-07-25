package Access_Modifer_3번째;

class PrivateClass {
	private PrivateClass() { // 생성자가 private
		
	}
	
	public static void main(String[] args) {
		PrivateClass p = new PrivateClass(); // Private 이므로 클래스 내부에서만 호출가능
	}
}

class hi{
	public static void main(String[] args) {
		PrivateClass p = new PrivateClass(); // 동일한 클래스가 아니므로 private에 접근할 수 없음
	}
}