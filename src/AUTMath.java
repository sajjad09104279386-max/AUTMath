
public class AUTMath {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        int result = 0;

        for (int i = 0; i < Math.abs(num2); i++) {
            result += num1;
        }

        if (num2 < 0) {
            result = -result;
        }

        return result;
    }

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return num1 / num2;
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static int pow(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * pow(base, power - 1);
    }
}

