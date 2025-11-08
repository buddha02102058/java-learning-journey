import java.util.Scanner;

public class practice {
    public static void main(String[]args){
        System.out.println("Hello, welcome to the program and follow the instructions");
        int x , y , sum , difference , product , quotient , remainder;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first integer:");
        x = scan.nextInt();
        System.out.println("Enter second integer:");
        y = scan.nextInt();
        sum = x + y;
        difference = x - y; 
        product = x * y;
        quotient = x / y;
        remainder = x % y;
        System.out.println("The addition of the two numbers is: " + sum);
        System.out.println("The subtraction of the two numbers is: " + difference);
        System.out.println("The multiplication of the two numbers is: " + product);
        System.out.println("The division of the two numbers is: " + quotient);
        System.out.println("The modulus of the two numbers is: " + remainder);

    }
}