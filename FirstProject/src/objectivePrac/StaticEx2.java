package objectivePrac;

public class StaticEx2 { // static�� new ���ص� �� �� �ִ�. ��� �ν��Ͻ��� ���Ծ��� �����ϹǷ�.
	public static void main(String[] args) {
		
		Static s = new Static();
		Static s2 = new Static();
		// ������ �ʴ� ���� ���� ������ �޼��带 �ַ� ����ó�� �Ͽ� ����Ѵ�.
		System.out.println(s.i);
		System.out.println(++s2.i);
		System.out.println(s.i);
		// ����(static) ����, Ŭ����, �޼ҵ� new ���� ��밡��
		
	}
}