// This class demonstrates the use of constructors in Java
class constUse {

    // Default constructor
    constUse() {
        System.out.println("I'm a default constructor");
    }

    // Parameterized constructor that takes an integer as an argument
    constUse(int i) {
        // Prints the sum of numbers from 1 to 'i' using the sumValue method
        System.out.println("Addition of " + i + " = " + sumValue(i));
    }

    // Method to calculate the sum of numbers from 1 to 'i'
    int sumValue(int i) {
        int sum = 0;
        // Loop to add all numbers from 1 to 'i'
        for (int j = 1; j <= i; j++) {
            sum += j;
        }
        return sum;
    }
}

// Main class to demonstrate the usage of the constUse class
class Lecture5 {
    public static void main(String[] args) {
        // Creating an instance using the default constructor
        constUse obj = new constUse();
        
        // Creating an instance using the parameterized constructor with argument 5
        constUse obj2 = new constUse(5);
    }
}
