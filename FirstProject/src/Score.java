import java.util.Scanner;

public class Score {
	
	public static void main(String[] args) {
		int[][] schoolScore = new int[3][3];	
		Scanner sc = new Scanner(System.in);
		int koSum=0;
		int engSum=0;
		int mathSum=0;
		
		
		
//		System.out.println("1번째 학생의 국어 점수를 입력하세요. ");
//		schoolScore[0][0] = sc.nextInt();
//		System.out.println("1번째 학생의 영어 점수를 입력하세요. ");
//		schoolScore[0][1] = sc.nextInt();
//		System.out.println("1번째 학생의 수학점수를 입력하세요. ");
//		schoolScore[0][2] = sc.nextInt();
//		
//		System.out.println("2번째 학생의 국어 점수를 입력하세요. ");
//		schoolScore[1][0] = sc.nextInt();
//		System.out.println("2번째 학생의 영어 점수를 입력하세요. ");
//		schoolScore[1][1] = sc.nextInt();
//		System.out.println("2번째 학생의 수학점수를 입력하세요. ");
//		schoolScore[1][2] = sc.nextInt();
//		
//		System.out.println("3번째 학생의 국어 점수를 입력하세요. ");
//		schoolScore[2][0] = sc.nextInt();
//		System.out.println("3번째 학생의 영어 점수를 입력하세요. ");
//		schoolScore[2][1] = sc.nextInt();
//		System.out.println("3번째 학생의 수학점수를 입력하세요. ");
//		schoolScore[2][2] = sc.nextInt();
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				switch(j) {
				case 0:
					System.out.println((i+1)+"번 째 학생의 국어점수를 입력하세요");
					schoolScore[i][j] = sc.nextInt();
					break;
				case 1:
					System.out.println((i+1)+"번 째 학생의 영어점수를 입력하세요");
					schoolScore[i][j] = sc.nextInt();
					break;
				case 2:
					System.out.println((i+1)+"번 째 학생의 수학점수를 입력하세요");
					schoolScore[i][j] = sc.nextInt();
					break;
				}
			}
		}
		
		for(int i=0;i<3;i++) {
			koSum += schoolScore[i][0];
			engSum += schoolScore[i][1];
			mathSum += schoolScore[i][2];
		}
			System.out.println("===========각 과목 별 총합은===========");
			System.out.println("국어 :"+koSum+"점\n영어 :"+engSum+"점\n수학 :" + mathSum+"점 입니다.");
		    System.out.println("\n============각 과목 별 평균은=============");
		    System.out.println("국어 :"+(koSum/3)+"점\n영어 :"+ (engSum/3) + "점\n수학 :"+(mathSum/3)+"점 입니다."); 
		
		System.out.println();
	
	
	}
	
	
	
}
