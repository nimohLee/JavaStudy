import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent2 extends JFrame implements ActionListener{
	JButton btn1,btn2;
	
	
	ButtonEvent2(){// ���⿡ ����� ������ �� ���� ��
		this.setLayout(new FlowLayout());
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn1 = new JButton("��ư1");
		btn2 = new JButton("��ư2");
		this.add(btn1);
		this.add(btn2);
		
	
		
		btn1.addActionListener(this);//��ư�� �׼� ���̱�
		btn2.addActionListener(this);
		this.setVisible(true);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1)
			System.out.println("��ư1");
		else
			System.out.println("��ư2"); 
	}
	
	public static void main(String[] args) {
		new ButtonEvent2();
	}


}
