
public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car(); // bc. ��������(package)
		c1.wheelCount=4;
		c1.color="red";
		c1.name="�ӽ���";
		
		
		Car c2 = new Car();
		c2.wheelCount = 8;
		c2.color = "�����";
		c2.name = "����Ʈ��";
		
		// �ڹٿ��� �츮�� �ۼ��� Ŭ������ ������ ������ �� �� �ִ� ������ Ʋ�̴�.
		// new�� ���ؼ� �츮�� Ŭ������ ����� �� �ִ� ���·� �����.
		
		
		Car[] cars = new Car[3]; // �迭�� �����Ҵ��� �ϱ����ؼ� new�� ����Ѵ�. new�� ������ �޸𸮿� ����
		// ���� ���� 3���� ����, ���� �ְ� ���
		
		for(int i=0;i<cars.length;i++)
			cars[i]=new Car();
		
		
		cars[0].wheelCount = 2;
		cars[0].color="blue";
		cars[0].name ="�������";
		
		cars[1].wheelCount = 4;
		cars[1].color="black";
		cars[1].name ="���׽ý�";
		
		cars[2].wheelCount = 4;
		cars[2].color="silver";
		cars[2].name ="�ҳ�Ÿ";
		
		
		Car cs1; // int���� ���� float���� �Ǽ� String�� ���ڿ� Car���� Car; new+������ => �����ڴ� Ŭ������();
		Car cs2; // �޼��� �Ҽ� ������ �ݵ�� �ʱ�ȭ ����� �Ѵ�.
		Car cs3;
		
//		System.out.println(cs2); new�� ����߸� �ּҰ��� ���� �� �ִ�.
		
		
		cs1 = new Car(); //1. �޸𸮿� �ø���
		cs1.name ="���׽ý�"; // 2. �޸𸮿� �ö� �ִ� Car�� �̸� cs1�̰� �� �ȿ� �ִ� ���� name���ٰ� "���׽ý�"�� ����
							//�⺻Ÿ���� �ƴϸ� �ʱ�ȭ�� �� �ִ� ���� Null �ۿ� ����
		
		
		for(int i=0; i<cars.length;i++) {
			System.out.println(cars[i].name+"�� ���� ������ " + cars[i].wheelCount+"���̰� ������ "+cars[i].color+"�Դϴ�.");
		}
		
		for (Car a1 : cars) {
			System.out.println(a1.name+"�� ���������� "+a1.wheelCount + "���̰� ������"+a1.color+"�̴�");
		}
		
		
	}
}
