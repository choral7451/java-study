package exam;

import java.util.Arrays;
import java.util.Scanner;

public class quiz0114 {

	public static void main(String[] args) {
//		[����1] for���� �̿��Ͽ� �������� ���Ͻÿ�
//
//		x�� ���� �Է��Ͻÿ� : 3
//		y�� ���� �Է��Ͻÿ� : 3
//		3�� 3���� 27
//
//		[����2] 50���� ������ ���� ������ ���� ����Ͻÿ�
//		       ����1) 0 - 100 ������ �� �ϰ�
//		       ����2) 1�ٿ� 6���� ǥ���Ͻÿ�  
//
//		--���--
//		12      72      74      0       20      89
//		84      83      53      0       95      53
//		68      55      89      6       20      68
//		17      9       75      56      17      85
//		62      33      7       34      85      28
//		28      55      95      31      69      22
//		30      92      1       16      88      80
//		64      55      71      12      29      72
//		20      41
//		��=2420
		
		
		// ���� 1
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("x�� ���� �Է��Ͻÿ�");
//		int x = sc.nextInt();
//		int result = 1;
//		
//		System.out.println("y�� ���� �Է��Ͻÿ�");
//		int y = sc.nextInt();
//		
//		for(int i = 0 ; i < y ; i++) {
//			result = result*x;
//		}
//		
//		System.out.println(x+"�� "+y+"�� ��"+ result+"�Դϴ�.");
//		
		// ���� 2
		
		int[][] arr = new int[9][6];
		int sum = 0;
		
		for( int i = 0 ; i < 9 ; i++ ) {
			if( i == 8) {
				for( int j = 0 ; j < 2  ; j++) {
					arr[i][j] = (int)(Math.random()*100);
					sum += arr[i][j];;		
				}
			} else {
				for( int j = 0 ; j < 6  ; j++) {
					arr[i][j] = (int)(Math.random()*100);	
					sum += arr[i][j];
				}
			}		
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("�� = " + sum);
	
	}

}
