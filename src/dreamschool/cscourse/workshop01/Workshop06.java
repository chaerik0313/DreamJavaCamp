package dreamschool.cscourse.workshop01;

public class Workshop06 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 10; dan++) {
				if (dan == 9){
					System.out.print(dan + " * " + i + " = " + (dan * i));
				}else{
					System.out.print(dan + " * " + i + " = " + (dan * i) + ",\t");
				}
			}
			System.out.println();
		}
	}

}
