public class NumberConversions {
    /**
     * Converts a decimal to binary (represented as an int).
     * example: 13_10 == ?_2
     * 13 / 2 = 6, remainder = 1
     * 6 / 2 = 3, remainder = 0
     * 3 / 2 = 1, remainder = 1
     * 1 / 2 = 0, remainder = 1
     * @param int decimal number
     * @return int binary number representation
     */
    public static int decimal2Binary(int decimal) {
      
        int quotient = decimal, remainder = 0;
        String binary = "", reversed = "";

        while (quotient > 0) {
            quotient = decimal / 2;
            remainder = decimal % 2;
            decimal /= 2;
            reversed += String.valueOf(remainder);
        }

        for (int i = reversed.length() - 1; i >= 0; i--)
            binary += String.valueOf(reversed.charAt(i));
        
        return Integer.valueOf(binary);
    }

    /**
     * Decimal to other bases
     * @param 
     */
    public static int decimal2OtherBases(int decimal, int base) {
        
    }

    public static void main(String[] args) {
        int decimalNumber = 13;
        int binary = decimal2Binary(decimalNumber);
        System.out.println(binary);
        System.exit(0);
    }
}