package Method;

public class MethodEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx6 me = new MethodEx6();
		char a = me.charAt("abcde",0);
		System.out.println(a);
	}

	private char charAt(String s, int i) {
		// TODO Auto-generated method stub
		
//		String[] sarr = s.split("");//한글자씩 잘라서 배열로 만드는 메서드
		char[] carr = s.toCharArray();//문자열을 char 배열로 만드는 메서드
		
		
		return carr[i];
	}

	

}
