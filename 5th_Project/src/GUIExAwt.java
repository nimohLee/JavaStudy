import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIExAwt {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(200,300);
		f.setLayout(new FlowLayout());
		Button btn = new Button("클릭");
		f.add(btn);
		f.setVisible(true);
		
		JFrame jf = new JFrame();
		jf.setSize(200,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn2 = new JButton("클릭");
		jf.add(btn2);
		jf.setVisible(true);
		WindowListener wl = new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
