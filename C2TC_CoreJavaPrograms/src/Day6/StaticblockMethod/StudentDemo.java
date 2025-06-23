//Program to demonstrate static method
package Day6.StaticblockMethod;

public class StudentDemo {

	public static void main(String[] args) {

		Student o1 = new Student();
		o1.setId(1);
		System.out.println(o1);

		// static method with class name
		Student.display();

		Student o2 = new Student();
		System.out.println(o2);
		Student.display();
		Student o3 = new Student();
		System.out.println(o3);
		Student.display();

	}

}