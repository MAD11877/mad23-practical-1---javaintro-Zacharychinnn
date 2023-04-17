import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    
     
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int num = in.nextInt();
    while (num>0)
      {
        for (int i = 1; i<=num; i++)
          {
            System.out.print("*");
          }
        System.out.print("\n");
        num--;
    
  }
}
