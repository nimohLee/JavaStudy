package GUIEx_1��°;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUIEx6 {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setLayout(new FlowLayout()); // ���̾ƿ� ��ü�� ���� ���������ʰ� �ٷ� �������ִ� ���(1ȸ��)
	JLabel lbl = new JLabel("�׳ɱ۾�");
	JTextField tf = new JTextField(5); // �ؽ�Ʈ �Է�â
	JButton btn = new JButton("��ư"); //��ư
	
	JRadioButton radio1 = new JRadioButton("1");//������ư
	JRadioButton radio2 = new JRadioButton("2");
	JRadioButton radio3 = new JRadioButton("3");
	
	ButtonGroup bg = new ButtonGroup(); // ������ư �ϳ� Ŭ���� �ٸ� �͵� ��ҵǾ�� �ϹǷ� ButtonGroup���� ������
	bg.add(radio1);
	bg.add(radio2);
	bg.add(radio3);
	
	JCheckBox ck1 = new JCheckBox("���"); // üũ�ڽ�
	JCheckBox ck2 = new JCheckBox("����");
	JCheckBox ck3 = new JCheckBox("����");

	f.add(lbl);
	f.add(tf);
	f.add(btn);
	f.add(radio1);
	f.add(radio2);
	f.add(radio3);
	
	f.add(ck1);
	f.add(ck2);
	f.add(ck3);
	f.setSize(500,500);
	f.setVisible(true);
}
}
