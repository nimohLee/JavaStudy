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
	DefaultListModel modelLeft, modelRight; //리스트에 값을 추가, 수정 할 수 있게하는 모델
	public GUIExList2() {
		btnAdd = new JButton("==>");
		btnDel = new JButton("<==");
		JPanel pnl = new JPanel();
		
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		
		String[] a = {"제주","강원","부산","서울","충청"};
		
		listLeft = new JList(new DefaultListModel());
		listRight = new JList(new DefaultListModel());
		
		modelLeft = (DefaultListModel) listLeft.getModel();
		modelRight = (DefaultListModel) listRight.getModel();
		
		modelLeft.addElement("제주");
		modelLeft.addElement("강원");
		modelLeft.addElement("부산");
		modelLeft.addElement("서울");
		modelLeft.addElement("충청");
		
		
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
