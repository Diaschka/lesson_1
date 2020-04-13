
public class Main {
    public static void main(String[] args) {

        // п.2
        byte a = 1;
        short b;
        b = 1101;

        int c = 1234567;
        long e = 222222333333L;

        float f = 0.98f;
        double d = 0.99;

        char l = 'a';

        boolean t = true;

    }

   // п. 3
   public static int operations (int a, int b, int c, int d) {
       return a * (b + (c / d));
   }
        /*или
        int result = a * (b + (c / d));
        return result;*/

    // п. 4
    public static boolean isTrue(int a, int b) {
        int sum = a + b;
        return sum <= 20 && sum >= 10;
    }

    // п.5
   public static void number(int num) {
        if(num >=0) {
            System.out.println(num + " положительно.");
        } else {
            System.out.println(num + " отрицательно.");
        }
    }

    //  п. 6
    public static boolean negative(int n) {
        return n < 0;
    }

    // п.7
    // printHello(Kate);

    public static void printHello(String anyName) {
       System.out.println("Hello, " + anyName + "!");
    }

    // п.8
   // checkIfYearIsLeap(2000);

    public static void checkIfYearIsLeap (int yearNumber) {
        boolean isLeap = (yearNumber % 400 == 0 || (yearNumber % 4 == 0 && yearNumber % 100 != 0));
        if (isLeap) {
            System.out.println("the year " + yearNumber + " is leap.");
        } else {
            System.out.println("The year " + yearNumber + " is not leap.");
        }
        }

}
