import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent2 extends JFrame implements ActionListener{
	JButton btn1,btn2;
	
	
	ButtonEvent2(){// 여기에 실행될 내용을 다 쓰면 됨
		this.setLayout(new FlowLayout());
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		this.add(btn1);
		this.add(btn2);
		
	
		
		btn1.addActionListener(this);//버튼에 액션 붙이기
		btn2.addActionListener(this);
		this.setVisible(true);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1)
			System.out.println("버튼1");
		else
			System.out.println("버튼2"); 
	}
	
	public static void main(String[] args) {
		new ButtonEvent2();
	}


}
