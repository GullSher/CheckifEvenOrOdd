import java.util.Scanner;
public class CheckifEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		//Prompt the user to enter any number
		System.out.println("Please Enter any Number.");
		double check1 = scanner.nextDouble();
		
		if (check1 % 2 == 0) {
			System.out.println("You Entered a Even Number " + check1);
			
		} else {
			System.out.println("You Entered a Odd Number " + check1);
		}
		scanner.close();

	}

}
