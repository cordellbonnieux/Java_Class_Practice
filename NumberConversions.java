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

    /**
     * Converts any base (16 - 2) to decimal
     * @param num string representation of a number (can include characters)
     * @param base integer base of the string number
     * @return integer the decimal number converted from the string num
     */
    public static int base2Decimal(String num, int base) {
        //String num = String.valueOf(number);
        int decimal = 0;
        for (int i = num.length() - 1, j = 0; i >= 0 ; i--, j++) {
            switch (num.charAt(j)) {
                case 'A': decimal += 10 * ((i > 0) ? Math.pow(base, i) : 1);
                    break;
                case 'B': decimal += 11 * ((i > 0) ? Math.pow(base, i) : 1);
                    break;
                case 'C': decimal += 12 * ((i > 0) ? Math.pow(base, i) : 1);
                    break;
                case 'D': decimal += 13 * ((i > 0) ? Math.pow(base, i) : 1);
                    break;
                case 'E': decimal += 14 * ((i > 0) ? Math.pow(base, i) : 1);
                    break;
                case 'F': decimal += 15 * ((i > 0) ? Math.pow(base, i) : 1);
                    break;
                default: decimal += Character.getNumericValue(num.charAt(j)) * ((i > 0) ? Math.pow(base, i) : 1);
            }
        }

        return decimal;
    }

    public static void main(String[] args) {

        int decimalNumber = 13;

        String binary = decimal2Base(decimalNumber, 2),
            octal = decimal2Base(decimalNumber, 8),
            hex = decimal2Base(decimalNumber, 16);

        System.out.println("decimal: " + decimalNumber);
        System.out.println("binary: " + binary);
        System.out.println("octal: " + octal);
        System.out.println("hex: " + hex);

        System.out.println("numbers in other bases, in decimal:");
        int num1 = base2Decimal("FA49", 16);
        System.out.println("FA49_16: " + num1);
        int num2 = base2Decimal("E977", 15);
        System.out.println("E977_15: " + num2);
        int num3 = base2Decimal("DD", 14);
        System.out.println("DD_14: " + num3);
        int num4 = base2Decimal("AC", 13);
        System.out.println("AC_13: " + num4);
        int num5 = base2Decimal("B0B", 12);
        System.out.println("B0B_12: " + num5);
        int num6 = base2Decimal("A49", 11);
        System.out.println("A49_11: " + num6);        

        System.exit(0);
    }
}