
public class SmartPhone extends Phone{
	public SmartPhone(String owner) {
		super(owner); //부모(super) 생성자 호출 필수
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
