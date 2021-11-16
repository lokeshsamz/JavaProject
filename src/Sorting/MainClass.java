package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import CollectionsDemo.Student; //importing student class.
import Hello.Cricketer;
public class MainClass {

	public static void main(String[] args) {
		
		String[] array = {"Barbara", "James", "Mary", "John", "robert", "Michael", "Linda", "james", "mary"};
		
		Arrays.sort(array, new Comparator<String>() {

			public int compare(String o1, String o2) {
				
				return o1.toLowerCase().compareTo(o2.toLowerCase());
			}		
		});
		
		Arrays.sort(array, (s1, s2) -> s1.compareToIgnoreCase(s2) );
		
		Arrays.sort(array, String::compareToIgnoreCase);
		
		Arrays.asList(array).forEach(System.out::println);
		
		List<Student> student = new ArrayList<>();
		student.add(new Student("surya", 5 , 6));
		student.add(new Student("ram", 10 , 5));
		student.add(new Student("mike", 3 , 1));
		student.add(new Student("raju", 9 , 4));
		student.add(new Student("john", 2 , 10));
		
		student.stream()
						.filter(s1 -> !s1.getName().equals("surya"))
						.forEach(System.out::println);	
		
		student.stream()
						.filter(MainClass::isNotGivenName).forEach(System.out::println);
		
		
		List<Cricketer> crick1 = student.stream().map( s -> new Cricketer(s.getId(), s.getName(), s.getClassName()))
						.collect(Collectors.toList());
		crick1.forEach(System.out::println);
					
		List<Cricketer> crick2 = student.stream().map( s -> new Cricketer(s))
				.collect(Collectors.toList());
        crick2.forEach(System.out::println);

		List<Cricketer> crick3 = student.stream().map(Cricketer::new)
		.collect(Collectors.toList());
		crick3.forEach(System.out::println);
		
		Optional<String> s = Optional.ofNullable(crick1.stream().map(c -> c.getName()).reduce("abc", (s1, s2) -> s1 + " " + s2));
		System.out.println(s);

		System.out.println(crick1.stream().map(c -> c.getId()).reduce(5,(id1, id2) -> id1 + id2));
		
		System.out.println(crick1.stream().mapToInt(Cricketer::getId).sum());
		
		Collections.sort(student, (s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
		
		student.forEach(System.out::println);
		
		List<Integer> newlist = new LinkedList<>(List.of(1,2,3,4));
		ListOperations.duplicate(newlist);
		System.out.println(newlist);
		
		List<Integer> li = new LinkedList<>();
		li = ListOperations.removeDuplicate(newlist);
		System.out.println(li);
		
		
		
		List<Integer> A = new ArrayList<>(List.of(5,8,1,1,6,4));
		List<Integer> B = new LinkedList<>(List.of(2,5,4,9,1,6,3));
		A.addAll(B);
		System.out.println(new ArrayList(new TreeSet(A)));
		
		
		List<String> C = new ArrayList<>(List.of("Ram","james","Chris","elvin","cary","Aaron","surya"));
		List<String> D = new LinkedList<>(List.of("Ravi","James","Surya","krish","Jack","Zara","aaron", "Chris"));	
		
		C.addAll(D);
		Set<String> s1 = C.stream()
	    .collect(Collectors.toCollection(() -> 
	        new TreeSet<String>((p1, p2) -> p1.compareToIgnoreCase(p2)))); 
		System.out.println(" Sort & Remove duplicate strings & ignoring cases using stream and tree set: " + s1);		
		
//		Collections.sort(C, (s1,s2) -> (s1.compareToIgnoreCase(s2)));

		Set<String> E = C.stream().map(str -> str.substring(0, 1).toUpperCase() + str.substring(1)).collect(Collectors.toCollection(() -> 
        new TreeSet<String>((p1, p2) -> p1.compareToIgnoreCase(p2)) ));
		System.out.println("Sort & Remove duplicate strings using stream(map) and tree set: " + E);
		
		
		Set<String> toRetain = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		toRetain.addAll(C);
		System.out.println("Sort & Remove duplicate strings using TreeSet(CASE_INSENSITIVE_ORDER) " + toRetain);

		


	}
	
	public static boolean isNotGivenName(Student s) 
	{
		return !s.getName().equals("surya");
	}

}
