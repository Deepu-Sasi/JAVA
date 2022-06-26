package myprogram;

import java.io.*;
class characters extends Thread
{
	public void run() {
		
			System.out.println("a");
			System.out.println("b");
			System.out.println("c");
			System.out.println("d");
			System.out.println("e");
	}
}
class integers extends Thread
{
	public void run() {
		int i;
		for(i=1;i<6;i++)
			System.out.println(i);
	}
}

public class thread {

	public static void main(String[] args) {
		characters obj1=new characters();
		integers obj2=new integers();
		obj1.start();
		obj2.start();
		// TODO Auto-generated method stub

	}

}
