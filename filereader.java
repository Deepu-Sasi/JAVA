package myprogram;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class filereader {

	public static void main(String[] args) {
		String a;
		char[] data = new char[100];
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
			FileWriter fout = new FileWriter("content1.txt");
			BufferedWriter fw = new BufferedWriter(new FileWriter("content1.txt"));
			fw.write(a);
			System.out.println("Content added");
			fw.close();
			int i=0;
			FileReader fin = new FileReader("content1.txt");
			BufferedReader br = new BufferedReader(new FileReader("content1.txt"));
			br.read(data);
			br.close();
			System.out.println(data);
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
