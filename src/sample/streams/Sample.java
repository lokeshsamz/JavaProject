package sample.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import CollectionsDemo.Student;

public class Sample {

	public static void main(String[] args) {
	
		Function<Integer, String> inc = t  -> String.valueOf(t * 2);
				
				System.out.println(inc.apply(2).concat(" Four"));
							
				List<Student> student = new ArrayList<>();
				student.add(new Student("john", 5 , 6));
				student.add(new Student("ram", 10 , 5));
				student.add(new Student("raju", 3 , 1));
				student.add(new Student("mike", 9 , 4));
				student.add(new Student("surya", 2 , 10));	
				
				//System.out.println(
				student.stream()
						//.sorted(Comparator.comparing(Student::getName).reversed())
						.sorted(Comparator.comparingInt(Student::getClassName).reversed())
						.limit(3)
						//.map(s -> s.getName())
						//map(student::getName)
						.forEach(System.out::println);
						//);
	}

}
