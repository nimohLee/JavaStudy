class Ext8Parents{
	int x;
	public void printExt8Parent() {
		System.out.println("�θ� Ŭ����");
	}
}


class Ext8Child extends Ext8Parents{
	int y;
	public void printExt8Child() {
		System.out.println("�ڽ� Ŭ����");
	}
}



public class ExtendsEx8 {
 public static void main(String[] args) {
	Ext8Parents p = new Ext8Child();
	p.printExt8Parent();
//	p.printExt8Child(); // �ڽ� Ŭ������ ���������(new) �θ� Ŭ���� Ÿ������ �ڵ���ȯ�Ǿ� �ڽ� Ŭ���� �޼��� ��� �Ұ� ( p.332~ )
	//Ext8Child c = new Ext8Parents(); // �θ� �����Ͽ�(new �Ͽ�) �ڽĿ� ���� ���� ����
	
	Ext8Child c = (Ext8Child) p;
	c.printExt8Parent();
	c.printExt8Child();
	
 	}
}
