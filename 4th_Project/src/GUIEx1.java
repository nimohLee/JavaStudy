import javax.swing.JButton; // javax ������Ʈ�� swing ��Ű���� JButton Ŭ������ ������
import javax.swing.JFrame; // javax ������Ʈ�� swing ��Ű���� JButton Ŭ������ ������

public class GUIEx1 { // Graphic User Interface 

	public static void main(String[] args) {
		JFrame f = new JFrame(); // JFrame (â �����) ��ü ����(JFrame ��ü�� �ν��Ͻ�ȭ)
		
		f.setSize(300,200); //f(JFrame�� �ν��Ͻ�)�� �ִ� ���� �޼������ ����� �� ����
							//setSize()�� JFrame�� ȭ��ũ�� ����
		
		// JButton ��ü�� ����(�ν��Ͻ�ȭ)
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton();
		btn5.setText("��ư5"); // ���ڸ� �ִ� �޼��嵵 ����
		
		
		// GUI ���� â ��ư 1~5 �߰� �� ���� Layout ����(North~Center)
		f.add(btn1,"North"); 
		f.add(btn2,"East");
		f.add(btn3,"West");
		f.add(btn4,"South");
		f.add(btn5,"Center"); // �� ���� center�� �⺻��
		
		f.setVisible(true); // JFrame�� �ν��Ͻ� f�� Ȱ��. ȭ�鿡 ���̰� �ϱ�
	
		
	}

}
