import java.util.Scanner;

class Main {

   public static boolean isArmstrong(int input) {
       String inputAsString = input + "";
       int numberOfDigits = inputAsString.length();
       int copyOfInput = input;
       int sum = 0;
       while (copyOfInput != 0) {
           int lastDigit = copyOfInput % 10;
           sum = sum + (int) Math.pow(lastDigit, numberOfDigits);
           copyOfInput = copyOfInput / 10;
       }
       if (sum == input) {
           return true;
       } else {
           return false;
       }
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int inputNumber = scanner.nextInt();
       boolean result = isArmstrong(inputNumber);
       if (result) {
           System.out.println("Armstrong Number");
       } else {
           System.out.println("Not a Armstrong Number");
       }
   }
}   