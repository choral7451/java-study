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
		
//		Scanner in = new Scanner(System.in);
//		
//		int tax = 0;
//		
//		System.out.println("����� �Է��� �ּ���");
//		int money = in.nextInt();
//		
//		if( money >= 1000000 ) {
//			tax = 100000;
//		} else {
//			tax = 20000;
//		}
//		
//		System.out.println("���: "+ money);
//		System.out.println("����: "+ tax);
		
		
//		String stu1 = "���л�";
//		
//		if(stu1 == "����л�") {
//			System.out.println("û�����б��� ���� �ֽ��ϴ�.");
//		} 
		
//		�������� ������ ������ ���ǹ�(else if)	
//		���̺� ��ݰ�� ���α׷�
		
//		�ڵ忡�� �ʿ��Ѱ͵�
//		������ ����(����), ���,
		
//		���� 
//		1. 0-6�� ����� ���� �ʴ´�.
//		2. 7-12�� ������ �Ƶ����� �з�. ����� 5000���� �޴´�.
//		3. 13-19���� û�ҳ����� �з� ����� 10000���� �޴´�.
//		4. 20�� ���ʹ� �������� �з� ����� 15000���� �޴´�.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int age;
//		int charge;
//		
//		System.out.println("���̸� �Է��� �ּ���");
//		
//		age = sc.nextInt();
//		
//		if( age < 7 ) {
//			System.out.println("����� 0�� �Դϴ�.");
//		} else if ( age < 13 ) {
//			System.out.println("����� 5,000�� �Դϴ�.");
//		} else if ( age < 20 ) {
//			System.out.println("����� 10,000�� �Դϴ�.");
//		} else if ( age >= 20 ) {
//			System.out.println("����� 15,000�� �Դϴ�.");
//		}
		
//		�ǽ�����
//		���� �Է¹ް� ����  0~100 ���̸�
//		�Է��� ���� '�Է¹��� ��' �Դϴ�.�� ����Ͻð�
//		100���� ū ���� �ʹ� ū ���� �Է��ϼ̽��ϴ�. �� ���
//		0���� ���� ���� �Է��ߴٸ� ������ �Է¹��� �� �����ϴ�. �� ���
		
//		Scanner sc = new Scanner(System.in);
//		
//		int value;
//		System.out.println("���� �Է����ּ���.");
//		value = sc.nextInt();
//		
//		if( value >= 0 && value <= 100 ) {
//			System.out.println("�Է��� ��: " +value);
//		} else if ( value > 100 ) {
//			System.out.println("�ʹ� ū ���� �Է��ϼ̽��ϴ�.");
//		} else if ( value < 0 ) {
//			System.out.println("������ �Է¹��� �� �����ϴ�.");
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݾ��� �Է����ּ���.");
		int price;
		int coke = 1000;
		
		price = sc.nextInt();
		System.out.println("�ݾ� : " + price);
		
		if( price > coke ) {
			System.out.println("���� �ܾ��� : " + (price - coke));
		} else if ( price == coke ) {
			System.out.println("�ܾ��� �����ϴ�.");
		} else if ( price < coke ) {
			System.out.println("�ܾ��� �����Ͽ� �ݶ� ���� �� �����ϴ�.");
		}
			
		
	}

}
