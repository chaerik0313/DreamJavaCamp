package dreamschool.cscourse.chapter09;

public class Dog extends Animal{
	private String name;
	public Dog(int age, String kind,String name) {
		super(age, kind);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void hunt() {
		System.out.println("������ ��ƿ�~~");
	}
	public void run() {
		System.out.println("�ü� 40km�� �پ�");
	}
	public void dogInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.getAge() + "��");
		System.out.println("���� : " + this.getKind());
	}
}
