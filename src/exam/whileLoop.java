package exam;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ݺ���
		
		// 1. while ��
		//     - Ư���� ������ �����Ҷ����� ����ؼ� �־��� ��ɹ��� �ݺ� ����.
		
//			int a = 0;
//			while(a<10) {
//				a++;
//				System.out.printf("���� ��� �������̾�");
//				System.out.println();
//			}  
		// while���� ����
		// ������ �Ϸ����!(Ŀ�� Ÿ����)
		// �Ϸ��� Ŀ�Ǽ����� 5���� �����ϰ�
		// ���� Ŀ�ǰ� �� �ȸ��� ���α׷� ����.
		// Ŀ�ǰ� �� �Ⱦ����� �׳��� ���� ���� ����� ���.
			
//			Scanner sc = new Scanner(System.in);
//			
//			int coffee = 5;
//			int money = 0;
//			int result = 0;
//			
//			
//			
//			while(coffee > 0) {
//				System.out.println("�մ��� �Խ��ϴ�. Ŀ�Ǹ� �󸶿� �Ľðڽ��ϱ�?");
//				money = sc.nextInt();
//				result += money;
//				coffee--;
//				System.out.println("���� Ŀ��: " + coffee + "��");
//				System.out.println("�հ� : " + result);
//			}
//			
//			System.out.println("����: " + result);
			
//			����) ������ �Է¹޾� 80�� �̻��̸� �հݸ޽�����
//				�׷��� ������ ���հ� �޽����� ����ϴ� �۾��� �ݺ��ϴٰ�
//				0���� 100�� �̿��� ������ �ԷµǸ� �����ϴ� ���α׷��� �ۼ��غ�����.
			
			
			Scanner sc = new Scanner(System.in);
			
			int score = 0;
			
			while(true) {
				System.out.println("������ �������ּ���.");
				score = sc.nextInt();
				
				if( score >= 80 ) {
					System.out.println(score+"�� �հ�");
				} else if( score < 80 && score > 0) {
					System.out.println(score+"�� ���հ�");
				} else {
					System.out.println("�ùٸ� ������ �ƴմϴ�.");
					break;
				}
			}
			
			
		// 2. do/while ��
		// 3. for��
		// 4. Enhanced for��
	}

}
