import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);


        int x = rand.nextInt(100); // Random number between 0-100
        int guess;
        int count = 1; // Count the number of guesses
        System.out.println("Enter your first guess:");
        guess = scan.nextInt();
        
        while(guess != x) { // Continue until the guess is correct or 7 tries
            if (guess < x) {
                System.out.println("Too low ROFL!");
            } else if (guess > x) {
                System.out.println("Too high ROFL!");
            }

            guess = scan.nextInt();
            count++; // Increment guess count
        }

        // Outcome messages based on guess count
        if (count <= 7) {
            System.out.println("You did: " + count + " guesses!");
            System.out.println("You got a s†atistically almost impossibe score!");
        } else if (count <= 10) {
            System.out.println("You did: " + count + " guesses!");
            System.out.println("You did a good job!");
        } else {
            System.out.println("You did: " + count + " guesses!");
            System.out.println("Try the divide and conquer strategy next time!");
        }

        scan.close(); // Close the scanners
    }
}

/* 
Explanation for the FRQ questions:
1. What kind of loop did you use?
   You used a while loop in the guessing game. This loop continues to execute as long as the guess is not equal to the random number (x).

2. How does your loop end?
   The loop ends when the user's guess matches the randomly generated number (x). This happens when the condition guess != x becomes false.

3. What is a Random object and how did you use it in your program?
   The Random object in Java is used to generate pseudo-random numbers. In your program, you created a Random object called rand and used the nextInt(100) method to generate a random integer between 0 and 99. This random number serves as the hidden number that the user must guess.
### MCQ Topics Explanation:

1. **Methods:**
   - A method is a block of code that performs a specific task. Methods can return values or be `void` (no return value).
   - **Static methods** belong to the class and are invoked without creating an instance of the class.
     Example: `MathHelper.add(5, 10);`
   - **Instance methods** require an object to be created before they are called.
     Example: 
     ```java
     Dog myDog = new Dog(); 
     myDog.bark();
     ```

2. **Parameters:**
   - **Primitive types** (like `int`, `double`): Passed by value, meaning a copy of the variable is passed to the method, and any changes to the parameter inside the method do not affect the original variable.
     Example: 
     ```java
     public void modifyNumber(int num) {
         num += 10; // Only modifies the local copy
     }
     ```
   - **Reference types** (objects): Passed by reference, meaning the method can modify the object’s properties directly.
     Example:
     ```java
     public void modifyArray(int[] arr) {
         arr[0] = 100; // Modifies the original array
     }
     ```

3. **Constructor:**
   - A constructor initializes an object when it is created. It has the same name as the class and no return type.
   - **Default Constructor:** Automatically provided if no constructor is defined.
     Example:
     ```java
     public class Person {
         String name;
         public Person() { 
             this.name = "Default"; 
         }
     }
     ```
   - **Parameterized Constructor:** Allows passing values when an object is created.
     Example:
     ```java
     public Person(String name) {
         this.name = name;
     }
     ```

4. **Classes:**
   - A class is a blueprint for creating objects. It contains fields (attributes) and methods (behavior). 
     Example:
     ```java
     public class Car {
         String model;
         public Car(String model) {
             this.model = model;
         }
         public void displayModel() {
             System.out.println("Model: " + model);
         }
     }
     ```
     Fields like `model` store data, while methods like `displayModel()` perform actions.

5. **Objects:**
   - An object is an instance of a class. Objects are created using the `new` keyword, and they access the methods and fields defined in the class.
     Example:
     ```java
     Car myCar = new Car("Toyota"); // Creates an object of the Car class
     myCar.displayModel(); // Outputs: Model: Toyota
     ```

6. **Arguments:**
   - Arguments are the actual values passed into methods when they are invoked. They must match the types of the method’s parameters.
     Example:
     ```java
     public void printName(String name) {
         System.out.println("Hello, " + name);
     }
     printName("Alice"); // Outputs: Hello, Alice
     ```

7. **Loop Output:**
   - Loops repeatedly execute a block of code based on a condition. You should be familiar with the behavior of `for`, `while`, and `do-while` loops.
     **For Loop Example:**
     ```java
     for (int i = 0; i < 3; i++) {
         System.out.println(i);
     }
     // Output: 0 1 2
     ```

     **While Loop Example:**
     ```java
     int count = 0;
     while (count < 3) {
         System.out.println(count);
         count++;
     }
     // Output: 0 1 2
     ```

     **Do-While Loop Example:**
     ```java
     int count = 0;
     do {
         System.out.println(count);
         count++;
     } while (count < 3);
     // Output: 0 1 2
     ```

*/
