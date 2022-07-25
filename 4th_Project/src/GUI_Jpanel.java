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

	//JPanel은 HTML에서 여러 태그들을 하나의 div로 묶어주는 것과 비슷
	
	JPanel p1 = new JPanel(); // JPanel 객체 p1 생성 (인스턴스화)
	JPanel p2 = new JPanel();
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");
	JButton btn4 = new JButton("버튼4");
	JButton btn5 = new JButton("버튼5");
	JButton btn6 = new JButton("버튼6");
	JButton btn7 = new JButton("버튼7");
	JButton btn8 = new JButton("버튼8");
	
	// f(JFrame)가 아닌 p(JPanel)에 버튼을 붙여서 버튼이 붙은 JPanel을 JFrame에 붙임
	// btn -> JPanel -> JFrame
	
	
	// 버튼을 JPanel에 붙임
	p1.add(btn1);
	p1.add(btn2);
	p1.add(btn3);
	p1.add(btn4);

	p2.add(btn5);
	p2.add(btn6);
	p2.add(btn7);
	p2.add(btn8);

	f.setSize(300,300);
	
	// JPanel을 JFrame에 붙임
	f.add(p1);
	f.add(p2);
	f.setVisible(true);
	
	
	
	
	
	
	
	
	
	
}
}
