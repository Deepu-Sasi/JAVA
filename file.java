package myprogram;
import java.util.Scanner;
import java.io.*;

public class file {

	public static void main(String[] args) throws IOException {
		file fin= new file();
		if(fin.exists())
		{
			System.out.println("exists");
			
		}else
		{
			fin.createNewFile();
			System.out.println("file created");
			
		}
		FileOutputStream fout = new FileOutputStream("num1.txt");
		Scanner scan = new Scanner(System.in);
		System.out.print("no of elements :");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter the number :");
			int num = scan.nextInt();
			fout.write(num);
		}
		int i=0;
		FileInputStream  fin1 = new FileInputStream("num1.txt");
		while((i=fin1.read())!=-1)
		{
			System.out.print(i);
		}
		
		// TODO Auto-generated method stub

	}

	boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	void createNewFile() {
		// TODO Auto-generated method stub
		
	}

}
