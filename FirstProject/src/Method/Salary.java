package Method;

public class Salary {

	int salary;
	int insurance;
	int tax;
	double realTex;
	
	public void insertSalary(int i) {
		// TODO Auto-generated method stub
		salary = i;
	}

	public void calTax(int i) {
		// TODO Auto-generated method stub
		tax=i;
	}

	public void calInsurance(int i) {
		// TODO Auto-generated method stub
		insurance = i;
	}

	public void showRealSalary() {
		// TODO Auto-generated method stub
		System.out.println("월급 "+salary+"만원, 세금 "+tax+"%, 보험료 "+insurance+"만원");
		System.out.println("실 수령액 "+ ( (int)(salary*(1-(tax*0.01))) - insurance) +"만원");
	
	}

}
