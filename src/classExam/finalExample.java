package classExam;


class Person {
//	final String nation = "���ѹα�";
	final String nation;
	static String ssn;
	String name;
	
	public Person(String ssn, String name, String nation) {
		this.ssn = ssn;
		this.nation = nation;
		this.name = name;
	}
}
public class finalExample {
	
	public static void main(String[] args) {
		Person p1 = new Person("831124-1221341", "���ڵ�", "�ε�");
		
		System.out.println(p1.nation);
//		
//		System.out.println(p1.name);
//		System.out.println(p1.ssn);
//		System.out.println(p1.nation);
		
		System.out.println("========================���뼱=====================");
		
		p1.name ="���ڵ�";
		p1.ssn = "122234-5678901";
		
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		System.out.println(p1.nation);
		
	
	}

}
