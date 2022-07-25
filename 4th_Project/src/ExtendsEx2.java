import javax.swing.JFrame;

public class ExtendsEx2 extends JFrame{ // �տ��� ��� GUI JFrame�� ���

	public ExtendsEx2() {
		// JFrame Ŭ������ ��ӹ޾ұ� ������ �� �Ͱ� ������ ��ó�� ���
		this.setSize(300, 300); // �θ� ������ �ִ� �޼���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �θ� ������ �ִ� �޼��� 
		this.setVisible(true); // �θ� ������ �ִ� �޼���
	}
	
	
	public void setSize(int w, int h) {
		// �θ� ������ �ִ� �Ͱ� ���� �̸��� �� �޼��� (JFrame Ŭ�������� setSize() �޼��尡 ����)
		// �θ��� �޼��尡 ������ �� ��� �Ȱ��� �̸����� ���� ������ �ٲٸ� �ȴ�.
		// �̰��� �������̵� - ���� Ŭ������ ������ �ٲ������ 
		
		
	}
	
	
	public void printSize() { // ���� ���� �޼���
		System.out.println(this.getSize());
	}
	
	public static void main(String[] args) {
		ExtendsEx2 ee= new ExtendsEx2(); // ExtendsEx2�� JFrame�� ��ӹ޾����Ƿ� JFrame f= new JFrame();�� �ǹ̵� �������
		
	}
	
	//https://docs.oracle.com/javase/8/docs/api/ ���� JFrame �˻��غ���
//	Class JFrame
//	
//		java.lang.Object
//			java.awt.Component
//				java.awt.Container
//					java.awt.Window
//						java.awt.Frame
//							javax.swing.JFrame
//	�̷� �� �ִµ� �̰� JFrame Ŭ������ ��ӵ�
//	�� JFrame�� Frame�� ��ӹް� Frame�� Window�� ��ӹް� Window�� Container�� ��ӹް�......
//	JFrame�� ���� ���� ��� Ŭ������ ��ӹ��� �Ͱ� ���������̹Ƿ� JFrame������ ���� �ֻ����� Object Ŭ������ �޼���� ������ ����� �� ����
}
