package Constructor;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Box extends JFrame{// �� Box Ŭ����  +  JFrame Ŭ����
	Box() {
		//Scanner sc = new Scanner(System.in);
		
		JPanel pnl = new JPanel();// �г��� �������.
		
		this.setSize(200, 200);// set�� �� �� �����̴�. = �ܺ��� ���� �ȿ� �ִ´�
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pnl.setBackground(Color.PINK);		
		System.out.println(pnl.getBackground());
		
		this.add(pnl);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Box();
	}
}



