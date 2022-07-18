package Method;

public class ParameterEx {
	void sum(int ... i) {
		// 가변인자
		// 여러개 받을 수 있는 변수는 한 개만 사용가능. 
		// 다른타입의 변수도 같이 받고 싶다면 앞에 써야한다.
		//sum(10) <= int 타입의 매개변수의 개수를 무한대
	
		int sum=0;
	for(int j=0;j<i.length;j++)
		sum=sum+i[j];
	
	System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		ParameterEx pe = new ParameterEx();
		pe.sum(10,20,30,40,50);
		pe.sum(20);
	}
}
