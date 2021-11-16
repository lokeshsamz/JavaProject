package Hello;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cricketer extends Sorting
{
	private int id;
	private String name;
	public int score;
	private Object obj;
	public static final double pi = 3.14;
	
	
	Integer[] array = {23,45,89,5,99,18};
	List<Integer> list = Arrays.asList(array);
	Integer[] newList = null;
	int temp = 0;
	int count = 1; 
	
	public static final String show(String a, String b)
	{
		System.out.println("The final is keyword is used");
		String c = a + b;
		return c;
	}
	
	@Override
	public void toSort()
	{
		Integer[] listArray = new Integer[list.size()];
		listArray = list.toArray(listArray);
		for (Integer x : listArray)
            System.out.print(x + " "); 
		
		Arrays.sort(listArray);
		Collections.sort(list);
    	
		//System.out.println("The sorted list : " + Arrays.toString(list.toArray())); 
	}
	
	
	public Cricketer(int id, String name, int score)
	{
		//this.setId(id);
		//this.setName(name);
		this.id = id ;
		this.name = name ;
		this.score = score;
	}

	public Cricketer() {
		
	}
	
	public Cricketer (Object t)
	{
		this.obj = t;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cricketer [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

	
}

