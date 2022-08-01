import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn1 = new JButton("��ư 1");
		JButton btn2 = new JButton("��ư 2");
		frame.add(btn1);
		frame.add(btn2);
		
		
		// �������̽��� �����Ϸ��� ������ ���ÿ� ������ �ۼ��ؾ� �Ѵ�.
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn1)
					System.out.println("��ư1");
				else
					System.out.println("��ư2");
			}
			
		};
		btn1.addActionListener(listener);//��ư�� �׼� ���̱�
		btn2.addActionListener(listener);
		
		
		frame.setVisible(true);
		
		
	}
}
