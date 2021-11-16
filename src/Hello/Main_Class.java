package Hello;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Main_Class {

	
	public static void main(String args[])
	{
		
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> s = values.stream();
;		s.forEach(System.out::println);
		
		phone ph = new phone();
		ph.call();
		
		samsung sam = (samsung)ph;
		sam.call();
		
		
		int score = new Cricketer().score = 10000; //Anonymous object : new Cricketer()
		System.out.println("The score is : " + score);
		
		String text = "";
		String concat = Cricketer.show("Final ", "Keyword");
		System.out.println(concat + "\n");
		
		Sorting sorting = new Cricketer();
		sorting.toSort();
		
		Cricketer c = new Cricketer();
		c.toSort();
		
		System.out.println("\n-----------------------------------------------------\n");
		
		Integer[] array = {1, 2, 3, 4, 5};
		List<Integer> series = Arrays.asList(array);
		System.out.println(Arrays.toString(series.toArray()) + "\n");
		
		for (Integer element : series)
		{
			text =  text + element.toString() + ", ";			
		}

		System.out.print(text.substring(0, text.length() - 2).strip());
			
		System.out.println("\n-----------------------------------------------------\n");
		
		List<Cricketer> list = new LinkedList<Cricketer>();
		list.add(new Cricketer(1 ,"Ram",0));
		list.add(new Cricketer(2 ,"Anbu" ,0));
		list.add(new Cricketer(3 ,"Sree", 0));
		list.add(new Cricketer(4 ,"Madhan", 0));
		
		List<Cricketer> newList = new LinkedList<Cricketer>();
		newList.add(new Cricketer(8 ,"Madhan",100));
		newList.add(new Cricketer(5 ,"Ram" , 50));
		newList.add(new Cricketer(7 ,"Sree" , 62));
		newList.add(new Cricketer(6 ,"Anbu" , 95));
		
		for( int listIndex = 0 ; listIndex < list.size() ; listIndex++)			
		{
			System.out.println(list.get(listIndex).getId() + " , " + list.get(listIndex).getName());
			
			for(int newListIndex = 0 ; newListIndex < list.size() ; newListIndex++)
			{
				if(list.get(listIndex).getName().matches(newList.get(newListIndex).getName()))
				{
					list.get(listIndex).score = newList.get(newListIndex).score;
					System.out.println(list.get(listIndex).getName() + " => " +list.get(listIndex).score);
				}
			}
			
		}
		
		System.out.println("\n-----------------------------------------------------\n");
		
		int itr = list.size() - 1 ;
		while(itr>=0)
		{		
			int itrNew = newList.size() - 1;
			while(itrNew>=0)
			{
				if(list.get(itr).getName() == newList.get(itrNew).getName())
				{
					list.get(itr).score = newList.get(itrNew).score;
					System.out.println(list.get(itr).getName() + " => " +list.get(itr).score);
				}
				itrNew--;
			}
			itr--;
		} 
	
		System.out.println("\n-----------------------------------------------------\n");
		
	for (Cricketer data : list)
		{
			for (Cricketer content : newList)
			{
				if(data.getName() == content.getName())
				{
					data.score = content.score;
					System.out.println(data.getName() + " => " + data.score);
					break;
				}
			}
		} 
		
	System.out.println("\n-----------------------------------------------------\n");

		for (Cricketer data : list)
		{
			newList.forEach(content -> {if(data.getName() == content.getName()) {data.score = content.score;
			System.out.println(data.getName() + " => " + data.score);} });
		}
			
		
	}
}
