
abstract class HttpServlet {
	public abstract void service();
}

public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServelt());
		method(new FileDownloadServlet());
	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}

class LoginServelt extends HttpServlet {

	@Override
	public void service() {
		System.out.println("�α��� �մϴ�.");
	}
}

class FileDownloadServlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("���� �ٿ�ε� �մϴ�.");
	}
}