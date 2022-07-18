package Method;

public class Gugu {

	int a;
	int b[];

	public void setNum(int i, int j) {

		b = new int[j];
		a = i;
		for (int x=1; x<=j; x++) {
			b[x-1] = x;
		}
	}

	public void showData() {
		for (int i=0; i < b.length; i++) {
			System.out.println(a +"x"+b[i]+"="+ (a * b[i]));

		}
	}

}