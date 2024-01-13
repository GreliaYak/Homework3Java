package src.test;

public class JavaStart {

    // Primitive Data Types
        System.out.println("Hello Ann");

    // Integers
    byte aByte = 1;
    short aShort = -2456;
    int aInt = 32567988;
    long aLong = 435431855;

        System.out.println("# Byte: Size 1B. Stores whole numbers from -128 to 127");
        System.out.println("# Short: Size 2B. Stores whole numbers from -32768 to 32767");
        System.out.println("# Int: Size 4B. Stores whole numbers from -2^31 to 2^31 -1");
        System.out.println("# Long: Size 8B. Stores whole numbers from -2^63 to 2^63 -1\n");

    // Floating points
    float aFloat = 0.0F;
    double aDouble = 0.00;

        System.out.println("# Float: Size 4B. Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits");
        System.out.println("# Double: Size 8B. Stores fractional numbers. Sufficient for storing 15 decimal digits\n");

    // Characters
    char aChar = 'x';

        System.out.println("# Char: Size 2B. Stores a single character/letter or ASCII values");

    // Boolean Type
    boolean aBoolean = true;

    // Object Types (String and many others)
        System.out.println("Some name for somethink");

    // String Type
    String helloWorld = "Hello world!";

        System.out.println(helloWorld);

    // Arithmetical Operator

    int a = 5;
    int b = 2;

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычетание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление: " + (a / b));
        System.out.println("Соотношение: "+ (a % b));

    // Examples of logical operators

    boolean x = true;
    boolean y = false;

        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

    // Comparison examples

        System.out.println("Equality comparison: " + (a == b));
        System.out.println("Inequality comparison: " + (a != b));
        System.out.println("Greater than comparison: " + (a > b));
        System.out.println("Less than comparison: " + (a < b));
        System.out.println("Greater than or equal to comparison: " + (a >= b));
        System.out.println("Less than or equal to comparison: " + (a <= b));

    // Overflow example
    int maxInt = Integer.MAX_VALUE;
    int overflowedValue = maxInt + 1;
        System.out.println("Overflow: " + overflowedValue);

    // Examples of type combinations

    int intValue = 5;
    double doubleValue = 2.5;

    double result1 = intValue + doubleValue;
        System.out.println("Addition of int and double: " + result1);

    double result2 = intValue - doubleValue;
        System.out.println("Subtraction of double from int: " + result2);

    double result3 = intValue * doubleValue;
        System.out.println("Multiplication of int and double: " + result3);

    double result4 = intValue / doubleValue;
        System.out.println("Division of int by double: " + result4);
}
}
