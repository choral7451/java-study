package classExam;

import java.util.Scanner;

public class function {

	public static void sayHi(String hello) {
		System.out.println(hello);
	}
	
	// 1���� �Ѿ�� �Ķ���ͱ��� ���� ����ϴ� �Լ�.
	// 100 -> ��������� 5050;
	
	public static int calSum(int num) {
	
		int sum = 0;
		
		for( int i = 1 ; i <= num ; i++ ) {
			sum += i ;
		}
		
		return  sum;
	}
	
	
	
	public static int hi(int x, int y) {
		
		int result = x*y;
		// return : �Լ��� �����ϰ� ��� ������ ��ȯ�� �� 
		return result;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// �μ��� ���� ���ϴ� �Լ�.
		// �μ�(argument) =
		// �Ű�����(parameter) =
		
//		String hello = "�ȳ��ϼ�";
//		
//		sayHi(hello); // ���� hello�� �Լ� sayHi�� ���޵� �μ�.
//		sayHi("�� ����ü ������ �𸣰ڳ� �Ф�");
		
//		int result = calSum(10);
//		System.out.println(result);
		
		System.out.println(hi(10, 20));
	}

}
