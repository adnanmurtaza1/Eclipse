/*
ID: adnanam1
LANG: JAVA
TASK: breedflip
*/
import java.util.*;
import java.io.*;

;public class breedflip{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("breedflip.in"));
		PrintStream outfile= new PrintStream(new FileOutputStream("breedflip.out"));
		//Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		String real = sc.next();
		String fake = sc.next();
		int count = 0;
		int x = 0;
		while(x < len )
		{
			if(real.substring(x, x + 1).equals(fake.substring(x, x + 1)))
				x++;
			else
			{
				while(x < len)
				{
					if(!real.substring(x, x + 1).equals(fake.substring(x, x + 1)))
						x++;
					else
						break;
				}
				count++;
			}
		}
		//System.out.println(count);
		outfile.println(count);


		sc.close();
		outfile.close();
	}

}