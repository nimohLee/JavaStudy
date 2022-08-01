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
		System.out.println("윈도우 오픈");
	}

	@Override
	public void windowClosing(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우 클로징");
	}

	@Override
	public void windowClosed(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
  System.out.println("윈도우 클로즈");
	}

	@Override
	public void windowIconified(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우가 최소화되었습니다");
	}

	@Override
	public void windowDeiconified(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우 최소화가 해제되었습니다");
	}

	@Override
	public void windowActivated(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우 액티베이트");
	}

	@Override
	public void windowDeactivated(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우 디액티베이트");
	}

	public static void main(String[] args) {
		new WindowEvent();
	}
}
