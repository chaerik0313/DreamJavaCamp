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
		System.out.println("순록을 잡아요~~");
	}
	public void run() {
		System.out.println("시속 40km로 뛰어");
	}
	public void dogInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.getAge() + "살");
		System.out.println("종류 : " + this.getKind());
	}
}
