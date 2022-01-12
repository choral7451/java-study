package exam;

import java.util.Scanner;

public class input { 
	
	public static void main(String[]args){
		
		// Scanner 클래스를 이용해서 프로그램 사용자로부터 테이터 입력받기
		
		// Scanner 메서드 
		// boolean : nextBoolean()
		// byte : nextByte()
		// short : nextShort()
		// long : nextLong()
		// float : nextFloat()
		// double : nextDouble()
		// Int :  nextInt()
		// String: next(), nextLine()
		// ** next()는 공백 전까지의 값을 입력 받음
		// ** 입력한 문자 전체를 입력받음(개행(엔터기준)을 기준으로 처리)
		
		// 데이터를 입력받기위해 Scanner 객체 생성
		Scanner in = new Scanner(System.in);
		
		// next, nextline 메서드를 이용해서 사용자로부터 데이터를 입력받음
//		String test = in.next();
		
		// nextLine은 문자를 입력 반는다
//		String test2 = in.nextLine();
		
		// 숫자 입력, 입력받은 두 수 합치기
		System.out.println("두수의 합을 계산하는 프로그램입니다.");
		System.out.println("첫번째 숫자를 입력해 주세요");
		int num = in.nextInt();
		System.out.println("첫번째 숫자를 입력해 주세요");
		int num2 = in.nextInt();
			
		// 값이 String 타입으로 변화되어 출력된다 ( 묵시적 형변환 )
		// 따라서 int값을 먼저 합치고 문자와 합치는 방식으로 변경한다.
		System.out.printf("입력받은 숫자 : " + (num + num2));
//		
//		System.out.println(test);
//		System.out.println(test2);
		
	}

}
