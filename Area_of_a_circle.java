import java.util.Scanner;
public class Circle{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = (3.14)*(a)*(a);
        System.out.printf("%.2f",b);
    }
}