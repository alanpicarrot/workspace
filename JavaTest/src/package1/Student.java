package package1;

public class Student {

	int score = 80;

	public void play(int hours) {
		score -= hours;
	}

	public void study(int hours) {
		score += hours;
	}

	public static void main(String[] args) {

		Student student1 = new Student();
		Student student2 = new Student();

		student1.play(2);
		student2.study(3);

		System.out.println(student1.score);
		System.out.println(student2.score);

	}

}
