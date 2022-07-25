import javax.swing.JButton; // javax 프로젝트에 swing 패키지에 JButton 클래스를 가져옴
import javax.swing.JFrame; // javax 프로젝트에 swing 패키지에 JButton 클래스를 가져옴

public class GUIEx1 { // Graphic User Interface 

	public static void main(String[] args) {
		JFrame f = new JFrame(); // JFrame (창 만들기) 객체 생성(JFrame 객체의 인스턴스화)
		
		f.setSize(300,200); //f(JFrame의 인스턴스)에 있는 여러 메서드들을 사용할 수 있음
							//setSize()는 JFrame의 화면크기 설정
		
		// JButton 객체의 생성(인스턴스화)
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton();
		btn5.setText("버튼5"); // 글자를 넣는 메서드도 있음
		
		
		// GUI 실행 창 버튼 1~5 추가 및 각각 Layout 설정(North~Center)
		f.add(btn1,"North"); 
		f.add(btn2,"East");
		f.add(btn3,"West");
		f.add(btn4,"South");
		f.add(btn5,"Center"); // 안 쓰면 center가 기본값
		
		f.setVisible(true); // JFrame의 인스턴스 f를 활용. 화면에 보이게 하기
	
		
	}

}
