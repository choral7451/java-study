package exam;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class codingTest {
	
	public static void main(String[]args){
		
		
		/*
		 * ���ڰ� �־����� ��(0����) ���ڵ��� �̾� �ٿ� ���� �� �ִ� ���� ū ���� ã�� �����Դϴ�.
		 * 
		 * ���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ����
		 * ���� ū ���� 6210�Դϴ�.
		 * 
		 * 0 �Ǵ� ���� ������ ��� �迭 find_biggest_num�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ����
		 * ���ڿ��� �ٲپ� return �ϵ��� find_biggest �Լ��� �ۼ����ּ���.
		 * 
		 * ���� ���� find_biggest_num�� ���̴� 1 �̻� 1000 �����Դϴ�. find_biggest_num�� ��Ҵ� 0 �̻� 1000
		 * �����Դϴ�. ������ �ʹ� Ŭ �� ������ ���ڿ��� �ٲپ� return �մϴ�. ����� �� numbers return [6, 10, 2]
		 * "6210" [3, 30, 34, 5, 9] "9534330"
		 */
				
		String numbers = "182";
		List<Integer> solution = new ArrayList<>();
		
		int a = Integer.parseInt(numbers);
		int size = 0;
		int result = 0;
		int k = 2;
		
		for(int i = 0 ; i < 8 ; i++) {
			if( a/10 > 0 ) {
				a = a/10;
				size++;
			}
		}
		
		int d = Integer.parseInt(numbers);
		
		for (int i = 0 ; i <= size ; i++ ) {
			solution.add(d%10);
			d = d/10;
		}

		Collections.shuffle(solution);
		
		System.out.println(solution);
		
		for(int i = 0 ; i < size ; i++) {
			for( int j = 0 ; j <= solution.get(i) ; j++ ) {
				if (solution.get(i)/k == 0) {
					result++;
				}
				k++;
			}
			
			
		}
		
		System.out.println(result);
		
	}
}
