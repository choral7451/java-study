package exam;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// switch���� ����
		// 1. �������� if������ �پ��.
		// 2. �����Ϸ� ���忡�� ����ȭ�� ������ �ӵ��� ������.
		
//		switch(���ǰ�) {
//			case ��1:
//				���ǿ� �´ٸ� �����ϴ� ��ɹ�:
//				break;
//			default :
//				���ǰ��� ��𿡵� �ش����� ������ �����ϴ� ��ɹ�;
//				break;
		char c = 'b';
		
		switch(c) {
			case 'i':
				System.out.println("�ش� ���ڴ� i�Դϴ�.");
			default:
				System.out.println("���� Ȥ�� �빮���Դϴ�.");
				break;
		}
	}

}
