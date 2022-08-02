import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUIMoveText extends HFrame implements ActionListener{

	JPanel pnlMain;
	JButton btnTop,btnBot;
	JTextArea taLeft,taRight;
	JList lst;
	
	public GUIMoveText() {
		
		String[] city = {"力林","碍盔","何魂","辑匡","面没"};
		
		lst = new JList<>(city);
		pnlMain = new JPanel();
		btnTop = new JButton("=>");
		btnBot = new JButton("<=");
		taLeft = new JTextArea();
		taRight = new JTextArea();
		
		this.add(btnTop,"North");
		this.add(pnlMain);
		this.add(btnBot,"South");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {
		new GUIMoveText();
	}
}
