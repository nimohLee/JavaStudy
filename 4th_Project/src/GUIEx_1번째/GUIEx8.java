package GUIEx_1��°;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIEx8 extends JFrame{ // JFrame�� ��ӹ��� GUIEx8
	public GUIEx8() { // JFrame == this�� �����ϰ� �۾�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,400);
		
		JPanel pnl = new JPanel(); // 			���� �г��� ����� �ʹ�.
		pnl.setBackground(Color.YELLOW); // ex) new Cpanel(Color.RED) �ϸ� ������ �г��� ������.
		
		
		CPanel cPnl = new CPanel(Color.BLACK);
		this.add(cPnl);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUIEx8 ge8 = new GUIEx8();
	}
}

