package classExam;


class Test { // class ��ü�� �ﳻ������ Ʋ 
	// ��ü�� �Ӽ�(��� ����)
	public String stuName;
	public int stuID;
	
	
	
	// ��ü�� ���(�޼���)
	// 1. �л��� ������ ���� �޼���
	
	public void showStudentInfo() {
		
		//������(�Լ���) ������ ǥ��� 
		// 1. PascalCase(�Ľ�Į ǥ���)
		//    - �ܾ���̻��� ���� �빮�ڷ� ǥ�������ν� �ܾ ����
		//
		// 2. camelCase(ī�� ǥ���)
		//    - ù���� ���� �ܾ� ���̻��� ���� �빮�ڷ� ǥ�������ν� �ܾ ����
		//
		// 3. snake_case(������ũǥ���(�����/������ھ� ǥ���))	
		//    - �ܾ� ���̻��̸��� _�� ǥ�������ν� �ܾ ����
		
		System.out.println( stuName + stuID);
	}
}

public class Student {

		public static void main(String[] args) {
			
			// ������ ������ TestŬ������ ��ü�� ����
			// �ν��Ͻ� : Ŭ������ ���� ������ ��ü 
			
			Test stuLee = new Test();
			// �ν��Ͻ� stuLee�� ������� stuName�� "�Ӽ���" �Ӽ��ο�
			stuLee.stuName = "�Ӽ���";
			stuLee.stuID =  001;
			
			// stuLee �ν��Ͻ��� showStudentInfo �޼��� ȣ��
			stuLee.showStudentInfo();
			
			Test stu002 = new Test();
			
			stu002.stuName = "������";
			stu002.stuID = 002;
			
			stu002.showStudentInfo();
			
			System.out.println(stuLee);
			System.out.println(stu002);
			

		}
}
