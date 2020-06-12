/*
ID: adnanam1
LANG: JAVA
TASK: friday
*/
import java.util.*;
import java.io.*;

;public class friday{

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner sc = new Scanner(new File("friday.in"));
		//PrintStream outfile= new PrintStream(new FileOutputStream("friday.out"));
		Scanner sc = new Scanner(System.in);
		int yearleft = sc.nextInt() - 1;
		int year = 1900;
		int month = 1;
		int day = 5;
		int[] week = new int[7];
		boolean leapyear = false;
		for(int x = year; x <= (year + yearleft); x++)
		{
			leapyear = false;
			if((x%100 == 0 && x%400 == 0) || (x%100 !=0 && x%4 == 0))
				leapyear = true;
			
			for(int y = 1; y <= 12; y++)
			{
				week[day]++;
				if(month == 6 || month == 4 || month == 11 || month == 9)
					day = (day + 30)%7;
				else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
					day = (day + 31)%7;
				else if(leapyear)
					day = (day + 29)%7;
				else
					day = (day + 28)%7;
				month++;
			}
			month = 1;
			
		}
		//outfile.print(week[5] + " " + week[6]);
		for(int z = 0; z < 5; z++)
			System.out.print(" " + week[z]);
	//	outfile.println();

		sc.close();
		//outfile.close();
	}

}