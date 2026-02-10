class autoboxing {
    public static void main(String[] args) {
        // Autoboxing: converting a primitive type to its corresponding wrapper class
        int primitiveInt = 10;
        Integer wrappedInt = primitiveInt; // Autoboxing
        System.out.println("Wrapped Integer: " + wrappedInt);

        // Unboxing: converting a wrapper class back to its corresponding primitive type
        Integer anotherWrappedInt = 20;
        int anotherPrimitiveInt = anotherWrappedInt; // Unboxing
        System.out.println("Primitive int: " + anotherPrimitiveInt);
    }
}

/*
In Java, the primitive data types and their ranges are as follows:
1. byte: 8-bit signed integer (-128 to 127)
2. short: 16-bit signed integer (-32,768 to 32,767)
3. int: 32-bit signed integer (-2^31 to 2^31-1)
4. long: 64-bit signed integer (-2^63 to 2^63-1)
5. float: 32-bit floating-point (-3.40282347E+38 to 3.40282347E+38)
6. double: 64-bit floating-point (-1.79769313486231570E+308 to 1.79769313486231570E+308)
7. char: 16-bit Unicode character (0 to 65,535)
8. boolean: true or false
*/

/**
 * give me java dataypes interview questions and answers
 * 1. What are the primitive data types in Java?
 *    - The primitive data types in Java are byte, short, int, long, float, double, char, and boolean.  
 * 2. What is the difference between a primitive data type and a reference data type in Java?
 *    - Primitive data types store actual values, while reference data types store references (addresses) to objects in memory.
 * 3. What is autoboxing and unboxing in Java?
 *    - Autoboxing is the automatic conversion of a primitive type to its corresponding wrapper class, while unboxing is the reverse process of converting a wrapper class back to its primitive type.
 * 4. What is the range of the 'int' data type in Java?
 *    - The 'int' data type in Java is a 32-bit signed integer, and its range is from -2^31 to 2^31-1.  
 * 5. How much memory does a 'double' data type occupy in Java?
 *    - The 'double' data type in Java occupies 64 bits (8 bytes) of memory.
 * 6. Can a 'char' data type in Java hold negative values?
 *   - No, the 'char' data type in Java is an unsigned 16-bit Unicode character and cannot hold negative values.
 * 7. What is the default value of a boolean data type in Java?
 *    - The default value of a boolean data type in Java is false.
 * 8. How do you convert a String to an integer in Java?
 *    - You can convert a String to an integer in Java using the Integer.parseInt() method. For example: int num = Integer.parseInt("123");
 * 9. What is the difference between 'float' and 'double' data types in Java?
 *    - The 'float' data type is a single-precision 32-bit IEEE 754 floating point, while the 'double' data type is a double-precision 64-bit IEEE 754 floating point. The 'double' data type has a larger range and greater precision than the 'float' data type.
 * 10. Can you use a primitive data type as a generic type parameter in Java?
 *    - No, you cannot use primitive data types as generic type parameters in Java. You must use their corresponding wrapper classes instead (e.g., Integer for int, Double for double, etc.).
 * 
 */