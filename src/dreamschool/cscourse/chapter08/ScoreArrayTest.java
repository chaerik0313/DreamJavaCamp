package dreamschool.cscourse.chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		
		int[] score = {93, 87, 90};
		String[] subjects = {"����", "����", "����"};
		int totalScore = 0;
		double avg = 0;
		
		for (int i = 0; i < subjects.length; i++) {
				System.out.println(subjects[i] + " : " + score[i]);
				totalScore += score[i];
				avg = totalScore / score.length;
			}		
		System.out.println("���� : " + totalScore);
		System.out.println("��� : " + avg);
	}

}
