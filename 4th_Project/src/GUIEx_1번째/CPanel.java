package GUIEx_1번째;

import java.awt.Color;

import javax.swing.JPanel;

public class CPanel extends JPanel{ // 여기서 this는 JPanel과 CPanel을 모두 칭함


	
	public CPanel() {
		// super(); <== 부모의 생성자를 반드시 불러야 하는 건 아님
		// 왜냐하면 부모가 빈생자(빈 생성자)를 가지고 있으니까 알아서 호출함
		
	}
	public CPanel(Color c) {
		this.setBackground(c);
	}
	
}