import java.util.Scanner;
public class Prob3 {

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
  
      System.out.println("Enter the number of students: ");
      int numOfStudents = scan.nextInt();

      System.out.print("Enter a student name: ");
      String student1 = scan.nextLine();
      System.out.print("Enter a student score: ");
      double score1 = scan.nextDouble();

      for (int i = 0; i < numOfStudents - 1; i++) {
        System.out.print("Enter a student name: ");
        String student = scan.nextLine();

        System.out.print("Enter a student score: ");
        if (score > score1) {
          student1 = student;
          score1 = score;
        }
      } 

  }
}