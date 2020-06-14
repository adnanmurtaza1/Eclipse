/*
ID: adnanam1
LANG: JAVA
TASK: triangles
*/
import java.util.*;
import java.io.*;

;public class triangles{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("triangles.in"));
		PrintStream outfile= new PrintStream(new FileOutputStream("triangles.out"));
		
		//Scanner sc = new Scanner(System.in);
		int points = sc.nextInt();
		ArrayList<int[]> arr = new ArrayList<int[]>();
		for(int x = 1; x<= points; x++)
		{
			int[] temp = new int[2];
			temp[0] = sc.nextInt();
			temp[1] = sc.nextInt();
			arr.add(temp);
		}
		int max = Integer.MIN_VALUE;
		for(int a = 0; a < arr.size(); a++)
			for(int b = 0; b < arr.size(); b++)
				for(int c = 0; c < arr.size(); c++)
				{
					int area;
					int[] p1 = arr.get(a);
					int[] p2 = arr.get(b);
					int[] p3 = arr.get(c);
					if(Arrays.equals(p1, p2) || Arrays.equals(p1, p3) || Arrays.equals(p2, p3))
						continue;
					if(isValid(p1[0], p1[1], p2[0], p2[1], p3[0], p3[1]))
					{
						area = Math.abs(p1[0]*(p2[1] - p3[1]) + p2[0]*(p3[1] - p1[1]) + p3[0]*(p1[1] - p2[1]));
						if(area > max)
							max = area;
					}
				}
		//System.out.println(max);
		
		
		outfile.println(max);
		sc.close();
		outfile.close();
	}
	
	public static boolean isValid(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		boolean xside = false;
		boolean yside = false;
		if(y3 == y2 || y3 == y1 || y1== y2)
			xside = true;
		if(x1 == x2 || x1 == x3 || x2  == x3)
			yside = true;
		
		if(yside && xside)
			return true;
		return false;
	}

}