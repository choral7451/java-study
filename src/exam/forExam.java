package exam;

import java.util.Scanner;

public class forExam {

	public static void main(String[] args) {
		// for + �迭 -> ���� �Է¹޾Ƽ� ����ϱ�
		// 	1. �迭�� ũ�⸦ ����ڿ��� �Է�
		//	2. �迭�� ũ�⸸ŭ ���ڸ� �迭�� ����
		//  3. �迭�� ����ִ� ���ڸ� �˻�
		//
		//	�ʿ��� ����
		// 	1. �Է¹��� ������ ���� ����
			int count = 0;
		
		//	2. �Է¹��� �迭
			int[] num;
		
		// 	3. �˻��� ���� 
			int findNum = 0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("�Է��� ������ ���� ? : ");
			count = sc.nextInt();
			num = new int[count];
			
			System.out.println(count+"�� ��ŭ �Է����ּ���.");
			for( int i = 0 ; i < num.length ; i++ ) {
				num[i] = sc.nextInt();
			}
			
			boolean chk = false;
			
			System.out.println("�˻��� ���� ? : ");
			findNum = sc.nextInt();
			for(int i = 0 ; i < num.length; i++) {
				if(findNum == num[i]) {
					chk = true;
					System.out.println(findNum+"�� ��ġ��" + i + "��° �Դϴ�.");
				}
			}
			
			if(!chk) {
				System.out.println(findNum+"�� �������� �ʽ��ϴ�.");
			}
		
		
	}

}
