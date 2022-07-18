package Method;

public class MethodEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodEx7 me = new MethodEx7();
		System.out.println(me.plus(100,50));
		System.out.println(me.minus(100,50));
		System.out.println(me.multi(100,50));
		System.out.println(me.divide(100,50));
		
	}

	private int divide(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

	private int multi(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	private int minus(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	private int plus(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}