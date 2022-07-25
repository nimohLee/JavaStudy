package GUIEx_1번째;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIEx8 extends JFrame{ // JFrame을 상속받은 GUIEx8
	public GUIEx8() { // JFrame == this로 생각하고 작업
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,400);
		
		JPanel pnl = new JPanel(); // 			색상 패널을 만들고 싶다.
		pnl.setBackground(Color.YELLOW); // ex) new Cpanel(Color.RED) 하면 빨간색 패널이 나오게.
		
		
		CPanel cPnl = new CPanel(Color.BLACK);
		this.add(cPnl);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUIEx8 ge8 = new GUIEx8();
	}
}

