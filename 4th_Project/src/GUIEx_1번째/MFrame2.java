package GUIEx_1¹øÂ°;

import java.awt.LayoutManager;

import javax.swing.JFrame;

public class MFrame2 extends JFrame{
	public MFrame2() {
	}
	
	public MFrame2(int width, int height) {
		
	}
	
	public MFrame2(int width, int height, LayoutManager layout) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width,height);
		this.setLayout(layout);
		
	}

}
