import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorButton extends JFrame implements ActionListener {

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	JButton red = new JButton("Red");
	JButton blue = new JButton("BLUE");
	JButton green = new JButton("GREEN");

	public ColorButton() {
		this.setSize(600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(0, 1));

		p1.setLayout(new FlowLayout());
		
		p1.add(red);
		p1.add(blue);
		p1.add(green);

		
		p2.setBackground(Color.white);
		
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		
		
		this.add(p1);
		this.add(p2);

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == red) {
			p2.setBackground(Color.red);
		} else if (e.getSource() == blue) {
			p2.setBackground(Color.blue);
		} else if (e.getSource() == green) {
			p2.setBackground(Color.green);
		}
	}

	public static void main(String[] args) {
		new ColorButton();
	}
}
