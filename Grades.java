import java.util.Scanner;
public class Grade{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = ((a+b+c+d+e)*(100))/(500);
        if(f>=90){
        System.out.printf("Grade A");}
        else if(f>=80){
        System.out.printf("Grade B");}
        else if(f>=70){
        System.out.printf("Grade C");}
        else if(f>=60){
        System.out.printf("Grade D");}
        else if(f>=40){
        System.out.printf("Grade E");}
        else if(f<40){
        System.out.printf("Grade F");
        }
    }
}