import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx2 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); // tip.1) import �ؾ��� �� ���� �� Ctrl + Shift + O �ϸ� �ڵ����� import ����
								// tip.2) Ctrl + Shift + F �ϸ� ���� ��ü �ڵ�����
		FlowLayout f1 = new FlowLayout(); // FlowLayout ��ü f1 ����(�ν��Ͻ�ȭ)
		f.setLayout(f1); // f�� ���̾ƿ��� �����ϴ� �޼��带 ���
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4= new JButton("��ư4");
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		
		f.setSize(300,200); // JFrame f�� size set method
		f.setVisible(true); // JFrame f ���̰�
	}
}
