    import java.util.Scanner;
    public class AddDigit{
     
     public static void main(String []arg) {
     Scanner input=new Scanner(System.in);

     System.out.print("Enter an Integer between 0 and 1000:");
     int num=input.nextInt();
    
            int sum=1;
            sum+= num% 10;
   
            num/= 10;
            sum+= num% 10;
 
            num/=10;
            sum+= num%10;
  
   System.out.println("Total of Digits:" +sum);
      
   
     }
 

       }
     
