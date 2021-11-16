package CollectionsDemo;

import stream.demo.Person;

public class Student{
	
	private String name;
	private int id;
	private int className;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getClassName() {
		return className;
	}


	public void setClassName(int className) {
		this.className = className;
	}
	
	public Student()
	{}


	public Student(String name, int id, int i) {
		super();
		this.name = name;
		this.id = id;
		this.className = i;
	}

	public String toDo(Person p)
	{
		String str = p.speak();
		return str;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", className=" + className + "]";
	}



	
	

}
