package Constructor;

public class Rect { // 사각형 클래스
	int width;
	int height;
	
	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	void printSize() {
		System.out.println("너비: "+width+","+"높이: "+height);
	}

}
