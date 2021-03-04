import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){
  
  scanner scan = new Scanner(System.in);
  System.out.println("Enter a number of Grades ");

  int times = scan.nextInt();
  int sumOfGrades = 0;


  for (int i = 0; i <= times;i++) {
    System.out.println("Enter grade: " + i + "-->");
    int grade = scan.nextInt();

    sumOfGrades += grade;

  }
  

  System.out.println("The sum of the grade is: " + sumOfGrades)

  }
  

}