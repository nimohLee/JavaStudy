import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GUIEx5 {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼으로 실행 창 종료
f.setSize(500,400);
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");
	JButton btn4 = new JButton("버튼4");

	JPanel pnl1 = new JPanel(); // JFrame의 기능을 가진 컴포넌트
	// 적재 가능한 컨테이너(여기에 뭐든 add할 수 있음)
	JPanel pnl2 = new JPanel();
	JPanel pnl3 = new JPanel();
	JPanel pnl4 = new JPanel();
	
	
	// button을 panel에 붙임
	pnl1.add(btn1);
	pnl1.add(btn2);
	pnl1.setBorder(BorderFactory.createLineBorder(Color.black));

	btn1.setBackground(new Color(0,255,255));
	btn2.setBackground(new Color(255,0,0));
	
	
	pnl2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	pnl3.setBackground(new Color(0,0,0));
	pnl4.setBackground(new Color(0,0,0));
	
	
	
	pnl2.add(pnl3);
	pnl2.add(pnl4);
	pnl2.setSize(300,100);
	pnl3.setSize(250,100);
	pnl4.setSize(250,100);
	
	// panel을 frame에 붙임
	f.add(pnl1,"North");
	f.add(pnl2,"South");
	
	f.setVisible(true);
	
}

}
