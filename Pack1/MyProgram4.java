package Pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String s;
		
		Scanner kb = new Scanner(System.in);
		
		Scanner sc = null;
		
		int id1, id2, id3;
		
		
		try {
			sc = new Scanner(new FileInputStream("infor.txt"));
		
		
		
		} catch (FileNotFoundException e) {
		
			System.out.println("the file doesn't exist.");
			System.exit(0);
			
		}
		
		
		System.out.println("the info that i read");
		
		s = sc.nextLine();
		System.out.println(s);
		
		id1 = sc.nextInt();//we repeat the same thing to read the next line in the text file
		s = sc.nextLine();
		
		id2 = sc.nextInt();//reading the next integer
		s = sc.nextLine();//reading the next line
		
		
		
		
		System.out.println(id1);
		System.out.println(id2);
		
	}

}
