import java.util.Scanner;

public class permutationNcombination {
    static long factorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter r: ");
        int r = in.nextInt();
        int p = (int)(factorial(n) / factorial(n - r));
        int c = (int)(factorial(n) 
                      / (factorial(n - r) * factorial(r)));
        System.out.println("Permutation = " + p);
        System.out.println("Combination = " + c);
    }
}
