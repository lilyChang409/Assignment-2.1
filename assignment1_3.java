import java.util.Scanner;
public class assignment1_3
{
  public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Calculate the interest!");
      System.out.println("the principal: ");
      double a= sc.nextInt();
      System.out.println("the interest rate: ");
      double b= sc.nextDouble();
      System.out.println("the time: ");
      double c=sc.nextInt();
      double d= a*(Math.pow((1+b),c));
      System.out.println("the amount is "+d);
    }
}
