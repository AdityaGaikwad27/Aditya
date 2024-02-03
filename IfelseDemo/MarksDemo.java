package IfelseDemo;

import java.util.Scanner;

public class MarksDemo 
{
    public static void main(String[] args) 
    {
        int marks;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks");
        marks=sc.nextInt();
        if(marks>=70)
        {
            System.out.println("Grade o");
        }
        else if (marks<70 && marks>60)
        {
            System.out.println("Grade A");    
        }
        else if (marks<60 && marks>50) 
        {
            System.out.println("Grade B");
        }
        else if (marks<50 && marks>40)
        {
            System.out.println("Grade C");   
        }
        else
        {
            System.out.println("Grade F");
        }

    }
}
 