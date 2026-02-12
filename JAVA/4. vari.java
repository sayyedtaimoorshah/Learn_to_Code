public class vari {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int sum = a + b;

        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: " + (a - b));
        System.out.println("The product is: " + (a * b));
        System.out.println("The quotient is: " + (a / b));

        // variables in java
        // A variable in Java is a container that holds a value of a specific data type. It is used to store and manipulate data in a program. Variables are declared with a specific data type and can be assigned values that can be changed during the execution of the program. For example, in the code snippet above, 'a', 'b', and 'sum' are variables of type int that hold integer values. Variables can be of various data types such as int, double, char, String, etc., and they play a crucial role in programming as they allow developers to store and manipulate data effectively.

        // variables in java interview questions and answers
        // 1. What is a variable in Java?
        //    - A variable in Java is a container that holds a value of a specific data type. It is used to store and manipulate data in a program.
        // 2. How do you declare a variable in Java?
        //    - You can declare a variable in Java by specifying the data type followed by the variable name. For example: int myVariable;
        // 3. Can you give an example of declaring and initializing a variable in Java?
        //    - Yes, for example: int myVariable = 10; This declares a variable named 'myVariable' of type int and initializes it with the value 10.
        // 4. What are the different data types available for variables in Java?
        //    - The different data types available for variables in Java include primitive data types (byte, short, int, long, float, double, char, boolean) and reference data types (String, arrays, classes, etc.).
        // 5. Can you change the value of a variable after it has been initialized in Java?
        //    - Yes, you can change the value of a variable after it has been initialized in Java, as long as it is not declared as final. For example: myVariable = 20; This will change the value of 'myVariable' to 20.  

        // --------------------------------------------------------//

        // types of variables in java
        // 1. Local Variables: These are variables that are declared within a method or block and are only accessible within that method or block. They are created when the method is called and destroyed when the method exits.
        // give me examples of local variables in java
        // Example of local variables in Java:  
        public void myMethod() {
            int localVariable = 10; // This is a local variable
            System.out.println("Local Variable: " + localVariable);
        }

        // 2. Instance Variables: These are variables that are declared within a class but outside of any method. They are associated with an instance of the class and can be accessed by all methods within the class. Each instance of the class has its own copy of instance variables.
        // give me examples of instance variables in java
        public class MyClass {
            int instanceVariable; // This is an instance variable  not global variable     
            public void myMethod() {
                instanceVariable = 20; // Accessing the instance variable
                System.out.println("Instance Variable: " + instanceVariable);
            }
        }

        // 3. Static Variables: These are variables that are declared with the static keyword and are associated with the class rather than any specific instance. They can be accessed without creating an instance of the class and are shared among all instances of the class. 
        // give me examples of static variables in java
        public class MyClass {
            static int staticVariable; // This is a static variable
            public void myMethod() {
                staticVariable = 30; // Accessing the static variable
                System.out.println("Static Variable: " + staticVariable);
            }
        }


        // 4. Final Variables: These are variables that are declared with the final keyword and cannot be changed once they have been initialized. They must be assigned a value at the time of declaration or within a constructor. Final variables are often used to define constants in Java.
        // give me examples of final variables in java
        public class MyClass {
            final int finalVariable = 40; // This is a final variable   
            public void myMethod() {
                // finalVariable = 50; // This will cause a compilation error because finalVariable cannot be changed
                System.out.println("Final Variable: " + finalVariable);
            }
        }

        // 5. What are the different types of variables in Java?
        //    - The different types of variables in Java include local variables, instance variables, static variables, and final variables.



    }
    
}

// when gets memory allocated for all types of variables in java
// 1. Local Variables: Memory for local variables is allocated on the stack when the method or block in which they are declared is executed. They are created when the method is called and destroyed when the method exits.
// 2. Instance Variables: Memory for instance variables is allocated on the heap when an instance of the class is created. Each instance of the class has its own copy of instance variables, and they are destroyed when the instance is garbage collected.
// 3. Static Variables: Memory for static variables is allocated on the method area of the heap when the class is loaded by the Java Virtual Machine (JVM). Static variables are shared among all instances of the class and are destroyed when the class is unloaded from memory.
// 4. Final Variables: Memory for final variables is allocated based on their type. If a final variable is a local variable, it is allocated on the stack when the method or block is executed. If a final variable is an instance variable, it is allocated on the heap when an instance of the class is created. If a final variable is a static variable, it is allocated on the method area of the heap when the class is loaded by the JVM. Final variables cannot be changed once they have been initialized, and they are destroyed based on their type as described above.


// explain in simple and easy way about memory allocation for variables in java
// In Java, memory allocation for variables depends on the type of variable. Local variables are stored in a special area of memory called the stack, which is used for temporary storage during method execution. Instance variables are stored in the heap, which is a larger area of memory used for storing objects and their associated data. Static variables are also stored in the heap but are shared among all instances of the class. Final variables can be stored in either the stack or the heap depending on their type, but they cannot be changed once they have been initialized. Overall, Java manages memory automatically through a process called garbage collection, which helps to free up memory that is no longer being used by the program.