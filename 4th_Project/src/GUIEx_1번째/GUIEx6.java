package GUIEx_1번째;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUIEx6 {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setLayout(new FlowLayout()); // 레이아웃 객체를 따로 생성하지않고 바로 설정해주는 방법(1회성)
	JLabel lbl = new JLabel("그냥글씨");
	JTextField tf = new JTextField(5); // 텍스트 입력창
	JButton btn = new JButton("버튼"); //버튼
	
	JRadioButton radio1 = new JRadioButton("1");//라디오버튼
	JRadioButton radio2 = new JRadioButton("2");
	JRadioButton radio3 = new JRadioButton("3");
	
	ButtonGroup bg = new ButtonGroup(); // 라디오버튼 하나 클릭시 다른 것들 취소되어야 하므로 ButtonGroup으로 묶어줌
	bg.add(radio1);
	bg.add(radio2);
	bg.add(radio3);
	
	JCheckBox ck1 = new JCheckBox("사과"); // 체크박스
	JCheckBox ck2 = new JCheckBox("포도");
	JCheckBox ck3 = new JCheckBox("망고");

	f.add(lbl);
	f.add(tf);
	f.add(btn);
	f.add(radio1);
	f.add(radio2);
	f.add(radio3);
	
	f.add(ck1);
	f.add(ck2);
	f.add(ck3);
	f.setSize(500,500);
	f.setVisible(true);
}
}
