package classExam;

class CarTest {
	//
	String model;
	int speed;

	//������
	CarTest (String model) {
		this.model = model;
	}
	
	void setSpeed (int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(50);
	}// run method end
	
}

public class calssKeyword {
		

	public static void main(String[] args) {
		
		CarTest car1 = new CarTest("2021�ƹݶ�N");
		CarTest car2 = new CarTest("���� SŬ����");
		
		System.out.println(car1.model);
		
		car1.run();
		car2.setSpeed(80);
		
		System.out.println("car1 speed : " + car1.speed);
		System.out.println("car1 speed : " + car2.speed);
		
		// this, static, final, super
		
		// �ν��Ͻ� �ɹ�
		// ��ü�� ������ �Ŀ� ����� �� �ִ� �ʵ�, �޼���
		// �ν��Ͻ� �ʵ�� �޼���� ��ü�� �Ҽӵ� �ɹ��̱� ������
		// ��ü(�ν��Ͻ�) ���̴� ����� �����.
		
		
		// this 
		// ��ü���� �ν��Ͻ� �ɹ��� �����ϱ����� ����ϴ� Ű����
		// this -> ���������� �ν��Ͻ� �ڽ��� ����Ų��.
		// this�� ����� �� �ִ°��� �ν��Ͻ� �ɹ����̴�.
		
		// this�� ��� �ν��Ͻ� �ż��忡 ������ ä�� ����.
		// this�� �����ڿ� �޼����� �Ű����� �̸��� �ʵ�� �����Ҷ�
		// �ν��Ͻ� �ɹ��� �ʵ����� ����ϰ��� �Ҷ� ���
		
		// ����
		// �ؾ������� FishBreadUp�̶�� Ŭ������ �������ּ���
		// ���� - ����Ŭ���� �̸�(main �޼��尡 ���� �Լ�) = FishName���� �������ּ���.
		

	}

}
