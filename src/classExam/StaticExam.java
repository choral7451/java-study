package classExam;

class MemberCall {
	int iv = 100; // �ν��Ͻ� ���� ����
	static int  cv = 250; // Ŭ���� ���� ����
	
	int iv2 = cv; // Ŭ���� �ʵ��� ���� �ν��Ͻ� �ʵ忡 ����
//	static int cv2 = iv; // Ŭ���� �ʵ忡 �ν��Ͻ� �ʵ尪�� �����ϴ°��� �Ұ�
	static int cv2 = new MemberCall().iv; //��ä ���� ������� ��ȸ�ϴ� ����� ������.
	
	void instanceMethod1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod1() {
		System.out.println(iv);
		System.out.println(cv);
	}
}

public class StaticExam {
	public static void main(String[] args) {
		MemberCall me = new MemberCall();
		
		System.out.println(me.cv);
		System.out.println(me.iv);
		System.out.println(me.iv2);
	}	
}
