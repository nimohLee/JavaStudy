package Constructor;

public class Rect { // 사각형 클래스
	private int width;
	private int height;
	
	void setSize(int w, int h) {
		if(w>=1000) {
			w=1000;
		}
		
		if(h>=1000) {
			h=1000;
		}
		this.width = w;
		this.height = h;
	}
	
	void printSize() {
		System.out.println("너비: "+width+","+"높이: "+height);
	}

}
