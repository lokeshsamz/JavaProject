package stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NewClass implements Consumer<Integer>{
	
	List<Integer> list = Arrays.asList(1,2,3,4,5,6);
	public void accept(Integer i)
	{
		System.out.println(i * 10);
	}
	
	
	public void oddNumbers()
	{
		System.out.println("\n*****************Printing odd numbers using foreach in list********************\n");
		list.forEach(i -> {if(i % 2 != 0) System.out.print(i + ", ");});
		System.out.println("\n*****************printing numbers multiplied by 2 using Map func. in Stream Api*********************\n");
		//list.forEach(i -> {System.out.println(i*2);});
		//list.forEach(System.out::println);		
		list.stream().map(i -> i*2);
	}		
	
	public static void main(String[] args)
	{
		new NewClass().oddNumbers();
		
		List<Integer> arrList = Arrays.asList(1,2,3,4,5,6);
		Consumer<Integer> cons = new NewClass();
		System.out.println("\n*****************using Consumer interface implemention in a class******************\n");
		arrList.forEach(cons);

		System.out.println("\n***************Using anonymous classes -> foreach********************\n");
		
		List<String> strList = Arrays.asList("apple", "orange", "grapes", "lemon");
		//Using anonymous classes
		strList.forEach(new Consumer<String>() {
			
			 public void accept(String i)
			{
				System.out.println(i + " => fruit");
			}		
		});
		
		System.out.println("\n*******************Using Lamba expression 1 in foreach*******************\n");
		Consumer<String> c = i -> System.out.println(i);
		strList.forEach(c);
		
		System.out.println("\n*******************Using Lamba expression 2 in foreach*******************\n");
		strList.forEach(str -> System.out.println(str + " is a fruit."));
	}
}
