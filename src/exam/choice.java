package exam;

import java.util.Scanner;

public class choice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���
		// ���α׷��� �������� �帧�� �����ϴ� ���
		// -> ������ �帧�� �����ϰ� �̶� ��ɹ��� ���� ����.
		// ���� : ���ǹ�, �ݸ�,
		
		// ����� ���ϴ� ��ɹ����� �߰�ȣ�� �ѷ��׿��� ����
		// �߰�ȣ ������ ����̶� Ī��
		
		// ���ǹ�
		// �־��� ���ǽ��� ����� ���� ������ ����� �����ϵ��� �ϴ� ���.
		
		
		// ����
		// ��꿡���� ������ �ο��ϴ� ���α׷��� �ۼ��ϼ���
		// 1. ����� 100���� �̻��̸� ������ 10������ ����.
		// 2. �׷��� ������ ������ 2������ ����.
		
		Scanner in = new Scanner(System.in);
		
		int tax = 0;
		
		System.out.println("����� �Է��� �ּ���");
		int money = in.nextInt();
		
		if( money >= 1000000 ) {
			tax = 100000;
		} else {
			tax = 20000;
		}
		
		System.out.println("���: "+ money);
		System.out.println("����: "+ tax);
		
	}

}
