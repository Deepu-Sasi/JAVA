package myprogram;
import java.util.Scanner;

class trycatchfinally {
    public static void main(String[] args)
    {
        int a , b , c , result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a:");
        a=scan.nextInt();
        System.out.print("Enter b:");
        b=scan.nextInt();
        System.out.print("Enter c:");
        c=scan.nextInt();
        try {
            result = a / (b - c);
            System.out.println("result :" + result);
        }
  
        catch (ArithmeticException e) {
            System.out.println("Exception caught:Division by zero");
        }
  
        finally {
            System.out.println("I am in final block");
        }
    }
}