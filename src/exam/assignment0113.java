package exam;

import java.util.Scanner;

public class assignment0113 {

 

	public static void main(String[] args) {

//		����1 ���������� �����Ͽ� ����Ͻÿ�

 

//		   ����1) data�� �谳��, ���ߺ�, �븮, 3000000�� ����

//		          �������� ����  name,department,position,sal�� �Ұ�

//		   ����2)����� �Ʒ��� ���� �޼���(�Լ�)�� �̿��Ͻÿ�

//

//		--���--

//		�̸� : �谳��      ---> println

//		�μ� : ���ߺ�     ---> printf  

//		���� : �븮       ---> print 1�����Ἥ ����,�޿����

//		�޿� : 3000000��

 

//		Scanner sc = new Scanner(System.in);

//		

//		String name, department, position;

//		int sal = 0;

//	

//		System.out.println("�̸��� �Է��� �ּ���.");

//		name = sc.next();

//		

//		System.out.println("������ �Է��� �ּ���.");

//		department = sc.next();

//		

//		System.out.println("������ �Է��� �ּ���.");

//		position = sc.next();

//		

//		System.out.println("������ �Է��� �ּ���.");

//		sal = sc.nextInt();

//		

//		System.out.println("�̸� : " + name);

//		System.out.printf("�μ� : %s%n", department);

//		System.out.print("���� : " + position + "\n�޿� : " + sal);

 

 

 

//		���� 2

 

//		�ΰ��Ǽ��� �Է¹ް� ���� ū���� ����غ�����

//		ex) ù��°���� 5 �ι�°���� 7�� �Է��̵Ǹ�

//		      ��������

//		      �� ū�� : 7

 

//		Scanner sc = new Scanner(System.in);

//		

//		System.out.println("ù��° ���� �Է����ּ���.");

//		int a = sc.nextInt();

//		System.out.println("�ι�° ���� �Է����ּ���.");

//		int b = sc.nextInt();

//		

//		if( a>b ) {

//			System.out.println("�� ū�� : " + a );

//		} else {

//			System.out.println("�� ū�� : " + b );

//		}

 

 

 

//		����3 

 

//		53130���� ����� ���� ȭ���� ������ ���Ͻÿ�.

 

//		money = 53130��

//		���� = 5

//		õ�� = 3

//		��� = 1

//		�ʿ� = 3

		

//		int money = 53130;

//		

//		System.out.println("���� : " + money/10000);

//		System.out.println("õ�� : " + (money/1000)%10);

//		System.out.println("��� : " + (money/100)%10);

//		System.out.println("�ʿ� : " + (money/10)%10);

		

		

		

		

		

//		����4 

//		�Էµ� ���ڰ� �빮���̸� �ҹ��ڷ� ����ϰ�

//		�ҹ����̸� �빮�ڷ� ��ȯ�Ͽ� ����Ͻÿ�

//		�׿��� �����̸� "�Էµ���Ÿ����"��� ǥ���Ͻÿ�

		

//		String text = "Hello World";

//		

//		System.out.println(text.toUpperCase());

//		System.out.println(text.toLowerCase());

 

 

//		����5

//		�������� �����ϴ� ��¥�� �Է¹ް�

//		��¥���� ������ �޼����� ����ϼ���

//

//		������~����� : ����� �� �ߵ���?

//		�ݿ��� : �ұ��� �ְ��Դϴ� ����

//		�����~ �Ͽ��� : �����մϴ� ����

//

//		ex) ����� �����ϴ� ��¥�� �Է����ּ��� -> ����� �Է�

//		      -> ��°�� : ����� �� �ߵ���?

 

//		Scanner sc = new Scanner(System.in);

//

//

//

//		System.out.println("����� �����ϴ� ���� �Է����ּ���.");

//		String day = sc.next();

//		

//		switch (day) {

//			case "������" : System.out.println("����� �� �ߵ���?");

//				break;

//			case "ȭ����" : System.out.println("����� �� �ߵ���?");

//				break;

//			case "������" : System.out.println("����� �� �ߵ���?");

//				break;

//			case "�����" : System.out.println("����� �� �ߵ���?");

//				break;

//			case "�ݿ���" : System.out.println("�ұ��� �ְ��Դϴ�.");

//				break;

//			case "�����" : System.out.println("�����մϴ�.");

//				break;	

//			case "�Ͽ���" : System.out.println("�����մϴ�.");

//				break;

//			default: System.out.println("�ùٸ� ������ �Է����ּ���.");

//				break;

//		}

		

//		����6

		

//		4���� ���� �ֿܼ��� �Է¹޾� ó���Ͻÿ�

//		        ����) ���� : M �̸� "����", ������ "����" 

//		             (���׿����� �̿�)

//

//		Input name: �迬��

//		Input gender: F

//		Input age:  35

//		Input tall: 192.3 

//

//		--���--

//		�̸� : �迬��

//		���� : ���� 

//		���� : 35��

//		���� : 192.3cm  

		

		Scanner sc = new Scanner(System.in);

		

		System.out.println("�̸��� �Է����ּ���.");
		String name = sc.next();

	

		System.out.println("������ �Է����ּ���. (m/f)");
		String gender = sc.next();
		

		char g = gender.charAt(0);
		

		gender = ( g == 'm') ? "����" :  "����" ;
	

		System.out.println("���̸� �Է����ּ���.");
		int age = sc.nextInt();

		

		System.out.println("������ �Է����ּ���.");
		Double tall = sc.nextDouble();

		

		System.out.println("�̸� : " + name);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("���� : " + tall);

		

		

		

//		����6

//		1~100�����Ǽ� �߿���  3�� ����̸鼭 7�� ��� ���ϱ� 

//		      ����) for���� && �����ڸ� �ݵ�� �̿�

		

//		for(int i = 1 ; i < 101 ; i++) {

//			if( i%3 == 0 && i%7 == 0 ) {

//				System.out.println("��� �� : " + i);

//			}

//		}

		

		

		

		

//		����7

//		[�� ������ ������ �����ϱ��� Ǯ�����]

//		 2�ڸ��� ������ �߻��Ͽ� �߻��� ���ڸ� ���ߴ� ���� ���α׷��� �ۼ��ϼ���

//		     �����߻�) 1. int a=(int)(Math.random()*100) : 0 - 99 ������ ����

//		                   2. �� import java.util.Random;

//		                      �� Random ����1 = new Random();

//		                      �� int ����2 = ����1.nextInt(�ִ밪); 

//		                               ==>  0 ~ (�ִ밪 - 1)������ ������ ��

//

//		[������]

//

//		*** ������ �߻��Ͽ����ϴ�...���߾� ������...*** 

//

//		���� �Է� : 50

//		��ǻ���� ���ڰ� �� Ů�ϴ�..

//

//		���� �Է� : 90

//		��ǻ���� ���ڰ� �� �۽��ϴ�..

//

//		          :

//

//		���� �Է� : 83

//		��ī��ī...xx������ ���߼̽��ϴ�...

		

//		Scanner sc = new Scanner(System.in);

//		

//		int a = (int)(Math.random()*100);

//		int num = 0;

//		

//		System.out.println("*** ������ �߻��Ͽ����ϴ�...���߾� ������...*** ");

//		while(true) {

//			int i = sc.nextInt();	

//			num++;

//			if( i > a ) {

//				System.out.println("���� �Է� : " + i);

//				System.out.println("��ǻ���� ���ڰ� �� Ů�ϴ�..");

//			} else if ( i < a ) {

//				System.out.println("���� �Է� : " + i);

//				System.out.println("��ǻ���� ���ڰ� �� �۽��ϴ�..");

//			} else if ( i == a ) {

//				System.out.println("���� �Է� : " + i);

//				System.out.println("��ī��ī..."+num+"������ ���߼̽��ϴ�...");

//				break;

//			} else {

//				System.out.println("�߸��� ���� �Դϴ�.");

//			}

//		}

	}

}