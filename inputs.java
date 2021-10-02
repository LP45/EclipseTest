package practiceLabProblems;
import java.util.Scanner;
public class inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade;
		Scanner scan = new Scanner(System.in);
//		System.out.println("What is your grade?");
//		grade = scan.nextInt();
//		if(grade > 90 && grade <100) {
//			System.out.println("A");
//		}
//		else if(grade > 80 && grade <90) {
//			System.out.println("B");
//		}
//		else if(grade > 70 && grade <80) {
//			System.out.println("C");
//		}
//		else if(grade > 55 && grade <70) {
//			System.out.println("D");
//		}
//		else if(grade < 55) {
//			System.out.println("F... Your TRASH");
//		}
//		else if(grade > 100) {
//			System.out.println("A++++++++++");
//		}
		
		
//		System.out.println("Which Day is your favorite day?");
//		int days;
//		String oneThruSeven;
//		days = scan.nextInt();
//		switch(days) {
//		case 1: oneThruSeven = "monday";
//				break;
//		case 2: oneThruSeven = "tuesday";
//		break;
//		case 3: oneThruSeven = "wednesday";
//		break;
//		case 4: oneThruSeven = "thursday";
//		break;
//		case 5: oneThruSeven = "friday";
//		break;
//		case 6: oneThruSeven = "saturday";
//		break;
//		case 7: oneThruSeven = "sunday";
//		break;
//		default: oneThruSeven = "Invalid DAy!";
//		break;
//		}
//		System.out.println(oneThruSeven);
		
		System.out.println("Enter any number");
		int num;
		num= scan.nextInt();
		if(num %2 == 0) {
			if(num >2 && num <=5) {
			System.out.println("Not Cool :)");
			}
			if(num > 6 && num < 20 ) {
			System.out.println("Cool");
			}
			if(num > 20) {
			System.out.println("Not Cool");
			}
			
		}	
		else if(num % 2 ==1){
        	System.out.println("ODD");
        }
		
		
			
		
		
		
	}

}
