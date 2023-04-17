import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter your height (in m): ");
    double height = in.nextDouble();
    System.out.print("Please enter your weight (in kg): ");
    int weight = in.nextInt();
    double BMI = weight / (height * height);
    System.out.print(BMI);
     
    
  }
}
