import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class AButton extends JButton{
	public AButton() { // <-- 생성자
		this.setText("RED");
		this.setBackground(Color.red);
		this.setForeground(Color.WHITE);
	}
}

class BButton extends JButton{
	public BButton() { // <-- 생성자
		this.setText("BLUE");
		this.setBackground(Color.blue);
		this.setForeground(Color.white);
	}
}

class CButton extends JButton{
	public CButton() { // <-- 생성자
		this.setText("GREEN");
		this.setForeground(Color.white);
		this.setBackground(Color.GREEN);
	}
}


public class PolyEx extends JFrame{ // 클래스 안에는 메서드와 필드(변수) 밖에 없음. 그 외의 공간에는 작성 불가
	
	public PolyEx() {  // 	<-- 생성자
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		
	}
	
	public void addButton(JButton btn) { // <-- 메서드 - 매개변수는 JButton인데 AButton, BButton, CButton 클래스가 들어감.
										 // 		     이 경우 자식 클래스가 부모 클래스로 타입 자동변환됨.
		this.add(btn);
	}
	

	public static void main(String[] args) {
		
		PolyEx p = new PolyEx(); // <-- 생성자 호출 ( PolyEx 객체의 생성 )
		
		AButton a = new AButton(); // <-- 생성자 호출 ( AButton 객체의 생성 )
		BButton b = new BButton(); // <-- 생성자 호출 ( BButton 객체의 생성 )
		CButton c = new CButton(); // <-- 생성자 호출 ( CButton 객체의 생성 )
	
		
		p.setLayout(new GridLayout());
		
		p.addButton(a);
		p.addButton(b);
		p.addButton(c);
		
		p.setVisible(true);
		
	}
	
	
}
