import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI_Jpanel {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	GridLayout gl = new GridLayout();
	f.setLayout(gl);

	//JPanel�� HTML���� ���� �±׵��� �ϳ��� div�� �����ִ� �Ͱ� ���
	
	JPanel p1 = new JPanel(); // JPanel ��ü p1 ���� (�ν��Ͻ�ȭ)
	JPanel p2 = new JPanel();
	JButton btn1 = new JButton("��ư1");
	JButton btn2 = new JButton("��ư2");
	JButton btn3 = new JButton("��ư3");
	JButton btn4 = new JButton("��ư4");
	JButton btn5 = new JButton("��ư5");
	JButton btn6 = new JButton("��ư6");
	JButton btn7 = new JButton("��ư7");
	JButton btn8 = new JButton("��ư8");
	
	// f(JFrame)�� �ƴ� p(JPanel)�� ��ư�� �ٿ��� ��ư�� ���� JPanel�� JFrame�� ����
	// btn -> JPanel -> JFrame
	
	
	// ��ư�� JPanel�� ����
	p1.add(btn1);
	p1.add(btn2);
	p1.add(btn3);
	p1.add(btn4);

	p2.add(btn5);
	p2.add(btn6);
	p2.add(btn7);
	p2.add(btn8);

	f.setSize(300,300);
	
	// JPanel�� JFrame�� ����
	f.add(p1);
	f.add(p2);
	f.setVisible(true);
	
	
	
	
	
	
	
	
	
	
}
}
