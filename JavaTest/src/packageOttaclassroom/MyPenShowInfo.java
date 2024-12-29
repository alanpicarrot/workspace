package packageOttaclassroom;

public class MyPenShowInfo {
	
	public void p(String s) {	//worker method
			
		System.out.println(s);
			
	}
		
	public void showInfo() {	//calling method
		
		p("Brand is : "+ "brand");	
		p("Price is : "+ "price");
		
	}
		
	public static void main(String[] args) {
		
		MyPenShowInfo mypenshowinfo = new MyPenShowInfo(); //Main method 中指定類別建立物件
		mypenshowinfo.showInfo();//在物件中呼叫類別中定義的方法
		
			
		}
}
