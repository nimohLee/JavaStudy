package objectivePrac;


class Static{
	static int i; // static ���� - �� ���� �ν��Ͻ��� �����ϰ� ������ 1���� �������
	int j; // �� Ŭ������ ������ ��� �ν��Ͻ��� static ���� �����Ѵ�.
			// static�� new ���� �ʾƵ� ��밡���ϴ�. ����� ���ÿ� �޸𸮿� �ö�
}



public class StaticEx {
	public static void main(String[] args) {
		Static s1 = new Static();
		s1.i++;// 1����
		s1.j++;// 1����
		System.out.println(s1.i+":"+s1.j);
		
		Static s2 = new Static();
		s2.i++;// 1����
		s2.j++;// 1����
		System.out.println(s2.i+":"+s2.j);
	}
}

