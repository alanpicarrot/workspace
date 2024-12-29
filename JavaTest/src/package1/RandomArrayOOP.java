package package1;

public class RandomArrayOOP {

	public int[][] getRandomArray() {

		int[][] intArray = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				intArray[i][j] = (int) (Math.random() * 31);

			}
		}
		return intArray;
	}

	public void printArray(int[][] intArray) {

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		
		RandomArrayOOP ra = new RandomArrayOOP();
		int[][]x = ra.getRandomArray();
		int[][]y = ra.getRandomArray();
		int[][]z = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++){
				z[i][j] = x[i][j] +y[i][j];
			}
		}ra.printArray(z);
	}
}
