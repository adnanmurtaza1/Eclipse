/*
ID: adnanam1
LANG: JAVA
TASK: gift1
*/
import java.util.*;
import java.io.*;

;public class gift1{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("gift1.in"));
		PrintStream outfile= new PrintStream(new FileOutputStream("gift1.out"));
		int people = sc.nextInt();
		String[] names = new String[people];
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int x = 1; x <= people; x++)
		{
			String temp = sc.next();
			names[x-1] = temp;
			map.put(temp, 0);
		}
		
		for(int y = 1; y <= people; y++)
		{
			String name = sc.next();
			int amount = sc.nextInt();
			int dist = sc.nextInt();
			if(dist == 0)
			{
				map.put(name, map.get(name) + amount);
				continue;
			}
			int give = amount/dist;
			int left = amount - give*dist;
			for(int z = 1; z <= dist; z++)
			{
				String giveName = sc.next();
				map.put(giveName, map.get(giveName) + give);				
			}
			map.put(name, map.get(name) - amount + left);
		}
		
		for(int a = 0; a < people; a++)
		{
			String name = names[a];
			outfile.println(name + " " + map.get(name));
		}
		
		sc.close();
		outfile.close();
	}

}