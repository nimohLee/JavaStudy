package ExtendsExs_2번째;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class HButton extends JButton{ // JButton 클래스를 상속받은 HButton 클래스
	
	public HButton(String str) { // HButton 클래스의 생성자 
		this.setText(str);
		this.setBackground(Color.GREEN); // HButton은 JButton을 상속받아 색을 녹색으로 설정 
		// JButton 대신 HButton 객체를 생성하면 버튼색은 녹색으로 나옴
	}
}
public class ExtendsEx3 {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(300,200);
	f.setLayout(new GridLayout());
	
	JButton btn1 = new JButton("클릭 J");
	HButton btn2= new HButton("클릭 H");
	
	f.add(btn1);
	f.add(btn2);
	f.setVisible(true);
}
}
