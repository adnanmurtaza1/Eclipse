/*
ID: adnanam1
LANG: JAVA
TASK: whereami
*/
import java.util.*;
import java.io.*;

;public class whereami{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("whereami.in"));
		PrintStream outfile= new PrintStream(new FileOutputStream("whereami.out"));
		//Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String road = sc.next();
		int num = 1;
		for(int k = 1; k <= n; k++)
		{
			boolean works = true;
			int index = 0;
			while(index + k <= n)
			{
				if(road.indexOf(road.substring(index, index + k)) != road.lastIndexOf(road.substring(index, index + k)))
				{
					works = false;
					break;
				}
				index++;
			}
			if(works == true)
			{
				num = k;
				break;
			}			
		}

		
		//System.out.println(num);
		outfile.println(num);
		sc.close();
		outfile.close();
	}

}