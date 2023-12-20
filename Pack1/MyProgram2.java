package Pack1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyProgram2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		PrintWriter pw = null;
		
		String s;
		
		//exception handling = basically we use to not get the red error (ex i used an int in a string scanner)
		try {
			pw = new PrintWriter(new FileOutputStream("pargol.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("the file doesn't exist");
			s = kb.nextLine();
		}
		System.out.println("please give me your name: ");

		s = kb.nextLine();

		pw.println("the name is: " + s);

		System.out.println("please give me your adress");
		
		String ad = kb.nextLine();
		
		pw.println("the adress is " +  ad);
		
		
		pw.close();//don't forget this --> to save the file
		kb.close();
		
		
		
		//flush is used to refresh it but it is not important
		
		
		
	}

}
