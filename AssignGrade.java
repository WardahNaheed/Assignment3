import java.util.Scanner;
public class AssignGrade{
 public static void main(String[] args){
   Scanner myObj=new Scanner(System.in);
   System.out.println("Enter your score:");
   int score=myObj.nextInt();
   if(score>=90)
    System.out.println("Your grade is A.");
   else if(score>=80)
    System.out.println("Your grade is B.");
   else if(score>=70)
    System.out.println("Your grade is C.");
   else if(score>=60)
    System.out.println("Your grade is D.");
   else
    System.out.println("Your grade is F.");
 }
}