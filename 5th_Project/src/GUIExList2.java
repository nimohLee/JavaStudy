import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIExList2 extends HFrame implements ActionListener{
	JTextField tf;
	JButton btnAdd, btnDel;
	JList listLeft,listRight;
	DefaultListModel modelLeft, modelRight; //����Ʈ�� ���� �߰�, ���� �� �� �ְ��ϴ� ��
	public GUIExList2() {
		btnAdd = new JButton("==>");
		btnDel = new JButton("<==");
		JPanel pnl = new JPanel();
		
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		
		String[] a = {"����","����","�λ�","����","��û"};
		
		listLeft = new JList(new DefaultListModel());
		listRight = new JList(new DefaultListModel());
		
		modelLeft = (DefaultListModel) listLeft.getModel();
		modelRight = (DefaultListModel) listRight.getModel();
		
		modelLeft.addElement("����");
		modelLeft.addElement("����");
		modelLeft.addElement("�λ�");
		modelLeft.addElement("����");
		modelLeft.addElement("��û");
		
		
		pnl.add(listLeft);
		pnl.add(listRight);
		pnl.setLayout(new GridLayout(0,2));
		
		this.add(btnAdd,"North");
		this.add(pnl);
		this.add(btnDel,"South");
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIExList2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnAdd) {
			if(!modelLeft.isEmpty()) {
			modelRight.addElement(modelLeft.getElementAt(0));
			modelLeft.remove(0);}

		}
		else if(e.getSource()==btnDel) {
			if(!modelRight.isEmpty()) {
			modelLeft.addElement(modelRight.getElementAt(0));
			modelRight.remove(0);}

		}
	}
}
