package objectivePrac;

public class User {

	private String uID;
	private String uName;
	private String uAddress;
	private String uNumber;


	
	public User(String id, String name, String address, String number) {
		uID = id;
		uName = name;
		uAddress = address;
		uNumber = number;
	}
	
	String getUserName() {
		return uName;
	}
	
	
	
	void printUserInfo() {
		System.out.println("아이디 :" +uID+"\n이름 :"+uName+"\n주소 :"+uAddress+"\n전화번호 :"+uNumber);
	}
}
