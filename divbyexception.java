package myprogram;

import java.util.Scanner;

     public class divbyexception {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, result;
        char s ;
        do { 
        System.out.print("Program to perform division\n");
        System.out.print("Enter num-1 : ");
        num1 = scan.nextInt();
        System.out.print("Enter num-2 : ");
        num2 = scan.nextInt();
         try{
         result = num1/num2;
         System.out.println("The result is " +result);
        }
        catch(Exception e) {
        System.out.println(e.getMessage());
        }
         finally {
             System.out.print("End of Operation\n");
            }
        System.out.print("Do you want to continue? y/n\n");
        s = scan.next().charAt(0);
        }while(s == 'Y' || s == 'y');
        System.out.print("Exited!");
       }
}