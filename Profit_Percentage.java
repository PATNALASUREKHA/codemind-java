import java.util.Scanner;
public class Profit{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double profit = b-a;
        double percent = (profit/a)*100;
        System.out.printf("%.2f",percent);
    }
}