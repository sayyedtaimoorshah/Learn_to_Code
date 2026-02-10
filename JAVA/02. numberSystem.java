public class numberSystem {
    public static void main(String[] args) {
        
        // number systems in java
        int decimalNumber = 42; // Decimal (base 10)
        int binaryNumber = 0b101010; // Binary (base 2)
        int octalNumber = 052; // Octal (base 8)
        int hexadecimalNumber = 0x2A; // Hexadecimal (base 16)  
        System.out.println("Decimal Number: " + decimalNumber);
        System.out.println("Binary Number: " + binaryNumber);
        System.out.println("Octal Number: " + octalNumber);
        System.out.println("Hexadecimal Number: " + hexadecimalNumber);

        // Converting numbers to different bases
        String binaryString = Integer.toBinaryString(decimalNumber);
        String octalString = Integer.toOctalString(decimalNumber);
        String hexadecimalString = Integer.toHexString(decimalNumber);

        System.out.println("Decimal to Binary: " + binaryString);
        System.out.println("Decimal to Octal: " + octalString);
        System.out.println("Decimal to Hexadecimal: " + hexadecimalString);

        // Converting numbers from other bases to decimal
        int decimalFromBinary = Integer.parseInt(binaryString, 2);
        int decimalFromOctal = Integer.parseInt(octalString, 8);
        int decimalFromHexadecimal = Integer.parseInt(hexadecimalString, 16);

        System.out.println("Binary to Decimal: " + decimalFromBinary);
        System.out.println("Octal to Decimal: " + decimalFromOctal);
        System.out.println("Hexadecimal to Decimal: " + decimalFromHexadecimal);

        // give me java number system interview questions and answers
        // 1. What are the different number systems used in Java?
        //    - The different number systems used in Java are Decimal (base 10), Binary (base 2), Octal (base 8), and Hexadecimal (base 16).
        // 2. How do you convert a decimal number to binary in Java?
        //    - You can use the Integer.toBinaryString() method to convert a decimal number to binary.
        // 3. How do you convert a binary number to decimal in Java?
        //    - You can use the Integer.parseInt() method with a radix of 2 to convert a binary number to decimal.
        // 4. What is the range of values for a byte in Java?
        //    - The range of values for a byte in Java is -128 to 127.
        // 5. How do you represent a hexadecimal number in Java?
        //    - You can represent a hexadecimal number in Java by prefixing it with "0x" or "0X".

        // 


    }
    
}
