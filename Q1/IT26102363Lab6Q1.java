import java.util.Scanner;

public class  IT26102363Lab6Q1 {

    public static void main(String[] args) {
		
		double number;
		double squ;
		double squroot;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		number = input.nextInt();
		
		squ = number*number;
		squroot = Math.sqrt(number);
		
		System.out.println("The Square of " + number + " is: " + squ);
		System.out.print("The Square root of " + number + " is: " + squroot);
    }
}