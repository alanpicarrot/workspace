package package1;

public class TestBMI {
	
	public static void main(String[] args) {
		// step 1 : 宣告變數暫存身高/體重
		double weight = 65, height = 1.8;
		
		// step 2 : 算出bmi顯示出來
		double bmi = weight / Math.pow(height, 2);
		System.out.println("BMI = " + bmi);
		System.out.printf("BMI = %.2f%n", bmi);
		
		// step 3 : 藉由bmi結果顯示為過瘦/正常/過重
		if (bmi < 18.5) {
			System.out.println("過瘦");
		} else if (bmi >= 24) {
			System.out.println("過重");
		} else {
			System.out.println("正常");
		}
		
		
		
	}

}
