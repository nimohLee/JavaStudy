package ExtendsExs_2��°;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class HButton extends JButton{ // JButton Ŭ������ ��ӹ��� HButton Ŭ����
	
	public HButton(String str) { // HButton Ŭ������ ������ 
		this.setText(str);
		this.setBackground(Color.GREEN); // HButton�� JButton�� ��ӹ޾� ���� ������� ���� 
		// JButton ��� HButton ��ü�� �����ϸ� ��ư���� ������� ����
	}
}
public class ExtendsEx3 {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(300,200);
	f.setLayout(new GridLayout());
	
	JButton btn1 = new JButton("Ŭ�� J");
	HButton btn2= new HButton("Ŭ�� H");
	
	f.add(btn1);
	f.add(btn2);
	f.setVisible(true);
}
}
