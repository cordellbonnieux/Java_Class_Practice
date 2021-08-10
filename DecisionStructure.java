public class DecisionStructure {
    public static void main(String[] args) {

        System.out.println(numOfDigits(1000)); // Q1

        checkDivision(999); // Q2

        System.exit(0);
    }

    /**
     * Q1:Write a program that given a positive number between 0 and 10000, it prints the number of digits of the given number
     * Pseudocode: 
     * compute integer count = 1
     * while (num > 9)
     *  num /= 10
     *  count++
     * @param num an integer 
     * @return count an integer
     */
    public static int numOfDigits(int num) {
        int count = 1;

        while (num > 9) {
            num /= 10;
            count++;
        }

        return count;
    }
    /**
     * Q2: Write a program that given a number it checks and reports if the number is divisible by 2, 3, 5, 6, 7, 10.
     * @param num an integer
     */
    public static void checkDivision(int num) { 

        System.out.println("Is " + num + " divisible by...");

        System.out.println("Two: " + ((num % 2 == 0) ? true : false));

        System.out.println("Three: " + ((num % 3 == 0) ? true : false));
        
        System.out.println("Five: " + ((num % 5 == 0) ? true : false));
        
        System.out.println("Six: " + ((num % 6 == 0) ? true : false));

        System.out.println("Seven: " + ((num % 7 == 0) ? true : false));

        System.out.println("Ten: " + ((num % 10 == 0) ? true : false));

    }

    
}