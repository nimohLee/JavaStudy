package Student_EX;

import java.util.Scanner;

public class ScoreManager {

	public static void main(String[] args) {

		Student st[] = new Student[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < st.length; i++)
			st[i] = new Student();

		for (int i = 0; i < st.length; i++) {

			System.out.println("학생 이름을 입력하세요");
			st[i].name = sc.next();

			System.out.println("학번을 입력하세요");
			st[i].number = sc.nextInt();

			System.out.println("국어 점수를 입력하세요");
			st[i].kor = sc.nextInt();

			System.out.println("영어 점수를 입력하세요");
			st[i].eng = sc.nextInt();

			System.out.println("수학 점수를 입력하세요");
			st[i].math = sc.nextInt();

		}

		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].number + "번 " + st[i].name + " 학생의 평균은 " + (st[i].kor + st[i].eng + st[i].math) / 3
					+ "점이고, 총합은 " + (st[i].kor + st[i].eng + st[i].math) + "점이며, 국어 " + st[i].kor + "점, 영어 " + st[i].eng
					+ "점, 수학 " + st[i].math + "점 입니다.");

		}

	}
}
