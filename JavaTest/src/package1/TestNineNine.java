package package1;

public class TestNineNine {
	
	public static void main(String[] args) {
//		for while寫法		
//		int nineNine = 0;		
//		
//		for(int i=1;i<=9;i++) {
//			
//			int j = 1;
//			
//			while(j<=9) {
//				
//				nineNine = i*j;
//				System.out.println(nineNine);
//				j++;
//								
//			}
//			
//		}	
//		for do while 寫法
//		int nineNine = 0;
//		
//		for(int i=1;i<=9;i++) {
//			int j = 1;
//			do {
//				nineNine = i*j;
//				System.out.println(nineNine);
//				j++;
//			}while(j<=9);			
//		}
//		while do while 寫法		
		int i = 1;
		while(i<=9) {
			int j = 1;
			do{				
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				if(j%9==0) {
					System.out.println();
				}
				j++;				
			}while(j<=9);		
			i++;
		}
	}
}
