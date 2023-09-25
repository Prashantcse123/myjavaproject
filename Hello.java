import java.util.Scanner;

public class Hello {

public static void main(String a[])
{
    float a,b,res;
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter a:");
    a = sc.nextFloat();
    System.out.print("Enter b:");
    b = sc.nextFloat();
    System.out.print("res = " + (a+b));
}

}
