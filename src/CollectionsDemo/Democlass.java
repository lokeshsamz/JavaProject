package CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import stream.demo.Person;

public class Democlass {
	
	public static void main (String[] args)
	{
		List<Student> student = new ArrayList<>();
		student.add(new Student("john", 5 , 6));
		student.add(new Student("ram", 10 , 5));
		student.add(new Student("raju", 3 , 1));
		student.add(new Student("mike", 9 , 4));
		student.add(new Student("surya", 2 , 10));
		
		int[][][] test = {
	            {
	              {1, -2, 3}, 
	              {2, 3, 4}
	            }, 
	            { 
	              {-4, -5, 6, 9}, 
	              {1}, 
	              {2, 3}
	            } 
	        };
		
		List<int[][]> array1 = Arrays.asList(test);
		
		array1.forEach(e -> System.out.println(e));
		
		Collections.sort(student, new Comparator<Student>()
				{
					public int compare(Student s1, Student s2)
					{
						if(s1.getId() > s2.getId())
							return 1;
						else
							return -1;
					}
				});
		
		student.forEach(data -> System.out.println(data)); 
		
		System.out.println("\n***************************\n");
		
		Collections.sort(student, (Student s1, Student s2) -> {if(s1.getClassName() > s2.getClassName()) return 1; else return -1; });
		student.forEach(System.out::println);
				
				
		Student s = new Student();
		String str = s.toDo(new Person()
					{
						public String speak()
						{
							return "I can speak";
						}
					});
		
				System.out.println(str);
				
				
		System.out.println(s.toDo(() -> {return "I can speak";}));
	}

}
