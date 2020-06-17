/*
ID: adnanam1
LANG: JAVA
TASK: photo
*/
import java.util.*;
import java.io.*;


;public class photo{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("photo.in"));
		PrintStream outfile= new PrintStream(new FileOutputStream("photo.out"));
		//Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int[] real = new int[max - 1];
		ArrayList<Integer> array = new ArrayList<Integer>();;
		for(int y = 0; y < max - 1; y++)
		{
			real[y] = sc.nextInt();
		}
		
		int first = real[0];
		for(int x = 1; x < first; x++)
		{
			if(first - x == x)
				continue;
			
			array = new ArrayList<Integer>();
			array.add(x);
			array.add(first - x);
			boolean works = true;
			int num = 2;
			while(works && num < max)
			{
				int next = real[num - 1] - array.get(num-1);
				if(next < 1 || next > max || array.indexOf(next) != -1)
				{
					works = false;
					break;
				}
				
				array.add(real[num - 1] - array.get(num - 1));
				num++;
			}
			if(array.size() == max)
				break;
		}
		
		for(int p = 0; p < array.size() - 1; p++)
			outfile.print(array.get(p) + " ");
		outfile.print(array.get(max - 1));
		outfile.println();
		

		sc.close();
		outfile.close();
	}

}