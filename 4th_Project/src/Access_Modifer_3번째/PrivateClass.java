package Access_Modifer_3��°;

class PrivateClass {
	private PrivateClass() { // �����ڰ� private
		
	}
	
	public static void main(String[] args) {
		PrivateClass p = new PrivateClass(); // Private �̹Ƿ� Ŭ���� ���ο����� ȣ�Ⱑ��
	}
}

class hi{
	public static void main(String[] args) {
		PrivateClass p = new PrivateClass(); // ������ Ŭ������ �ƴϹǷ� private�� ������ �� ����
	}
}