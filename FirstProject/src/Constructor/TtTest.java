package Constructor;

class Timetables {
	void ttable(int x) {

		for (int i = 1; i < 10; i++) {
			System.out.println(x + "x" + i + "=" + x * i);
		}

	}
}

public class TtTest {
	public static void main(String[] args) {
		Timetables tt = new Timetables();
		tt.ttable(2);
	}
}
