import java.util.Scanner;

public class Hello {

public static int summation(int a,int b){
      return (a+b);
}

public static void main(String a[])
{
    int a,b,res;
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter a:");
    a = sc.nextInt();
    System.out.print("Enter b:");
    b = sc.nextInt();
    res = Hello.summation(a,b);
    System.out.print("res = " + res);
}

}
