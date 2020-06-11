/*
ID: adnanam1
LANG: JAVA
TASK: beads
*/
import java.util.*;
import java.io.*;

;public class beads{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("beads.in"));
		PrintStream outfile= new PrintStream(new FileOutputStream("beads.out"));
		
		int size = sc.nextInt();
		String beads = sc.next();
		String test = beads + beads + beads;
		int max = 0;
		for(int x = 0; x < size; x++)
		{
			String left = reverseString(test.substring(0, x + size));
			String right = test.substring(x + size);
			int value = testColor(findColor(left), left) + testColor(findColor(right), right);
			if(value > max)
				max = value;
		}
		if(max > size)
			max = size;
		outfile.println(max);

		sc.close();
		outfile.close();
	}
	
	public static int testColor(String color, String s)
	{
		int count = 0;
		int x = 0;
		while(x < s.length() && (s.substring(x, x + 1).equals(color) || s.substring(x, x + 1).equals("w")))
		{
			x++;
			count++;
		}
		return count;
	}
	
	public static String findColor(String s)
	{
		int count = 0;
		while(count < s.length() && s.substring(count, count + 1).equals("w"))
		{
			count++;
		}
		if(count > s.length() - 1)
			return "b";
		String color = s.substring(count, count + 1);
		return color;
	}
	
	public static String reverseString(String s)
	{
		String temp = "";
		int count = s.length() -1;
		while(count > -1)
		{
			temp = temp + s.substring(count, count + 1);
			count--;
		}
		return temp;
	}

}