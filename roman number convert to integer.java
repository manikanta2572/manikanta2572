import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String roman = sc.nextLine().toUpperCase();
        int decimal = 0;
        int lastNumber = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            char ch = roman.charAt(i);
            int number = romanToInt(ch);
            if (number < lastNumber) {
                decimal -= number;
            } else {
                decimal += number;
            }
            lastNumber = number;
        }
        System.out.println("The integer value of " + roman + " is " + decimal);
    }

    public static int romanToInt(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}
