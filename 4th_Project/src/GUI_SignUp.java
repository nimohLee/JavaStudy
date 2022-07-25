import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI_SignUp {
public static void main(String[] args) {
	
	// JFrame ��ü ���� �� �ʱ�ȭ ( ������, â ũ��, ȭ�� ���̰� )
	
	JFrame f = new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(700,500);
	f.setVisible(true);
	
	// JPanel ����
	// ( �� �߰� �Ʒ� Panel)
	JPanel northPnl = new JPanel();
	JPanel centerPnl = new JPanel();
	JPanel southPnl = new JPanel();
	
	// RadioButton �� CheckBox�� �����ֱ� ���� Panel
	JPanel rdPnl = new JPanel();
	JPanel ckPnl = new JPanel();
	
	// centerPnl�� 2���� ��Ÿ���� ���� GridLayout ����
	centerPnl.setLayout(new GridLayout(0,2));
	
	// ȭ�鿡�� ���Ǵ� ������Ʈ�� ��� ����
	// ������Ʈ�� ȭ�鿡 ������ ������ ��ҵ��� ���� ex) �ؽ�Ʈ ��, �ؽ�Ʈ �ʵ�, ��ư, �г�, ���� ��ư ���
	JLabel lblSign = new JLabel("ȸ������");
	
	JLabel lblID = new JLabel("���̵�");
	JLabel lblName = new JLabel("�̸�");
	JLabel lblPW = new JLabel("��й�ȣ");
	JLabel lblPhone = new JLabel("����ó");
	JLabel lblGender = new JLabel("����");
	JLabel lblHobby = new JLabel("���");
	
	JTextField tfID = new JTextField();
	JTextField tfName = new JTextField();
	JTextField tfPW = new JTextField();
	JTextField tfPhone = new JTextField();
	
	JRadioButton rdMan = new JRadioButton();
	JRadioButton rdWoman = new JRadioButton();
	ButtonGroup rdGroup = new ButtonGroup();
	rdGroup.add(rdMan); // ButtonGroup���� ������� ���� ���� ��ư�� ���� �������� �� �� ����
	rdGroup.add(rdWoman);
	
	ButtonGroup ckGroup = new ButtonGroup();
	JCheckBox ckSwim = new JCheckBox("����");
	JCheckBox ckRead = new JCheckBox("����");
	JCheckBox ckMusic = new JCheckBox("����");
	
	JButton btnSign = new JButton("����");
	JButton btnCancel = new JButton("���");
	
	// ������ �гο� �׵θ� �׷��ֱ�
	northPnl.setBorder(BorderFactory.createLineBorder(Color.black));
	southPnl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	ckPnl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	rdPnl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	
	
	rdPnl.add(rdMan);
	rdPnl.add(rdWoman);
	
	ckPnl.add(ckSwim);
	ckPnl.add(ckRead);
	ckPnl.add(ckMusic);
	
	// Panel�� ������ ������Ʈ�� ��� �ٿ��ֱ�
	northPnl.add(lblSign);
	
	centerPnl.add(lblID);
	centerPnl.add(tfID);
	
	centerPnl.add(lblName);
	centerPnl.add(tfName);
	
	centerPnl.add(lblPW);
	centerPnl.add(tfPW);
	
	centerPnl.add(lblPhone);
	centerPnl.add(tfPhone);
	
	centerPnl.add(lblGender);
	centerPnl.add(rdPnl);
	
	
	centerPnl.add(lblHobby);
	centerPnl.add(ckPnl);

	
	southPnl.add(btnSign);
	southPnl.add(btnCancel);
	
	
	//Frame�� Panel �ٿ��ֱ�
	f.add(northPnl,"North");
	f.add(centerPnl,"Center");
	f.add(southPnl,"South");

}
}
