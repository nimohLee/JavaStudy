
public class ClassEx {
	static int k; // 클래스 변수- 전역변수는 값을 안 넣으면 알아서 초기화 된다.
	double d;
	boolean b;
	String str;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클래스 소속 변수는 그냥 사용이 안됨. 반드시 메모리에 올려서 사용해야 함(new)
////		ClassEx c = new ClassEx();
////		ClassEx e = new ClassEx();
////		e.k = 3;
////		e.str = "하이";
////		System.out.println(c.k);
////		System.out.println(c.str);
////		
//		System.out.println(e.k);
//		System.out.println(e.str);
	
		ClassEx ce3 = new ClassEx();
		System.out.println(ce3.k); // 0
		System.out.println(ce3.d); // 0.0
		System.out.println(ce3.b); // false
		System.out.println(ce3.str); // null
		System.out.println(ce3.str == null);
		
	}
	
}
