package Hello;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Sorting {
	
	
	Integer[] array = {23,45,89,5,99,18};
	List<Integer> list = Arrays.asList(array);
	Integer[] newList = null;
	int temp = 0;
	int count = 1; 
	
	public abstract void toSort();
	
	{
		Integer[] listArray = new Integer[list.size()];
		listArray = list.toArray(listArray);
		for (Integer x : listArray)
            System.out.print(x + " "); 
		
		Arrays.sort(listArray);
		Collections.sort(list);
    	
		System.out.println("The sorted list : " + Arrays.toString(list.toArray())); 
	}
	
}
