package module01_06;
/*
 * 此範例為測為型別晉升與型別轉換
 */
public class TestCast {

	public static void main(String[] args) {
		int i = 1;
		double d = 11.1;
		double sum1 = i + d;//12.1
		int sum2 = (int)(i + d);//12
		System.out.println(sum1);
		System.out.println(sum2);
		byte b1 = 0;
		b1 +=1; //隱含轉型，即 b1 = (byte)(b1 + 1);
		System.out.println(b1);
	}

}
