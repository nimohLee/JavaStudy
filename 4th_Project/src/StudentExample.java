class People {
	public String name;
	public String ssn; // �ֹε�Ϲ�ȣ

	public People(String name, String ssn) { // People�� ������
		this.name = name;
		this.ssn = ssn;
	}

}

class Student extends People { // People Ŭ������ ��ӹ��� Student Ŭ����
	int studentNo;

	public Student(String sName, String sSsn, int StudentNo) { // Student ������. �Ű������� sName, sSsn, StudentNo

//		new People(sName, sSsn); �̰��� ��ӹ��� People�� �ƴ� �׳� People Ŭ������ ��ü�� �����ϴ� ��
		super(sName, sSsn); // ��ӹ��� �θ��� ������ ȣ���ϴ� ��. super(�Ű�����);
							// ���� �θ�Ŭ����(���⼱ People)�� �����ڿ� �ʿ��� �Ű����������ٸ� ��������
							// ��, ���� ���ÿ��� public People(){} �̶�� �����ڰ� �ְų� �����ڰ� �ϳ��� ���ٸ� super�� ���ص� ��.(�ڵ� ������)
		this.studentNo = studentNo;
	}

}

public class StudentExample {
	public static void main(String[] args) {

	Student student = new Student("��ȣ��", "960822-1000000",1); // Student ��ü ���� (�ν��Ͻ�ȭ)
	
	System.out.println("name : " + student.name);
	System.out.println("ssn : " + student.ssn);
	System.out.println("studentNo : " + student.studentNo);
	
	}
}
