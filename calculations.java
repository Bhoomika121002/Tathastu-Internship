import java.util.Scanner;
public class calculations {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;5
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("\nThe result using above operations is as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}