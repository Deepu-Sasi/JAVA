package myprogram;

import java.util.Scanner;

public class arith_trycatchthrow {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
       int num1, num2, result;
       System.out.print("Program to perform division\n");
       System.out.print("Enter num-1: ");
       num1 = scan.nextInt();
       System.out.print("Enter num-2: ");
       num2 = scan.nextInt();
       try{
           result = num1/num2;
           System.out.println("The result is " +result);
       } 
       catch (ArithmeticException div) {
          System.out.println ("Exception Thrown:" + div);
       }
       finally {
       System.out.print("I'm in the final block\n");
      }
 }

}