package exam;

public class For {

	public static void main(String[] args) {
		// for��
				// �ݺ����� ����, while���� �ٸ���
				// �ݺ��� ���۽� ������ ���������� ������ �����ϴ� ����
				
				//for (�ʱ��; ���ǽ�; ������){
				//
				//}
				
				//10���� �ȳѾ�� ���� ����.
//				int tree = 0;
//				for (int i=1; i<11; i++){
//					System.out.println("������ ������ "+i+"��° ������ϴ�.");
//				}
				//while vs do-while vs for
				//���� ������� ���̸� �����Ѱ�?
				//while : ���� ����� ��/���� �̰ų�, ����ڰ� ���ϴ� ��Ȳ������ ���α׷��� �����Ҷ�
				//do-while : ���� ����� ��/���� �̰ų�, ����ڰ� ���ϴ� ��Ȳ������ ���α׷��� �����Ҷ�
				//for : Ư�� ���� ����, Ƚ���� �����Ͽ� �ݺ��ɶ� ���, �迭�� ������ ����.
				
				//for���� �ʱ��, ���ǽ�, �������� ������ ����.
				//������ ��Ʈ������ Ǫ�� �����
//				int i=0;
//				for(;;) {
//					i++;
//					System.out.println("������ ������ "+i+"��° ������ϴ�.");
//				}

				//for�� ��뿹��2
				//1~10���� ���� ���ϵ� ¦���� ����
//				int result = 0;
//				for(int i=0; i<10; i++) {
//					if(i%2!=0) {
//						result = result + i;// result +=i
//					}
//					if(i%2==0) {
						//continue : �ش� Ű���带 ������ �ݺ����� ó������ �ǵ��ư��� Ű����
						// ��Ȳ������ �ݺ��� �����ϰ� ���� �ʴٸ� ����ϴ� Ű����
//						continue;
//					}
//					result = result + i;
//				}
//				System.out.println(result);
		
//		for���� ����
//		������.
//		int number = 3;
//		for( int i = 1 ; i < 10; i++ ) {
//			System.out.println("������ : " + number +" * "+i + " = " + number*i);
//		}
		
//		for���� ��ø
		
		for( int i = 2 ; i < 10 ; i++ ) {
			System.out.println("������ "+i+"��");
			for ( int j = 1 ; j < 10 ; j++ ) {
				System.out.println("������ : " + i +" * "+j + " = " + i*j);
			}	
			System.out.println("");
		}
	}

}
