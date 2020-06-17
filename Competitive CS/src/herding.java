/*
ID: adnanam1
LANG: JAVA
TASK: herding
*/
import java.util.*;
import java.io.*;

;public class herding{

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner sc = new Scanner(new File("herding.in"));
		//PrintStream outfile= new PrintStream(new FileOutputStream("herding.out"));
		Scanner sc = new Scanner(System.in);
		int min;
		int max = 0;
		int[] arr = new int[3];
		 arr[0] = sc.nextInt();
	     arr[1] = sc.nextInt();
		 arr[2] = sc.nextInt();
		 Arrays.sort(arr);
		 
		 
		 int gap1 = arr[1] - arr[0] - 1;
		 int gap2 = arr[2] - arr[1] - 1;
		 
		 if(gap1 == 0 && gap2 == 0)
			 min = 0;
		 else if(gap1 == 1 || gap2 == 1)
			 min = 1;
		 else
			 min = 2;
		 
		 while(gap1 > 1 || gap2 > 1)
		 {
			 max++;
			 if(gap2 > gap1)
			 {
				 int temp = (arr[2] + arr[1])/2;
				 arr[0] = arr[1];
				 arr[1] = temp;
			 }
			 else
			 {
				 int temp = (arr[0] + arr[1])/2;
				 arr[2] = arr[1];
				 arr[1] = temp;
			 }
			 gap1 = arr[1] - arr[0] - 1;
			 gap2 = arr[2] - arr[1] - 1;
		 }
		 if(gap1 == 1 || gap2 == 1)
			 max++;
		 
		 System.out.println(min);
		 System.out.println(max);


		sc.close();
		//outfile.close();
	}

}