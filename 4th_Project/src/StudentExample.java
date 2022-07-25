class People {
	public String name;
	public String ssn; // 주민등록번호

	public People(String name, String ssn) { // People의 생성자
		this.name = name;
		this.ssn = ssn;
	}

}

class Student extends People { // People 클래스를 상속받은 Student 클래스
	int studentNo;

	public Student(String sName, String sSsn, int StudentNo) { // Student 생성자. 매개변수는 sName, sSsn, StudentNo

//		new People(sName, sSsn); 이것은 상속받은 People이 아닌 그냥 People 클래스의 객체를 생성하는 것
		super(sName, sSsn); // 상속받은 부모의 생성자 호출하는 것. super(매개변수);
							// 만약 부모클래스(여기선 People)의 생성자에 필요한 매개변수가없다면 생략가능
							// 즉, 위의 예시에서 public People(){} 이라는 생성자가 있거나 생성자가 하나도 없다면 super도 안해도 됨.(자동 생성됨)
		this.studentNo = studentNo;
	}

}

public class StudentExample {
	public static void main(String[] args) {

	Student student = new Student("이호민", "960822-1000000",1); // Student 객체 생성 (인스턴스화)
	
	System.out.println("name : " + student.name);
	System.out.println("ssn : " + student.ssn);
	System.out.println("studentNo : " + student.studentNo);
	
	}
}
