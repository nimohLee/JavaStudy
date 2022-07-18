package Method;

class BMI {

	void calc(String name, float h, float w) {
		System.out.println(name + "의 bmi지수는 " + w / ((h / 100) * (h / 100)));
	}

}

public class BMITest {

	public static void main(String[] args) {
		BMI bmi = new BMI();
		bmi.calc("이호민", 176, 68);
	}
}
