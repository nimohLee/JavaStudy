package Student_EX;

import java.util.Scanner;

public class ScoreManager {

	public static void main(String[] args) {

		Student st[] = new Student[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < st.length; i++)
			st[i] = new Student();

		for (int i = 0; i < st.length; i++) {

			System.out.println("�л� �̸��� �Է��ϼ���");
			st[i].name = sc.next();

			System.out.println("�й��� �Է��ϼ���");
			st[i].number = sc.nextInt();

			System.out.println("���� ������ �Է��ϼ���");
			st[i].kor = sc.nextInt();

			System.out.println("���� ������ �Է��ϼ���");
			st[i].eng = sc.nextInt();

			System.out.println("���� ������ �Է��ϼ���");
			st[i].math = sc.nextInt();

		}

		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].number + "�� " + st[i].name + " �л��� ����� " + (st[i].kor + st[i].eng + st[i].math) / 3
					+ "���̰�, ������ " + (st[i].kor + st[i].eng + st[i].math) + "���̸�, ���� " + st[i].kor + "��, ���� " + st[i].eng
					+ "��, ���� " + st[i].math + "�� �Դϴ�.");

		}

	}
}