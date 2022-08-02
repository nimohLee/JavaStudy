import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIAuth extends HFrame {
	JPanel pnlLeft,pnlRight,pnlID,pnlPW,pnlCombo,pnlAddr;
	JLabel lblID,lblPW,lblAddr;
	JTextField tfID,tfNum1,tfNum2;
	JPasswordField pf;
	JList list;
	JComboBox combo;
	JTextArea ta;
	JButton btn;
	
	public GUIAuth(){
		this.setSize(600,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		pnlLeft = new JPanel();
		pnlRight = new JPanel();
		pnlID = new JPanel();
		pnlPW = new JPanel();
		pnlCombo = new JPanel();
		pnlAddr = new JPanel();
		lblID = new JLabel("아이디");
		lblPW = new JLabel("비밀번호");
		lblAddr = new JLabel("주소");
		tfID = new JTextField(10);
		tfNum1 = new JTextField(6);
		tfNum2 = new JTextField(6);
		pf = new JPasswordField(10);
		combo = new JComboBox<>();
		list = new JList<>();
		btn = new JButton("가입");
		ta = new JTextArea();
		
		
		pnlID.add(lblID);
		pnlID.add(tfID);
		pnlPW.add(lblPW);
		pnlPW.add(pf);
		pnlCombo.add(combo);
		pnlCombo.add(tfNum1);
		pnlCombo.add(tfNum2);
		pnlAddr.add(lblAddr);
		pnlAddr.add(list);
		pnlAddr.add(btn);
		
		this.setLayout(new GridLayout(0,2));
		pnlLeft.setLayout(new FlowLayout());
		pnlID.setLayout(new GridLayout(0,2));
		pnlPW.setLayout(new GridLayout(0,2));
		pnlCombo.setLayout(new GridLayout(0,3));
		pnlAddr.setLayout(new GridLayout(0,1)); 
		
		pnlLeft.add(pnlID);
		pnlLeft.add(pnlPW);
		pnlLeft.add(pnlCombo);
		pnlLeft.add(pnlAddr);

		
		
		
		
		
		this.add(pnlLeft);
		this.add(pnlRight);
		
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIAuth();
	}
	
	
}

