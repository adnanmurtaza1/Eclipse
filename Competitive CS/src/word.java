/*
ID: adnanam1
LANG: JAVA
TASK: word
*/
import java.util.*;
import java.io.*;

;public class word{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("word.in"));
		PrintStream outfile= new PrintStream(new FileOutputStream("word.out"));
		//Scanner sc = new Scanner(System.in);
		int words = sc.nextInt();
		int max = sc.nextInt();
		
		String tempLine = "";
		int count = 0;
		for(int x = 1; x <= words; x++)
		{
			String word = sc.next();
			if(word.length() + count <= max)
			{
				if(count == 0)
					tempLine = word;
				else
					tempLine = tempLine + " " + word;
				
				count = count + word.length(); 
			}
			else
			{
				outfile.println(tempLine);
				tempLine = "";
				count = 0;
				tempLine = word;
				count = count + word.length();
			}
		}
		if(tempLine.length() > 0)
			outfile.println(tempLine);

		sc.close();
		outfile.close();
	}

}