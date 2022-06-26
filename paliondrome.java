package myprogram;

import java.util.Scanner;

public class paliondrome {

public static void main(String[] args) {
int i;
String a,b="";
Scanner scan=new Scanner(System.in);
System.out.println("Enter the word:");
a=scan.nextLine();
int n = a.length();
        for(i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equals(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }



// TODO Auto-generated method stub

}

}