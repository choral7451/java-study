package classExam;

// Ŭ���� ����
class FishBread {
	
	public String fishCode; // �ؾ ��ȣ
	public String inside; // �ؾ�� ��(���)
	public String flourCode;; // �а��� ������
	
	public void showFish () {
		System.out.println("��ȣ : " + fishCode);
		System.out.println("��� : " + inside);
		System.out.println("������ : " + flourCode);
		System.out.println();
	}
	
	
}


public class FishBreadMain {

	public static void main(String[] args) {
		
		FishBread fi = new FishBread();
		
		fi.fishCode = "001��";
		fi.inside = "��";
		fi.flourCode = "�ѱ�";
		
		fi.showFish();
		
		FishBread fi2 = new FishBread();
		
		fi2.fishCode = "002��";
		fi2.inside = "��ũ��";
		fi2.flourCode = "�̱���";
		
		fi2.showFish();

	}

}
