package ExtendsExs_2��°;
// final class Ext5{	:  class �տ� final�� ������ ���ȭ�� �Ǿ� ���̻� ������ �Ұ����ϴ� = ����� �Ұ����ϴ�
class Ext5{
	public void printExt5() { // ��ȯ�� �տ� final�� ���������� ���� or �������̵� �Ұ��� ( why? final�� �� �״�� ������. �մ� ���� ����)
		System.out.println("�̰��� Ext5");
	}
}

public class ExtendsEx5 extends Ext5{ // Ext5�� ��ӹ��� ExtendsEx5
	
	@Override 				  // �������̵� �ϸ� �޼��� ���� @Override ���ָ� ����. �������̵��ϸ鼭 �߻��ϴ� ������ üũ�� �� ����(������� �������̵��Ϸ��� �޼���� �̸��ٸ�) 
	public void printExt5() { // ��ӹ��� �θ�(Ext5)�� �ִ� �޼���� ������ �̸�
							  // �̰��� �޼��� ������ �� �������̵�(overriding)�̶� ��
		System.out.println("�̰��� ExtendsEx5");//�������̵��ϸ� �� �� �켱�̹Ƿ� �ٲ� �޼��尡 �����
	}
	
	public void printSuper() {
		super.printExt5();
	}
	
	
	public static void main(String[] args) {
		// �������̵�� �޼����� ��� main���� ��밡�������� 
		// �θ� �޼���� �Ϲ����� ������� main �޼��忡�� ����� �Ұ�
		ExtendsEx5 ee5 = new ExtendsEx5();
		
		ee5.printExt5();
		ee5.printSuper();
	}
}

// ����ϸ� '�̰��� ExtendsEx5 '�� ��µ�
