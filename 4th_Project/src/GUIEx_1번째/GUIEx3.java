package GUIEx_1번째;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx3 {

	public static void main(String[] args) {
		
		JFrame f= new JFrame();
		f.setSize(200,300);
		
		GridLayout gl = new GridLayout(3,2); // 행,열 - 보통 행은 0으로 함
											 // why? 모자라면 자동으로 행이 늘어남, 내용이 화면에 붙는 순서는 왼쪽->오른쪽
	
		f.setLayout(gl);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		
		f.setVisible(true);
	}
		
	
}
