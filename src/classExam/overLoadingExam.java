package classExam;

class OverLoadingTest {
	int add (int a, int b) {
		return a + b;
	}
	long add (long a, long b) {
		return a - b;
	}
	
	
	// �Ķ������ ������ Ÿ���� �ٸ����
//	String add (String a, String b, String c) {
//		return a + c;
//	}
}

public class overLoadingExam {

	public static void main(String[] args) {
		OverLoadingTest ov = new OverLoadingTest();
		
		System.out.println(ov.add(10, 20)+"int");
//		System.out.println(ov.add(10, 20)+"long");
		
		
//		System.out.println(ov.add("10", "20", "30"));
		
	}

}
