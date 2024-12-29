package package1;

public class TestBMI {

	public static void main(String[] args) {
		
		double bmi = 0;
		double weight = 74.6;
		double height = 1.76;
		
		bmi = weight/(height*height);// 或是使用 Math.pow(height, 2)
		
		if(24>bmi && bmi>=18.5) {
			System.out.println("正常");
		}else if(bmi>=24) {
			System.out.println("過胖");
		}else {
			System.out.println("過瘦");
		}
		
	}
	
}
