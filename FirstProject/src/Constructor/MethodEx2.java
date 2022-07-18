package Constructor;

public class MethodEx2 {
	int x;
	
	
	void plus() {
		x= x+10;
	}
	
	
	public static void main(String[] args) {
		MethodEx2 me = new MethodEx2();		
		me.plus();
		System.out.println(me.x);
	}
}
