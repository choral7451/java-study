package exam;

public class Conversion {

	public static void main(String[] args) {
		// ������(����ȯ)
		// ���� �ٸ� �ڷ����� ������� ������ ���� �ϳ��� �ڷ������� �����ϴ� ��
		
		// ������ �� ��ȯ(�ڵ� �� ��ȯ)
		// 
		
		// ����� �� ��ȯ(���� �� ��ȯ)
		String num = "1234";
		int test = Integer.parseInt(num);
		System.out.println(test);
		
		int a = 10;
		int b = 20;
//		System.out.println(test1+(int)(a+b));
		
		// ������ �����͸� ���������� �ٲٱ�
		
		// �Ǽ��� / �ֱ� �Ǽ�Ÿ���� ������ ����Ҷ��� float ���� double�� ���� ���
		
		float c = 123.45f;
		System.out.println(c);
		
		double d = 123.34;
		System.out.println(d);
		
		
		// double���� ����� Ÿ�� ��ȯ
		int testDb = 11;
		int testDb2 = 3;
		
		
		// ������ 3.0 : ���� - java���� int�� ������ ������� ������ int������ ���
		double result2 = (double) testDb / testDb2;
		System.out.println(result2);
		
	}
}
