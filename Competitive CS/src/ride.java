/*
ID: adnanam1
LANG: JAVA
TASK: ride
*/
import java.util.*;
import java.io.*;

;public class ride{

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("ride.in"));
		PrintStream outfile= new PrintStream(new FileOutputStream("ride.out"));
		String alphabet = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String first = sc.next();
		String second = sc.next();
		int fN = 1;
		int sN = 1;

		for (int x = 0; x < first.length(); x++) {
			fN *= alphabet.indexOf(first.charAt(x));
		}
		for (int y = 0; y < second.length(); y++) {
			sN *= alphabet.indexOf(second.charAt(y));
		}

		if (fN % 47 == sN % 47)
			outfile.println("GO");
		else
			outfile.println("STAY");

		sc.close();
		outfile.close();
	}

}
