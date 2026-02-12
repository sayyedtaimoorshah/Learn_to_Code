public class type_casting {
    public static void main(String[] args) {
        // Implicit casting (widening)
        int intValue = 100;
        long longValue = intValue; // int to long
        float floatValue = longValue; // long to float
        System.out.println("Implicit Casting:");
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);

        // Explicit casting (narrowing)
        double doubleValue = 99.99;
        float narrowedFloatValue = (float) doubleValue; // double to float
        int narrowedIntValue = (int) narrowedFloatValue; // float to int
        System.out.println("\nExplicit Casting:");
        System.out.println("Double value: " + doubleValue);
        System.out.println("Narrowed Float value: " + narrowedFloatValue);
        System.out.println("Narrowed Int value: " + narrowedIntValue);

        // --------------------------------------------------------//

        //type casting explanation
        // Implicit casting (widening) occurs when a smaller data type is automatically converted to a larger data type.
        // Explicit casting (narrowing) requires manual conversion and may result in data loss.
        // give me examples of type casting in java
        // Example 1: Implicit Casting

        int intValue1 = 10;
        double doubleValue1 = intValue1; // int to double
        System.out.println("Implicit Casting:");
        System.out.println("Int value: " + intValue1);
        System.out.println("Double value: " + doubleValue1);

        // Example 2: Explicit Casting
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("\nExplicit Casting:");
        System.out.println("Double value: " + anotherDoubleValue);
        System.out.println("Int value: " + anotherIntValue);

        /// --------------------------------------------------------//
        //  java type casting interview questions and answers
        // 1. What is type casting in Java?
        //    - Type casting in Java is the process of converting a variable from one data type to another.
        // 2. What are the two types of type casting in Java?
        //    - The two types of type casting in Java are implicit casting (widening) and explicit casting (narrowing).
        // 3. What is implicit casting in Java?
        //    - Implicit casting, also known as widening, is the automatic conversion of a smaller data type to a larger data type.
        // 4. What is explicit casting in Java?
        //    - Explicit casting, also known as narrowing, is the manual conversion of a larger data type to a smaller data type, which may result in data loss.
        // 5. Can you give an example of implicit casting in Java?
        //    - Yes, for example, converting an int to a long is an example of implicit casting:
        //      int intValue = 100;
        //      long longValue = intValue; // Implicit casting
        // 6. Can you give an example of explicit casting in Java?
        //    - Yes, for example, converting a double to an int is an example of explicit casting:
        //      double doubleValue = 99.99;
        //      int intValue = (int) doubleValue; // Explicit casting
        // 7. What happens if you try to cast a larger data type to a smaller data type without explicit casting?
        //    - If you try to cast a larger data type to a smaller data type without explicit casting, the compiler will throw a compilation error.
        // 8. Is data loss possible during type casting in Java?
        //    - Yes, data loss is possible during explicit casting (narrowing) when converting a larger data type to a smaller data type.
        // 9. Can you cast between incompatible data types in Java?
        //    - No, you cannot cast between incompatible data types in Java. For example, you cannot cast a String to an int directly.
        // 10. How can you safely convert a String to an integer in Java?
        //    - You can safely convert a String to an integer in Java using the Integer.parseInt() method, which throws a NumberFormatException if the String is not a valid integer.

    }
}
