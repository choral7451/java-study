package exam;

import java.util.Scanner;

public class input { 
	
	public static void main(String[]args){
		
		// Scanner Ŭ������ �̿��ؼ� ���α׷� ����ڷκ��� ������ �Է¹ޱ�
		
		// �����͸� �Է¹ޱ����� Scanner ��ü ����
		Scanner in = new Scanner(System.in);
		
		// next, nextline �޼��带 �̿��ؼ� ����ڷκ��� �����͸� �Է¹���
//		String test = in.next();
		
		// nextLine�� ���ڸ� �Է� �ݴ´�
//		String test2 = in.nextLine();
		
		// ���� �Է�, �Է¹��� �� �� ��ġ��
		int num = in.nextInt();
		int num2 = in.nextInt();
			
		// ���� String Ÿ������ ��ȭ�Ǿ� ��µȴ� ( ������ ����ȯ )
		// ���� int���� ���� ��ġ�� ���ڿ� ��ġ�� ������� �����Ѵ�.
		System.out.printf("�Է¹��� ���� : " + (num + num2));
//		
//		System.out.println(test);
//		System.out.println(test2);
		
	}

}
