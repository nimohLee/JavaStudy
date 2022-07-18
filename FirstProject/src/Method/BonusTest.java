package Method;

class Bonus {

	private double bonus;
	private int salary;

	public void setBonus(double bonus) {
		// TODO Auto-generated method stub
		this.bonus = bonus * 0.01;
	}

	public void setSalary(int salary) {
		// TODO Auto-generated method stub
		this.salary = salary;
	}

	public void printSalary() {
		// TODO Auto-generated method stub
		System.out.println("연봉은 " + salary + "만원 이며, 보너스는 " + (int) (salary * bonus) + "만원 입니다");
	}

}

public class BonusTest {
	public static void main(String[] args) {
		// 3
		// 보너스 입력(%)
		// 세팅메서드 1개
		// 연봉세팅메서드(5000)
		// 연봉,연봉기준 보너스 출력하는 메서드

		Bonus bn = new Bonus();

		bn.setBonus(10);
		bn.setSalary(5000);
		bn.printSalary();
	}
}
