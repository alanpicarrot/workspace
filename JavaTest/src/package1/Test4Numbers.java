package package1;

public class Test4Numbers {
	
	public static void twentyFour(){
		
		int fourNumbers = 0;
		
			for(int count=0;count<=25;count++) {
				fourNumbers = 4*count;
				System.out.println(fourNumbers);
				if(fourNumbers%5==0) {
					System.out.println();
				}
			}
		
	}
	

	public static void main (String[] args) {
		
		twentyFour();
		
	}
	
}
