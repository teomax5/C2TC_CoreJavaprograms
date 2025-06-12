package day1;
import java.util.Scanner;
public class FirstJavaProgram {

	public static void main(String[] args) {
		System.out.println("Welcome to Java");
		int a,b,c;
		Scanner sc;
		sc= new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		c=a+b;
	System.out.println("Addition 0f a="+a+"and b="+b+" is "+c);	

	}

}
