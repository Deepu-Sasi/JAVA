package myprogram;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;



public class lineoftext {

	public static void main(String[] args) {
		String a;
		char[] data = new char[25];
		Scanner scan = new Scanner(System.in);
		
		File f = new File ("Sample.txt");
		try {
			boolean status =f.createNewFile();
			if(status) {
				System.out.println("The new file created");
			}else {
				System.out.println("The file already exist");
			}
			System.out.println("Enter the data :");
			a=scan.nextLine();
			FileOutputStream fout = new FileOutputStream("Sample.txt");
			BufferedWriter fw = new BufferedWriter(new FileWriter("Sample.txt"));
			fw.write(a);
			System.out.println("Data is added");
			fw.close();
			int i=0;
			FileInputStream fin = new FileInputStream("Sample.txt");
			BufferedReader br = new BufferedReader(new FileReader("Sample.txt"));
			br.read(data);
			br.close();
			
			
			/*while((i=fin.read())!=-1)
			{
				char c =(char)i;
				System.out.println(c);
			}*/
			System.out.println(a.length());
			//BufferedWriter bw = new BufferedWriter(new FileWriter("Sample.txt"));
			/*FileReader fr = new FileReader("Sample.txt");
			fr.read(data);*/
			System.out.println(data);
			//fr.close();
		}catch(Exception e)
		{
			System.out.println("An error occurred...");
		}
		// TODO Auto-generated method stub

	}

	private static void getBytes(char[] data) {
		// TODO Auto-generated method stub
		
	}

}
