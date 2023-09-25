import java.util.Scanner;

public class AIML {

public static int addition(int a,int b){
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
    res = Hello.addition(a,b);
    System.out.print("res = " + res);
}

}