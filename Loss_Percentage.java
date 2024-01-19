import java.util.Scanner;
public class Loss{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double loss = a-b;
        double percent = (loss/a)*100;
        System.out.printf("%.2f",percent);
        }
}