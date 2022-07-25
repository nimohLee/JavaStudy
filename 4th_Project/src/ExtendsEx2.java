import javax.swing.JFrame;

public class ExtendsEx2 extends JFrame{ // 앞에서 배운 GUI JFrame을 상속

	public ExtendsEx2() {
		// JFrame 클래스를 상속받았기 때문에 내 것과 동일한 것처럼 사용
		this.setSize(300, 300); // 부모가 가지고 있던 메서드
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 부모가 가지고 있던 메서드 
		this.setVisible(true); // 부모가 가지고 있던 메서드
	}
	
	
	public void setSize(int w, int h) {
		// 부모가 가지고 있는 것과 같은 이름의 내 메서드 (JFrame 클래스에도 setSize() 메서드가 있음)
		// 부모의 메서드가 마음에 안 들면 똑같은 이름으로 만들어서 내용을 바꾸면 된다.
		// 이것이 오버라이딩 - 상위 클래스의 내용을 바꿔버리는 
		
		
	}
	
	
	public void printSize() { // 내가 만든 메서드
		System.out.println(this.getSize());
	}
	
	public static void main(String[] args) {
		ExtendsEx2 ee= new ExtendsEx2(); // ExtendsEx2가 JFrame을 상속받았으므로 JFrame f= new JFrame();의 의미도 들어있음
		
	}
	
	//https://docs.oracle.com/javase/8/docs/api/ 가서 JFrame 검색해보면
//	Class JFrame
//	
//		java.lang.Object
//			java.awt.Component
//				java.awt.Container
//					java.awt.Window
//						java.awt.Frame
//							javax.swing.JFrame
//	이런 게 있는데 이게 JFrame 클래스의 상속도
//	즉 JFrame은 Frame을 상속받고 Frame은 Window를 상속받고 Window는 Container를 상속받고......
//	JFrame은 위에 적힌 모든 클래스를 상속받은 것과 마찬가지이므로 JFrame에서도 제일 최상위의 Object 클래스의 메서드와 변수를 사용할 수 있음
}
