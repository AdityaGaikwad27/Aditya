package OperaterDemo;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,add;
        System.out.println("Enter a value:");
        a= sc.nextInt();
        System.out.println("Enter b value:");
        b= sc.nextInt();
        add=a+b;
        System.out.println("add is"+add);

    }
    
}
