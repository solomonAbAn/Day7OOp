package Pack1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyProgram {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		//sysout to a text file = PrintWriter class from java library
		PrintWriter pw = new PrintWriter(new FileOutputStream("Infor.txt"));

		Scanner kb = new Scanner(System.in);

		System.out.println("please give me your name: ");

		String s = kb.nextLine();

		pw.println("the name is: " + s);

		System.out.println("please give me your adress");
		
		String ad = kb.nextLine();
		
		pw.println("the adress is " +  ad);
		
		
		pw.close();//don't forget this --> to save the file
		kb.close();
		
		
		
		
		
		
		
		
		
	}

}
