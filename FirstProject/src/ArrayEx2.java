import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] x= new int[10];
		for(int i=0;i<10;i++)
			x[i]=1;
		
		System.out.println(Arrays.toString(x));
		
		int[][] k = new int[5][10];
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				k[i][j]=0;
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				System.out.println(k[i][j]);
			}
		}
		
		
	}
}
