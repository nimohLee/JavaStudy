abstract class Animal{
	public void moving() {
		System.out.println("�����δ�");
	}
	public abstract void sound(); // �߻�޼���
	
}



public class AbstractClassEx {
	
	public static void main(String[] args) {
		
	
	
	Animal ani = new Animal() { //�߻� Ŭ������ ���� ��, ��� �� �ݵ�� �� �޼��带 �����ؾ��� -> {}
		
		@Override
		public void sound() {
			// TODO Auto-generated method stub
		System.out.println("��");	
		}
	};
	ani.moving();
	ani.sound();
	
	}
}

// �߻�Ŭ���� - �Ϲ�Ŭ������ �߻� �޼��带 �����ϰ� �ִ� ��
// �Ϲ�Ŭ���� - �ϼ����� ���� �޼��带 1����  �����ϰ� �ִ� ��
// �ϼ����� ����Ŭ������ body ({}) �� ���� �� ex) void plus();
// �������� Ư���� �����ؼ� �޼��带 �̾Ƴ��� ��
// ����� �� �ݵ�� �������̵� 
// �� Ŭ������ ��ӹ������� �ݵ�� �ϼ��ؼ� ����� �� �ֵ��� ������