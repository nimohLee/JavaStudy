import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx2 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); // tip.1) import 해야할 것 있을 때 Ctrl + Shift + O 하면 자동으로 import 해줌
								// tip.2) Ctrl + Shift + F 하면 문서 전체 자동정렬
		FlowLayout f1 = new FlowLayout(); // FlowLayout 객체 f1 생성(인스턴스화)
		f.setLayout(f1); // f의 레이아웃을 설정하는 메서드를 사용
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4= new JButton("버튼4");
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		
		f.setSize(300,200); // JFrame f의 size set method
		f.setVisible(true); // JFrame f 보이게
	}
}
