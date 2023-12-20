package Pack1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

		PrintWriter pw = null;

		String s;

		// exception handling = basically we use to not get the red error (ex i used an
		// int in a string scanner)
		try {
			pw = new PrintWriter(new FileOutputStream("pargol.txt", true));//the true it adds to the file instead of deleting the file and starting all over again
		
		
		
		
		
		} catch (FileNotFoundException e) {
			System.out.println("the file doesn't exist");
			s = kb.nextLine();
			System.exit(0);
		}

		
		
		System.out.println("please give me first name and last name: ");
		s = kb.nextLine();
		pw.println("your first and last name is: " + s);
		
		
		System.out.println("please give me your adress: ");
		s = kb.nextLine();
		pw.println("your adress is: " + s);
		
		System.out.println("please give me your school name: ");
		s = kb.nextLine();
		pw.println("your school name is: " + s);
		
		pw.println("==========End Record=============");
		pw.close();
		kb.close();
		
		
		
		
		
		
		
		
	}

}
