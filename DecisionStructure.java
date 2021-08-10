public class DecisionStructure {
    public static void main(String[] args) {

        System.out.println(numOfDigits(1000));

    }

    /**
     * Q1:Write a program that given a positive number between 0 and 10000, it prints the number of digits of the given number
     * Pseudocode: 
     * compute integer count = 1
     * while (num > 9)
     *  num /= 10
     *  count++
     */
    public static int numOfDigits(int num) {
        int count = 1;
        
        while (num > 9) {
            num /= 10;
            count++;
        }

        return count;
    }
}