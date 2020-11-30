import java.util.Scanner;
public class MultiplicationTable{
 public static void main(String[] args){
   int c=1;
   Scanner myObj=new Scanner(System.in);
   System.out.println("Enter a number:");
   int n=myObj.nextInt();
   while(c<=10)
   {
    System.out.println(n+"*"+c+"="+n*c+"\n");
    c=c+1;
   }
    
  }

}