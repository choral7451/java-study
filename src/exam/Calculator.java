package exam;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[]args) {
		//���� �����
		//���� ��� �ּһ���
		//1. �ּ� 2�� �̻��� ���ڸ� �Է¹�����(2���� ok)
		//2. �Է¹��� 2���� ������ ��Ģ������ �����ؾ��Ѵ�.
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("��� ���α׷� �Դϴ�. ");
		System.out.println("ù��° ���ڸ� �Է��� �ּ���");
		int num = in.nextInt();
		System.out.println("��Ģ �����ڸ� ������ �ּ���( + - * / )");
		String a = in.next();
		System.out.println(a);
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���");
		int num2 = in.nextInt();
		int result;
		String result2 = new String("�߸��� ������ �Դϴ�.");
		
		if( a == "+") {
			result = num + num2;
			System.out.println(result);
		} else if ( a == "-") {
			result = num - num2;
			System.out.println(result);
		} else if ( a == "*") {
			result = num * num2;
			System.out.println(result);
		} else if ( a == "/") {
			result = num / num2;
			System.out.println(result);
		} else {
			System.out.println(result2);
		}
		
		
	}

}
