package GUIEx_1¹øÂ°;

import javax.swing.JCheckBox;

public class MCheckBox extends MFrame2{

	public MCheckBox() {
		
	}
	
	public MCheckBox(int width, int height) {
		this.setSize(width,height);
		this.setVisible(true);
	}
}

class MCheckEx extends MCheckBox{
	public static void main(String[] args) {
		new MCheckBox();
	}
}
