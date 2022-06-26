package myprogram;
import java.util.Scanner;
import java.io.*;

public class integerfile {

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
		FileOutputStream fout = new FileOutputStream("num10.txt");
		Scanner scan = new Scanner(System.in);
		System.out.print("no of elements :");
		int n = scan.nextInt();
		System.out.print("Enter Elements\n");
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the number " +i +":\n");
			int num = scan.nextInt();
			fout.write(num);
		}
		System.out.print("Number added\n");
		int i=0;
		FileInputStream  fin1 = new FileInputStream("num10.txt");
		while((i=fin1.read())!=-1)
		{
			System.out.print(i);
			System.out.print("\t");
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
