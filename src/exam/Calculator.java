package exam;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[]args) {
		//���� �����
		//���� ��� �ּһ���
		//1. �ּ� 2�� �̻��� ���ڸ� �Է¹�����(2���� ok)
		//2. �Է¹��� 2���� ������ ��Ģ������ �����ؾ��Ѵ�.
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("ó��° �� �Է�");
		int a = in.nextInt();
		
		System.out.println("�ι�° �� �Է�");
		int b = in.nextInt();
		
		System.out.println("�����");
		System.out.println("���� : " + (a+b));
		
		// ���� ��ɰ��� 1(����)
		// ���� a�� b���� ������ b-a�� �����ϼ���
		
		int result = (a < b) ? b - a : a - b;
		System.out.println("���� : "+ result);
		System.out.println("���� : "+ (a*b));

		
		// ���� ��ɰ��� 2(����)
		// ���� a�� b���� ������ b/a�� �����ϼ���
		int result2 = (a < b) ? b/a : a/b;
		System.out.println("������ : "+ result2);
	}

}
