import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		int[][] schoolScore = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int koSum = 0;
		int engSum = 0;
		int mathSum = 0;

		String[] cls = {"����","����","����"};
		
//		System.out.println("1��° �л��� ���� ������ �Է��ϼ���. ");
//		schoolScore[0][0] = sc.nextInt();
//		System.out.println("1��° �л��� ���� ������ �Է��ϼ���. ");
//		schoolScore[0][1] = sc.nextInt();
//		System.out.println("1��° �л��� ���������� �Է��ϼ���. ");
//		schoolScore[0][2] = sc.nextInt();
//		
//		System.out.println("2��° �л��� ���� ������ �Է��ϼ���. ");
//		schoolScore[1][0] = sc.nextInt();
//		System.out.println("2��° �л��� ���� ������ �Է��ϼ���. ");
//		schoolScore[1][1] = sc.nextInt();
//		System.out.println("2��° �л��� ���������� �Է��ϼ���. ");
//		schoolScore[1][2] = sc.nextInt();
//		
//		System.out.println("3��° �л��� ���� ������ �Է��ϼ���. ");
//		schoolScore[2][0] = sc.nextInt();
//		System.out.println("3��° �л��� ���� ������ �Է��ϼ���. ");
//		schoolScore[2][1] = sc.nextInt();
//		System.out.println("3��° �л��� ���������� �Է��ϼ���. ");
//		schoolScore[2][2] = sc.nextInt();

//		for (int i = 0; i < schoolScore.length; i++) { // ��
//			for (int j = 0; j < schoolScore[0].length; j++) { // ĭ
//				switch (j) {
//				case 0:
//					System.out.println((i + 1) + "�� ° �л��� ���������� �Է��ϼ���");
//					schoolScore[i][j] = sc.nextInt();
//					break;
//				case 1:
//					System.out.println((i + 1) + "�� ° �л��� ���������� �Է��ϼ���");
//					schoolScore[i][j] = sc.nextInt();
//					break;
//				case 2:
//					System.out.println((i + 1) + "�� ° �л��� ���������� �Է��ϼ���");
//					schoolScore[i][j] = sc.nextInt();
//					break;
//				}
//			}
//		}
		for(int i=0;i<schoolScore.length;i++) {
			for(int j=0;j<schoolScore[0].length;j++) {
				System.out.println((i+1)+"�� ° �л��� "+cls[j]+"������ �Է��ϼ���");
				schoolScore[i][j] = sc.nextInt();
			}
		}
		
		
		for (int i = 0; i < 3; i++) {
			koSum += schoolScore[i][0];
			engSum += schoolScore[i][1];
			mathSum += schoolScore[i][2];
		}
		System.out.println("============�� ���� �� ������============");
		System.out.println("���� :" + koSum + "��\n���� :" + engSum + "��\n���� :" + mathSum + "��");
		System.out.println("\n============�� ���� �� �����=============");
		System.out.println("���� :" + (koSum / 3) + "��\n���� :" + (engSum / 3) + "��\n���� :" + (mathSum / 3) + "��");

	}

}