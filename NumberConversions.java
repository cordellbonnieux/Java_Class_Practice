public class NumberConversions {
    /**
     * Converts a decimal to any base from 2 to 16
     * example: 13_10 == ?_2
     * 13 / 2 = 6, remainder = 1
     * 6 / 2 = 3, remainder = 0
     * 3 / 2 = 1, remainder = 1
     * 1 / 2 = 0, remainder = 1
     * @param int decimal number
     * @return string representing the converted decimal number 
     */
    public static String decimal2Base(int decimal, int base) {
      
        int quotient = decimal, remainder = 0;
        String answer = "", reversed = "";

        while (quotient > 0) {
            quotient = decimal / base;
            remainder = decimal % base;
            decimal /= base;

            switch (remainder) {
                case 10: reversed += "A";
                    break;
                case 11: reversed += "B";
                    break;
                case 12: reversed += "C";
                    break;
                case 13: reversed += "D";
                    break;
                case 14: reversed += "E";
                    break;
                case 15: reversed += "F";
                    break;
                default: reversed += String.valueOf(remainder);
            }
            
        }

        for (int i = reversed.length() - 1; i >= 0; i--)
            answer += String.valueOf(reversed.charAt(i));
         
        
        return answer;
    }

    public static void main(String[] args) {

        int decimalNumber = 13;

        String binary = decimal2Base(decimalNumber, 2),
            octal = decimal2Base(decimalNumber, 8),
            hex = decimal2Base(decimalNumber, 16);

        System.out.println("binary: " + binary);
        System.out.println("octal: " + octal);
        System.out.println("hex: " + hex);

        System.exit(0);
    }
}