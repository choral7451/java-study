package classExam;

class FishBreadUp {
	String cream;
	
	FishBreadUp (String cream) {
		this.cream = cream;
	}
	
}

public class FishMain {

	public static void main(String[] args) {
		FishBreadUp fish1 = new FishBreadUp("��ũ��");
		FishBreadUp fish2 = new FishBreadUp("����");
		FishBreadUp fish3= new FishBreadUp("��");
		
		
		System.out.println(fish1.cream);
		System.out.println(fish2.cream);
		System.out.println(fish3.cream);

	}

}
