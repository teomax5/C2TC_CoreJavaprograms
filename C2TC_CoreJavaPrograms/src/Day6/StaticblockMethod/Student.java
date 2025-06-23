//Program to demonstrate static block
package Day6.StaticblockMethod;
public class Student {
	private int Sname ; //non-static or instance variable
	private static int id; //static or class variable
	//static Block
	static
	{
		System.out.println("-----------Within Static Block---------");
		id=1000;
	}
	
	Student()
	{
		System.out.println("--------------Within Default Constructor-----------");
		id++;
		Sname++;		
	}
	
	@Override
	public String toString() {
		return "MyClass [Serial No "+id+", name=" + Sname + "]";
	}

	//static method
	static void display() 
	{
		System.out.println("ID Number. "+id); 
	}

	public int getSection() {
		return Sname;
	}

	public void setSection(int section) {
		this.Sname = section;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Student.id = id;
	}


}