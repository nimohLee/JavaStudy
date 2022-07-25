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
	
	// JFrame 객체 생성 및 초기화 ( 종료방법, 창 크기, 화면 보이게 )
	
	JFrame f = new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(700,500);
	f.setVisible(true);
	
	// JPanel 생성
	// ( 위 중간 아래 Panel)
	JPanel northPnl = new JPanel();
	JPanel centerPnl = new JPanel();
	JPanel southPnl = new JPanel();
	
	// RadioButton 과 CheckBox를 묶어주기 위한 Panel
	JPanel rdPnl = new JPanel();
	JPanel ckPnl = new JPanel();
	
	// centerPnl을 2열로 나타내기 위한 GridLayout 설정
	centerPnl.setLayout(new GridLayout(0,2));
	
	// 화면에서 사용되는 컴포넌트들 모두 생성
	// 컴포넌트란 화면에 구성된 각각의 요소들을 말함 ex) 텍스트 라벨, 텍스트 필드, 버튼, 패널, 라디오 버튼 등등
	JLabel lblSign = new JLabel("회원가입");
	
	JLabel lblID = new JLabel("아이디");
	JLabel lblName = new JLabel("이름");
	JLabel lblPW = new JLabel("비밀번호");
	JLabel lblPhone = new JLabel("연락처");
	JLabel lblGender = new JLabel("성별");
	JLabel lblHobby = new JLabel("취미");
	
	JTextField tfID = new JTextField();
	JTextField tfName = new JTextField();
	JTextField tfPW = new JTextField();
	JTextField tfPhone = new JTextField();
	
	JRadioButton rdMan = new JRadioButton();
	JRadioButton rdWoman = new JRadioButton();
	ButtonGroup rdGroup = new ButtonGroup();
	rdGroup.add(rdMan); // ButtonGroup으로 묶어줘야 여러 개의 버튼이 같은 목적임을 알 수 있음
	rdGroup.add(rdWoman);
	
	ButtonGroup ckGroup = new ButtonGroup();
	JCheckBox ckSwim = new JCheckBox("수영");
	JCheckBox ckRead = new JCheckBox("독서");
	JCheckBox ckMusic = new JCheckBox("음악");
	
	JButton btnSign = new JButton("가입");
	JButton btnCancel = new JButton("취소");
	
	// 각각의 패널에 테두리 그려주기
	northPnl.setBorder(BorderFactory.createLineBorder(Color.black));
	southPnl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	ckPnl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	rdPnl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	
	
	rdPnl.add(rdMan);
	rdPnl.add(rdWoman);
	
	ckPnl.add(ckSwim);
	ckPnl.add(ckRead);
	ckPnl.add(ckMusic);
	
	// Panel에 생성된 컴포넌트들 모두 붙여주기
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
	
	
	//Frame에 Panel 붙여주기
	f.add(northPnl,"North");
	f.add(centerPnl,"Center");
	f.add(southPnl,"South");

}
}
