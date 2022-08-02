import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIExButton extends HFrame implements ActionListener {
	JPasswordField tf;
	JTextArea ta;
	JLabel lbl;
	JButton btn;

	public GUIExButton() {
		tf = new JPasswordField();
		ta = new JTextArea("여기에 글씨가 TextField에 있는 글자로 바뀝니다");
		ta.disable();
		btn = new JButton("클릭");
		btn.addActionListener(this);
		this.add(tf, "North");
		this.add(ta);
		this.add(btn, "South");

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new GUIExButton();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			ta.append(tf.getText()+"\n");
			tf.setText("");
	
		}
	}
}
