package module09_11;
/*
 * 觀察方法傳入參數之間與回傳值的對應
 */
public class TestCalculator {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
	    
	    int sum1 = myCalculator.sum(1,2);//不同的參數用的是不同的sum method
	    System.out.println(sum1);

	    float sum2 = myCalculator.sum(3.0f, 4.0f);//不同的參數用的是不同的sum method
	    System.out.println(sum2);

	    float sum3 = myCalculator.sum(5, 6.0f);//不同的參數用的是不同的sum method
	    System.out.println(sum3);

	}

}
