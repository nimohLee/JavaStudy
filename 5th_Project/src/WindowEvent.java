import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowEvent extends JFrame implements WindowListener {

	public WindowEvent() {
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.addWindowListener(this);
		
		
	}

	@Override
	public void windowOpened(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ ����");
	}

	@Override
	public void windowClosing(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ Ŭ��¡");
	}

	@Override
	public void windowClosed(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
  System.out.println("������ Ŭ����");
	}

	@Override
	public void windowIconified(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����찡 �ּ�ȭ�Ǿ����ϴ�");
	}

	@Override
	public void windowDeiconified(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ �ּ�ȭ�� �����Ǿ����ϴ�");
	}

	@Override
	public void windowActivated(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ ��Ƽ����Ʈ");
	}

	@Override
	public void windowDeactivated(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ ���Ƽ����Ʈ");
	}

	public static void main(String[] args) {
		new WindowEvent();
	}
}
