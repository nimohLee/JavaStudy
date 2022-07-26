import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class APanel extends JPanel {

	public APanel() {
		this.setBackground(Color.blue);
		
	}
	
}

class BPanel extends JPanel {
	public BPanel() {
		this.setLayout(null);
	}
}

public class PanelPoly {
	public static void main(String[] args) {
		JFrame f = new JFrame();

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new GridLayout(0,1));
		f.setSize(500,1000);
		
		APanel ap = new APanel(); // APanel.�� ���� �ȵ�. ap.�� ������ -> APanel�� Ŭ���� ap�� �� �ȿ� ��ü(�ν��Ͻ�ȭ ��)
		BPanel bp = new BPanel();
		JTextField tf = new JTextField(10);
		JButton btn = new JButton();
		
//		tf.setSize(300,50);
		btn.setSize(150,100);
		
		btn.setLocation(170, 190);
		
		ap.add(tf);
		bp.add(btn);
		
		f.add(ap);
		f.add(bp);
		
		f.setVisible(true);
		
	}
	
}