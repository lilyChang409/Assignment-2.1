import java.util.Scanner;
public class assignment1_2
{
   public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("the distance between 2 point");
    System.out.println("the x for the first point: ");
    double a=sc.nextInt();
    System.out.println("the y for the first point: ");
    double b=sc.nextInt();
    System.out.println("the x for the second point: ");
    double c=sc.nextInt();
    System.out.println("the y for the second point: ");
    double d=sc.nextInt();
    double e=Math.sqrt((Math.pow((c-a),2))+(Math.pow((d-b),2)));
    System.out.println("the distance is: "+e);
    }
}
