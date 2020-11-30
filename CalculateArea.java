import java.util.Scanner;
public class CalculateArea{
 public static int Area(int b, int h){
   int a;
   a=(b*h)/2;
   return a;
}

 public static void main(String[] args){
   int ar;
   Scanner myObj=new Scanner(System.in);
   System.out.println("Enter Base and Height :");
   int base=myObj.nextInt();
   int height=myObj.nextInt();
   ar=Area(base,height);
   System.out.println("Area of triangle is: "+ar);
  }
}

