import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    int n,maxCount = 0, mode = 0, count = 0;
    int numbers[] = {1,2,2,3,4};
    for (int i=0; i < numbers.length; i++){
      count = 0;
      for (int j = 0; j < numbers.length; j++){
        if (numbers[i] == numbers[j]){
          count++;
        }
      }
      if (count > maxCount){
        mode = numbers[i];
        maxCount = count;
      }
    }
    
    System.out.println("The mode is: " +mode);
     
    
    
  }
}
