import java.util.Scanner;
public class SumOfSquares{
 public static void main(String[] args){
   int sum=0;
   Scanner myObj=new Scanner(System.in);
   System.out.println("Enter a number:");
   int n=myObj.nextInt();
   for(int c=1;c<=n;c++)
    sum=sum+(c*c);
   System.out.println("Sum is "+sum);
  }

}