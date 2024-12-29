package package1;

public class RandomArray2 {
	
	public static void main(String[] args) {
		RandomArray2 ra = new RandomArray2();
		int[][] x = ra.getRandomArray();
		int[][] y = ra.getRandomArray();
		int[][] z = new int[3][3];
		
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		ra.printArray(x);
		ra.printArray(y);
		ra.printArray(z);
	}
	
	
	public int[][] getRandomArray() {
		int[][] data = new int[3][3];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = (int)(Math.random() * 31);
			}
		}
		return data;
	}
	
	public void printArray(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=======================");
	}
	
}
