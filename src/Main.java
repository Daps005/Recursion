//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int val = 1020;

        int sum = find_Sum_of_Digits(val);
        System.out.println("Sum is " + sum);
        System.out.println("The reverse is " + reverse_String("JAVA"));
        System.out.println("The sum of natural number is " + sum_of_Nat_Numbers(23));
        System.out.println("The factorial is " + factorial(5));


    }
    public static int find_Sum_of_Digits(int values){


        // values = 0
        if (values == 0){
            return 0;}
        else {
            // Recursive formulation
            return values%10 + find_Sum_of_Digits(values/10);
        }

    }
    // 123 = 3 + find_Sum_of_Digits(12)
    // find_Sum_of_Digits(12) = 2 + find_Sum_of_Digits(1)
    // find_Sum_of_Digits(0) = 1 + find_Sum_of_Digits(0)
    // find_Sum_of_Digits(0) = 0
    // find_Sum_of_Digits(1) = 1 + 0
    // find_Sum_of_Digits(12) = 2 + 1
    // find_Sum_of_Digits(123) = 3 + 3

    public static String reverse_String(String str){
        if(str.length() <= 1) {
            return str;
        }
        else {
            return  reverse_String(str.substring(1)) + str.charAt(0) ;
        }


            }
    public static int sum_of_Nat_Numbers (int n){
        if (n ==0)
            return 0;
        else {
            return n + sum_of_Nat_Numbers(n-1);
        }
    }
    public static long factorial (int n){
        if (n ==0 || n == 1)
            return 1;
        else {
            return n * factorial(n - 1);
        }
        }
    }


