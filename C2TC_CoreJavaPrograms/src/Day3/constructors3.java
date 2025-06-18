package Day3;

class Example {
    int num;
    String text;
    Example() {
        num = 0;
        text = "Default";
        System.out.println("Default constructor called: num = " + num + ", text = " + text);
    }
    Example(int n) {
        num = n;
        text = "Single parameter";
        System.out.println("Parameterized constructor called: num = " + num + ", text = " + text);
    }
    Example(int n, String t) {
        num = n;
        text = t;
        System.out.println("Parameterized constructor called: num = " + num + ", text = " + text);
    }
}
public class constructors3 {
    public static void main(String[] args) {
        new Example();
        new Example(10);
        new Example(20, "Custom Text");
    }
}