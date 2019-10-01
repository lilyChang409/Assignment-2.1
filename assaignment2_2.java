import java.util.Scanner;
public class assaignment2_2
{
 public static void main(String[] args){

     Scanner sc=new Scanner(System.in);
     System.out.println("the test was out of? ");
     double a=sc.nextInt();
     System.out.println("what did you get?");
     double b=sc.nextInt();
     double c=((b/a)*100);
     System.out.println("your score is: "+c+"%");
     
     if(c>=86 &&c<=100){
         System.out.println("that's A,Great Job! ");}
         else if(c<=85.0 &&c>=73.0){
             System.out.println("that's B,Pretty good! ");
            }
            else if(c>=67.0 &&c<=72.0){
             System.out.println("C+... Maybe try harder next time? ");}
            else if(c<=66.0 &&c>=60.0){
                System.out.println("C... I knew you could do better! ");
            }
           else if (c<=59.0 && c>=50.0){
            System.out.println("C-... Human, I expect better from you! ");}
            
            else if(c<=49.0 && c>=0.0){
                System.out.println("F, I don't know what to say anymore! ");}
                else {
                System.out.println("that's not possible human, stop joking!");}
                }
    }
    

