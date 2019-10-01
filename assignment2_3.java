import java.util.Scanner;
public class assignment2_3
{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("ask a question!");
       String ques=sc.next();
      int k=(int)((Math.random()*19)+1);
      if(k==1){
          System.out.println(" As I see it, yes.");
        }else if(k==2){
            System.out.println(" Ask again later.");
        }else if (k==3){
            System.out.println("Better not tell you now.");
        }else if(k==4){
         System.out.println("Cannot predict now."); 
        }else if(k==5){
            System.out.println("Concentrate and ask again.");
            
        }else if(k==6){
         System.out.println("Don’t count on it.");
         
        }else if(k==7){
         System.out.println("It is certain.");   
        }else if(k==8){
        System.out.println("It is decidedly so.");
    }else if(k==9){
    System.out.println(" Most likely.");
    }else if(k==10){
     System.out.println(" My reply is no.");   
    }else if(k==11){
     System.out.println("My sources say no.");   
    }else if(k==12){
     System.out.println("Outlook not so good.");   
    }else if (k==13){
        System.out.println("Reply hazy, try again.");
    }else if(k==14){
        System.out.println("Outlook good.");
    }else if(k==15){
     System.out.println("Signs point to yes.");   
    }else if(k==16){
        System.out.println("Very doubtful.");   
    }else if(k==17){
     System.out.println("without a doubt");   
    }
    else if(k==18){
      System.out.println("Yes");      
    }else if(k==19){
      System.out.println("Yes,definitely");      
    }else 
    System.out.println("You might rely on it.");
        }
       
    }
   

