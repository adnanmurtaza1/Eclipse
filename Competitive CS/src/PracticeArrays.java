import java.util.*;

public class PracticeArrays {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		array[0] = 3;
		array[1] = 16;
		array[2] = -1;
		array[3] = 0;
		array[4] = 8;
		array[5] = 7;
		array[6] = 1;
		array[7] = 55;
		array[8] = -3;
		array[9] = 1;
		
		System.out.print(array[1]);
		
		
		for(int x = 0; x< array.length; x++)
		{
			System.out.println(array[x]);
		}
		
		for(int y = 0; y < array.length; y++)
		{
			array[y] = 10;
		}
		
	
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.size();
		
		arrList.add(index);
		arrList.add(40);
		arrList.add(55);
		arrList.add(63);
		arrList.add(17);
		arrList.add(22);
		arrList.add(68);
		arrList.add(89);
		arrList.add(97);
		arrList.add(89);
		
		
		arrList.get(index);
		arrList.get(0);
		arrList.get(4);
		
		arrList.set(index, element);
		arrList.set(0, 5);
		arrList.set(4, 3);
		arrList.set(4, "bye bye");
		
		arrList.remove(index);
		arrList.remove(3);
		
		arrList.add(index, element);
		arrList.add(4, 6)
		arrList.add(4, "hello");
		
	}

}
