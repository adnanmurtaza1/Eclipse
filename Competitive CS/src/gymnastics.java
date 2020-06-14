/*
ID: adnanam1
LANG: JAVA
TASK: gymnastics
*/
import java.util.*;
import java.io.*;

;public class gymnastics{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("gymnastics.in"));
		PrintStream outfile= new PrintStream(new FileOutputStream("gymnastics.out"));
		//Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		for(int in = 0; in < k; in++)
		{
			arr.add(new ArrayList<Integer>());
			for(int to = 1; to <= n; to++)
			{
				arr.get(in).add(sc.nextInt());
			}
		}
		int count = 0;
		for(int a = 1; a <= n; a++)
		{
			for(int b = 1; b <= n; b++)
			{
				boolean yes = true;
				for(int list = 0; list < k; list++)
				{
					if(arr.get(list).indexOf(a) >= arr.get(list).indexOf(b))
					{
						yes = false;
						break;
					}
				}
				if(yes == true)
					count++;
			}
		}
		//System.out.println(count);
		outfile.println(count);
		sc.close();
		outfile.close();
	}

}