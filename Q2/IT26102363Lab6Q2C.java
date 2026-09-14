import java.util.Scanner;

public class IT26102363Lab6Q2C {
    public static void main(String[] args) {
        
		int numbers[] = new int[10];
		int sum=0;
		double avg;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
		
		for(int i=0; i<10; i++){
			System.out.print("Enter number " + (i+1) + ": ");
			numbers[i] = input.nextInt();
		}
		
		System.out.println();
		
		System.out.println("The numbers you entered are:");
		for(int i=0; i<10; i++){
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0; i<10; i++){
			sum = sum + numbers[i];
		}
		avg= sum/10.0;
		System.out.println("Sum of the numbers is: " + sum);
		System.out.println("Average of the numbers is: " + avg);
		
	}
}