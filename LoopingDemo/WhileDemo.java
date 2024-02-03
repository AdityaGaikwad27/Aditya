package LoopingDemo;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.printf("The given %d is even\n", i);
            } else {
                System.out.printf("The given %d is odd\n", i);
            }
            i++;
        }
    }
}
