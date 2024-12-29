package packageOttaclassroom;

public class Array {

	public static void main(String[] args) {

		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				int r = (int) (Math.random() * 31);

				x[i][j] = r;
				System.out.print(x[i][j]+"\t");

			}System.out.println();
		}System.out.println("===================");
		
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				int r = (int) (Math.random() * 31);

				y[i][j] = r;
				System.out.print(y[i][j]+"\t");

			}System.out.println();
		}System.out.println("===================");
		
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				z[i][j] = x[i][j]+y[i][j];
				System.out.print(z[i][j]+"\t");

			}System.out.println();
		}
	}
}
