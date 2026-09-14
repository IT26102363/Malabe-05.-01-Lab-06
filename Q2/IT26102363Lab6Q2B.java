import java.util.Scanner;

public class IT26102363Lab6Q2B {
    public static void main(String[] args) {
        
		int numbers[] = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
		
		for(int i=0; i<10; i++){
			System.out.print("Enter number " + (i+1) + ": ");
			numbers[i] = input.nextInt();
		}
		
		System.out.println("The numbers you entered are:");
		for(int a=0; a<10; a++){
			System.out.print(numbers[a] + " ");
		}
	}
}