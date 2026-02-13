public class DataTypesDemo {

    public static void main(String[] args) {

        // ===============================
        // Primitive Data Types
        // ===============================

        byte byteValue = 100;              // 8-bit integer
        short shortValue = 10000;          // 16-bit integer
        int intValue = 100000;             // 32-bit integer
        long longValue = 10000000000L;     // 64-bit integer

        float floatValue = 10.5f;          // 32-bit floating point
        double doubleValue = 99.99;        // 64-bit floating point

        char charValue = 'A';              // Single character
        boolean booleanValue = true;       // true or false

        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        // ===============================
        // Non-Primitive Data Types
        // ===============================

        String stringValue = "Hello, Java";
        int[] arrayValue = {1, 2, 3, 4, 5};

        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("String: " + stringValue);

        System.out.print("Array: ");
        for (int number : arrayValue) {
            System.out.print(number + " ");
        }
    }
}
