package GUIEx_1번째;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GUIEx4 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(null); // 기본 레이아웃을 없애버림
		
		JButton btn = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		
		
		btn.setSize(70,50);
		btn.setLocation(0, 10); // 위치설정 메서드
		f.add(btn);
		
		f.setSize(300,200);
		f.setVisible(true);
	}
}
