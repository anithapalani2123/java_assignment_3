package question2;

import java.util.Scanner;
public class example
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyCalculator num = new MyCalculator();
        System.out.println(num.divisor_sum(n)+"\n");
    }
}