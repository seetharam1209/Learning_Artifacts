package Day1;

public class JavaBasicsDemo {
    int instanceVar = 10; // Instance variable
    static int staticVar = 20; // Static variable

    public void showVariables() {
        int localVar = 5; // Local variable
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public void showDataTypes() {
        byte b = 10;
        int i = 100;
        double d = 10.5;
        char c = 'A';
        boolean flag = true;
        String str = "Hello";
        System.out.println("byte: " + b + ", int: " + i + ", double: " + d +
                           ", char: " + c + ", boolean: " + flag + ", String: " + str);
    }

    public void showOperators() {
        int a = 10, b = 3;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println("Relational (a > b): " + (a > b));
        System.out.println("Logical AND: " + (a > 5 && b < 5));
    }

    public static void main(String[] args) {
        JavaBasicsDemo demo = new JavaBasicsDemo();
        demo.showVariables();
        demo.showDataTypes();
        demo.showOperators();
    }


}
