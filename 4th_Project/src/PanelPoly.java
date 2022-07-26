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

		//JFrame 설정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new GridLayout(0,1));
		f.setSize(500,1000);
		
		//new Components 
		APanel ap = new APanel(); // APanel.은 접근 안됨. ap.은 참조됨 -> APanel은 클래스 ap는 그 안에 객체(인스턴스화 됨)
		BPanel bp = new BPanel();
		JTextField tf = new JTextField(10);
		JButton btn = new JButton("Click Here");
	
		//btn set
		btn.setSize(150,100);		
		btn.setLocation(170, 190);
		
		//add Componets to Panels
		ap.add(tf);
		bp.add(btn);
		
		//add Panels to Frame
		f.add(ap);
		f.add(bp);
		
		
		f.setVisible(true);
		
	}
	
}