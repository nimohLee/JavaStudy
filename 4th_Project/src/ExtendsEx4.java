class Ext4{
	public Ext4() {
		System.out.println("Ext4�� ������ ����");
	}
}


public class ExtendsEx4 extends Ext4{
	public ExtendsEx4() {
		System.out.println("ExtendsEx4�� ������ ����");
	}
	
	public static void main(String[] args) {
		ExtendsEx4 ee4 = new ExtendsEx4(); // �����ϸ� 'Ext4�� ������'�� ���� ��µ�.
									      // Ext4�� ������ �� ���� �ڵ�� �������� ������ ��ӹ����� �ٷ� super();�� �ڵ����� ������
										 // super�� �׻� ���� ����!
										// �� ��� Ext4 Ŭ������ �����ڰ� �Ű������� ���� �����ڸ� �ְų�, �����ڸ� �ƿ� �� ������� ���� ���ѵ� 
	}
}