import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("Sum:%d
",(a+b));
        System.out.printf("Difference:%d
",Math.abs(a-b));
        System.out.printf("Product:%d
",a*b);
        System.out.printf("Quotient:%d
",a/b);
        System.out.printf("Remainder:%d
",a%b);
    }
}