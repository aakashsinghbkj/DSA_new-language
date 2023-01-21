import java.util.Scanner;

public class ex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st number: ");  
        int a = sc.nextInt();

        System.out.print("Enter the 2nd number: ");  
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The sum of the two numbers are" + " " + sum);
    }
}