package GUIEx_1��°;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GUIEx4 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(null); // �⺻ ���̾ƿ��� ���ֹ���
		
		JButton btn = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		
		
		
		btn.setSize(70,50);
		btn.setLocation(0, 10); // ��ġ���� �޼���
		f.add(btn);
		
		f.setSize(300,200);
		f.setVisible(true);
	}
}
