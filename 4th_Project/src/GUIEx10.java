import javax.swing.JButton;
import javax.swing.JLabel;

import GUIEx_1��°.MFrame;

public class GUIEx10 extends MFrame {
	
	public GUIEx10() {
		JButton btn1 = new JButton("Ŭ��");
		JLabel lbl1 = new JLabel("����");
		this.add(lbl1,"North");
		this.add(btn1);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEx10();
	}
}
