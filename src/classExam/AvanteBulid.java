package classExam;


class newAvante {
	
	int bt;
	int sp;
	int oil;
	
	public void speedUp () {
		sp++;
	}
	
	public void showCar () {
		System.out.println("���͸� : "+ bt);
		System.out.println("�ӵ� : "+ sp);
		System.out.println("�⸧ : "+ oil);
	}
	
}


public class AvanteBulid {

	public static void main(String[] args) {

		newAvante a1 = new newAvante();
		
		a1.bt = 20;
		a1.sp = 60;
		a1.oil = 40;
		
		a1.speedUp();
		a1.speedUp();
		a1.speedUp();
		a1.speedUp();
		a1.speedUp();
		a1.showCar();
	}

}
