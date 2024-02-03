package SwitchDemo;

import java.util.Scanner;

import OperaterDemo.scanner;

public class AlphabetsExample {
    public static void main(String[] args) {
        System.out.println("Enter your fav color");
        Scanner sc=new Scanner(System.in);
        String color=sc.next();
        switch (color) {
            case "B":
                System.out.println("You like black color");
                break;
            case "R":
                System.out.println("You like red color");
                break;
            case "G":
                System.out.println("You like blue color");
                break;
            default:
            System.out.println("You dont like anything");
                break;
        }
    }
}
