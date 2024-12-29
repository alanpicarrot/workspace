package package1;

public class quizsamplecode2 {
	
public static void main() {
	
	int sum = 0, number = 3;

	if (number % 2 == 0) {

	    System.out.println(sum++);

//	    break; 只能用在loop跟switch

	} else {

	    for (int i = 0; i < number; i++) {

	        sum += i;

	    }

	    System.out.println(sum);

	}

	
}
	
	
	
}
