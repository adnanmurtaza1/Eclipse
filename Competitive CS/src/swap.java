/*
ID: adnanam1
LANG: JAVA
TASK: swap
*/
import java.util.*;
import java.io.*;

;public class swap{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("swap.in"));
		PrintStream outfile= new PrintStream(new FileOutputStream("swap.out"));
		//Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt(); 
		
		k = k%362880;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int x  = 1; x <=n; x++)
		{
			arr.add(x);
		}
		for(int turns = 1; turns <= k; turns++)
		{
			arr = reverse(arr, a1, a2);
			arr = reverse(arr, b1, b2);
		}

		for(int t = 0; t < arr.size(); t++)
			outfile.println(arr.get(t));
		
		sc.close();
		outfile.close();
	}
	
	public static ArrayList<Integer> reverse(ArrayList<Integer> arr, int beg, int end)
	{
		beg = beg - 1;
		end = end - 1;
		while(beg != end && beg < end)
		{
			int temp = arr.get(beg);
			arr.set(beg, arr.get(end));
			arr.set(end, temp);
			beg++;
			end--;
		}
		return arr;
	}

}