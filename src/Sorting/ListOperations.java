package Sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListOperations {
	
	public static<T> List<T> duplicate(List<T> list)
	{
		list.addAll(list);
		return list;
	}
	
	public static<T> List<T> removeDuplicate(List<T> list)
	{
		Set<T> set = new HashSet<>(list);
		List<T> newList = new ArrayList<T>(set);
		list.addAll(newList);
		return newList;
	}

}
