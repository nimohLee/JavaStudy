import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class AButton extends JButton{
	public AButton() { // <-- ������
		this.setText("RED");
		this.setBackground(Color.red);
		this.setForeground(Color.WHITE);
	}
}

class BButton extends JButton{
	public BButton() { // <-- ������
		this.setText("BLUE");
		this.setBackground(Color.blue);
		this.setForeground(Color.white);
	}
}

class CButton extends JButton{
	public CButton() { // <-- ������
		this.setText("GREEN");
		this.setForeground(Color.white);
		this.setBackground(Color.GREEN);
	}
}


public class PolyEx extends JFrame{ // Ŭ���� �ȿ��� �޼���� �ʵ�(����) �ۿ� ����. �� ���� �������� �ۼ� �Ұ�
	
	public PolyEx() {  // 	<-- ������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
	
		JPanel jp = new JPanel();
		AButton a = new AButton(); // <-- ������ ȣ�� ( AButton ��ü�� ���� )
		BButton b = new BButton(); // <-- ������ ȣ�� ( BButton ��ü�� ���� )
		CButton c = new CButton(); // <-- ������ ȣ�� ( CButton ��ü�� ���� )
	
		
		this.setLayout(new GridLayout());
		
		this.addButton(a);
		this.addButton(b);
		this.addButton(c);
		
		this.setVisible(true);
	}
	
	public void addButton(Component btn) { // <-- �޼��� - �Ű������� JButton�ε� AButton, BButton, CButton Ŭ������ ��.
										 // 		     �� ��� �ڽ� Ŭ������ �θ� Ŭ������ Ÿ�� �ڵ���ȯ��.
		this.add(btn);
	}
	

	public static void main(String[] args) {
		
		new PolyEx(); // <-- ������ ȣ�� ( PolyEx ��ü�� ���� )
		
		
		
	}
	
	
}
