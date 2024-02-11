import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1: " + task1(1));
        System.out.println("Task 2: " + task2(1));
        System.out.println("Task 3: " + task3(1));
        System.out.println("Task 4: " + task4(1));
        System.out.println("Task 5: " + task5(1));
        System.out.println("Task 6: " + task6(1));
        System.out.println("Task 7: " + task7("test"));
        System.out.println("Task 8: " + task8(1));
        System.out.println("Task 9: " + task9(true));
        System.out.println("Task 10: " + task10(true));
        System.out.println("Task 11: " + task11(5));
        System.out.println("Task 12: " + task12(5));
        System.out.println("Task 13: " + task13(1, 3));
        System.out.println("Task 14: " + task14(7, 6));
        System.out.println("Task 15: " + task15());
        System.out.println("Task 16: " + task16());
        System.out.println("Task 17: " + task17());
        System.out.println("Task 18: " + task18("abcde"));
        System.out.println("Task 19: " + task19("12345"));
        System.out.println("Task 20: " + task20("123"));
        System.out.println("Task 21: " + task21("123456"));
        //task 2
        int n = 5;
        int result = calculateFibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }

    public static String task1(int a) {
        return (a == 0) ? "correct" : "incorrect";
    }

    public static String task2(int a) {
        return (a > 0) ? "correct" : "incorrect";
    }

    public static String task3(int a) {
        return (a < 0) ? "correct" : "incorrect";
    }

    public static String task4(int a) {
        return (a >= 0) ? "correct" : "incorrect";
    }

    public static String task5(int a) {
        return (a <= 0) ? "correct" : "incorrect";
    }

    public static String task6(int a) {
        return (a != 0) ? "correct" : "incorrect";
    }

    public static String task7(String a) {
        return (a.equals("test")) ? "correct" : "incorrect";
    }

    public static String task8(int a) {
        return (a == 1) ? "correct" : "incorrect";
    }

    public static String task9(Boolean test) {
        return (test) ? "correct" : "incorrect";
    }

    public static String task10(Boolean test) {
        return (!test) ? "correct" : "incorrect";
    }

    public static String task11(int a) {
        return (a > 0 && a < 5) ? "correct" : "incorrect";
    }

    public static String task12(int a) {
        if (a == 0 || a == 2) {
            a += 7;
        } else {
            a /= 10;
        }
        return "new a:" + a;
    }

    public static String task13(int a, int b) {
        return (a <= 1 && b >= 3) ? "sum:" + (a + b) : "sub:" + (a - b);
    }

    public static String task14(int a, int b) {
        return ((a > 2 && a < 11) || (b >= 6 && b < 14)) ? "correct" : "incorrect";
    }

    public static String task15() {
        int num = new Random().nextInt(4) + 1;
        String result;

        switch (num) {
            case 1:
                result = "winter";
                break;
            case 2:
                result = "spring";
                break;
            case 3:
                result = "summer";
                break;
            case 4:
                result = "autumn";
                break;
            default:
                result = "inccorect for num";
        }

        return "Value num: " + num + "\nResult for variable num: " + result;
    }

    public static String task16() {
        int day = new Random().nextInt(32) + 1;

        if (day >= 1 && day <= 10) {
            return "Первая декада месяца:" + day;
        } else if (day >= 11 && day <= 20) {
            return "Вторая декада месяца:" + day;
        } else if (day >= 21 && day <= 31) {
            return "Третья декада месяца:" + day;
        } else {
            return "Некорректное значение дня месяца";
        }
    }

    public static String task17() {
        int month = new Random().nextInt(12) + 1;

        if (month >= 1 && month <= 12) {
            String season;
            if (month >= 3 && month <= 5) {
                season = "spring";
            } else if (month >= 6 && month <= 8) {
                season = "summer";
            } else if (month >= 9 && month <= 11) {
                season = "autumn";
            } else {
                season = "winter";
            }
            return "Пора года для месяца " + month + ": " + season;
        } else {
            return "Некорректное значение месяца";
        }
    }

    public static String task18(String str) {
        return (str.length() > 0 && str.charAt(0) == 'a') ? "yup" : "nah";
    }

    public static String task19(String str) {
        if (str.length() > 0) {
            char firstChar = str.charAt(0);
            return (firstChar == '1' || firstChar == '2' || firstChar == '3') ? "yup" : "nah";
        } else {
            return "pustota";
        }
    }

    public static String task20(String str) {
        if (str.length() == 3) {
            int digit1 = Character.getNumericValue(str.charAt(0));
            int digit2 = Character.getNumericValue(str.charAt(1));
            int digit3 = Character.getNumericValue(str.charAt(2));
            int sum = digit1 + digit2 + digit3;
            return "Сумма цифр: " + sum;
        } else {
            return "Строка не содержит 3 цифры";
        }
    }

    public static String task21(String str) {
        if (str.length() == 6) {
            int digit1 = Character.getNumericValue(str.charAt(0));
            int digit2 = Character.getNumericValue(str.charAt(1));
            int digit3 = Character.getNumericValue(str.charAt(2));
            int digit4 = Character.getNumericValue(str.charAt(3));
            int digit5 = Character.getNumericValue(str.charAt(4));
            int digit6 = Character.getNumericValue(str.charAt(5));
            int sumFirstThree = digit1 + digit2 + digit3;
            int sumLastThree = digit4 + digit5 + digit6;
            return (sumFirstThree == sumLastThree) ? "yup" : "nah";
        } else {
            return "Строка не содержит 6 цифр";
        }
    }

    //task 2
    public static int calculateFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}