/*
ID: adnanam1
LANG: JAVA
TASK: race
*/
import java.util.*;
import java.io.*;

;public class race{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("race.in"));
		PrintStream outfile= new PrintStream(new FileOutputStream("race.out"));
		//Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int n = sc.nextInt();
		int[] speeds = new int[n];
		int[] answers = new int[n];
		for(int q = 1; q <= n; q++)
			speeds[q-1] = sc.nextInt();
			
		for(int x = 0; x < speeds.length; x++)
		{
			int maxSpeed = speeds[x];
			int start = maxSpeed;
			while(sum(start) > limit)
				start--;
			int soFar = start;
			int moves = 1;
			int num = start;
			boolean go = true;
			while(go)
			{
				if(sum(num + 1) + soFar <= limit)
					num++;
				else if(sum(num) + soFar > limit)
					num--;
				
				if(sum(num) + soFar == limit)
				{
					moves = moves + num;
					break;
				}
				
				moves = moves + 1;
				soFar = soFar + num;
				
				if(soFar == limit)
					go = false;
			}
			answers[x] = moves;		
		}
		
		for(int p = 0; p < answers.length; p++)
			outfile.println(answers[p]);

		sc.close();
		outfile.close();
	}
	
	public static int sum(int x)
	{
		return ((x+1)*x)/2;
	}

}