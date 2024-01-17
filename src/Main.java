//Java Operation on different Arithmetic Operators
public class Main {
    //Main method
    public static void main(String[] args) {

    final float pie = 3.14f;
    int radius = 5;
    float area = pie * radius * radius;

    int a = 10;
    int b = 20;
    int result = a + b;
    int div = a / b;
    int mod = a % b;
    int sub = a - b;
    int mul = a * b;

    float c = 10.5f;
    float d = 20.5f;
    float w = d + c*2/3%2;

    System.out.println("Value of w is: " + w);
    System.out.println("Addition is: " + result);
    System.out.println("Division is: " + div);
    System.out.println("Modulus is: " + mod);
    System.out.println("Subtraction is: " + sub);
    System.out.println("Multiplication is: " + mul);
    System.out.println("Area of circle is: " + area);
        }
    }
