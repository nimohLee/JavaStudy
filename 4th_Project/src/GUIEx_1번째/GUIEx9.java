package GUIEx_1번째;

import java.awt.Color;

import javax.swing.JButton;

public class GUIEx9 extends MFrame{
	
	public GUIEx9() {
	//super(); 없어도 자동 호출
	//super(700,600);
	super(1000,500,Color.RED);
	
	JButton btn = new JButton("클릭");
	this.add(btn);


	
	
	
	this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new GUIEx9();
	}
}
