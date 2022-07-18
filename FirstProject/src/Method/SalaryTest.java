package Method;

public class SalaryTest {
	public static void main(String args[]){
	    Salary s = new Salary();
	    s.insertSalary(1000);
	    s.calTax(5);
	    s.calInsurance(50);
	    s.showRealSalary();
	    
	    
	// 월급 1000만원, 세금 5%, 보험료 50만원
	// 실 수령액 xxx 만원
	}
}
