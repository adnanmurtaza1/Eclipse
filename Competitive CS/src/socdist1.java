/*
ID: adnanam1
LANG: JAVA
TASK: socdist1
*/
import java.util.*;
import java.io.*;

;public class socdist1{

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner sc = new Scanner(new File("socdist1.in"));
		//PrintStream outfile= new PrintStream(new FileOutputStream("socdist1.out"));
		Scanner sc = new Scanner(System.in);
		int[] largest = {Integer.MIN_VALUE, Integer.MIN_VALUE};
		int[] second = {Integer.MIN_VALUE, Integer.MIN_VALUE};
		int[] beg = {Integer.MIN_VALUE, Integer.MIN_VALUE};
		int[] end = {Integer.MIN_VALUE, Integer.MIN_VALUE};
		
		int size = sc.nextInt();
		String farm = sc.next();
		int D = Integer.MAX_VALUE;
		int count = 0;
		for(int x = 0; x < size; x++)
		{
			if(farm.substring(x, x+ 1).equals("0"))
					count++;
			else
			{
				if(count < D)
					D = count;
				if(count > largest[0])
				{
					second[0] = largest[0];
					second[1] = largest[1];
					largest[0] = count;
					largest[1] = x - count;
					count = 0;
				}
				else if(count > second[0])
				{
					second[0] = count;
					second[1] = x - count;
					count = 0;
				}
				count = 0;
			}
		}
		int large = largest[0];
		int sec = second[0];
		int first = -1;
		int last = -1;
		if(largest[1] == 0)
		{
			first = largest[0];
			large = -1;
		}
		else if(largest[1] + largest[0] == size)
		{
			last = largest[0];
			large = -1;
		}
		if(second[1] == 0)
		{
			first = second[0];
			sec = -1;
		}
		else if(second[1] + second[0] == size)
		{
			last = second[0];
			sec = -1;
		}
		
		
		
		

		sc.close();
		//outfile.close();
	}
	
	public static int[] regLastResort(int slot)
	{
		int[] temp = {-1, -1};
		if(slot == -1)
			return temp;
		
		temp[0] = (slot-1)/2 + 1;

		
			
	}

}